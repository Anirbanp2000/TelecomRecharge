package com.stl.telecom.recharge.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.telecom.recharge.dao.RechargeRepository;
import com.stl.telecom.recharge.entity.RechargePlans;

@Service
public class RechargeService {

	@Autowired
	private RechargeRepository rechargeRepository;
	
	public RechargePlans getRechargePlanById(Long id) {
		return rechargeRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Plans not found with id: "+id));
	}
}
