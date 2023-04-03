package com.stl.telecom.recharge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recharge")
public class RechargePlans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long planId;
	private String planName;
	private String planPrice;
	private String planValidity;
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanPrice() {
		return planPrice;
	}
	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}
	public String getPlanValidity() {
		return planValidity;
	}
	public void setPlanValidity(String planValidity) {
		this.planValidity = planValidity;
	}
	public RechargePlans(long planId, String planName, String planPrice, String planValidity) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planPrice = planPrice;
		this.planValidity = planValidity;
	}
	public RechargePlans() {
		super();
	}
	
	
}
