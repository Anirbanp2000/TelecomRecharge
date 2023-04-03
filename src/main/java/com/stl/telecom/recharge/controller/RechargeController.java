package com.stl.telecom.recharge.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stl.telecom.recharge.dao.RechargeRepository;
import com.stl.telecom.recharge.entity.RechargePlans;
import com.stl.telecom.recharge.service.RechargeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class RechargeController {

	@Autowired
	private RechargeRepository rechargeRepository;
	
	@Autowired
	private RechargeService rechargeService;
	
	@GetMapping("/allPlans")
	public List<RechargePlans> getAllRechargePlans(){
		return rechargeRepository.findAll();
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<RechargePlans> getRechargePlanById(@PathVariable long id){
//		Optional<RechargePlans> rechargePlans=rechargeRepository.findById(id);
//		if(rechargePlans.isPresent()) {
//			return ResponseEntity.ok().body(rechargePlans.get());
//		}
//		else {
//			return ResponseEntity.notFound().build();
//		}
//	}
	
	@GetMapping("/{id}")
	public RechargePlans getRechargePlansById(@PathVariable Long id) {
		return rechargeService.getRechargePlanById(id);
	}
	
	@PostMapping("/post")
	public ResponseEntity<RechargePlans> addRechargePlan(@RequestBody RechargePlans rechargeplans){
		RechargePlans saveRechargePlans=rechargeRepository.save(rechargeplans);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveRechargePlans);
	}
	
}
