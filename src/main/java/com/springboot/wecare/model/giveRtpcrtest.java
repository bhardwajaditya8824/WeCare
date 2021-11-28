package com.springboot.wecare.model;

public class giveRtpcrtest extends ClientServicesCostDecorator {
	
	
	
	public giveRtpcrtest(ClientServicescost cs) {
		super(cs);
	}
	
	public String getDescripton() {
		return cs.getDescripton()+" + give RTPCR test";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10.0+ super.cost();	}

}
