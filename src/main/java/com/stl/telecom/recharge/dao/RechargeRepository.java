package com.stl.telecom.recharge.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.telecom.recharge.entity.RechargePlans;

public interface RechargeRepository extends JpaRepository<RechargePlans, Long>{

}
