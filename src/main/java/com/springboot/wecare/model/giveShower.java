package com.springboot.wecare.model;

public class giveShower extends ClientServicesCostDecorator {
	
	
	
	public giveShower(ClientServicescost cs) {
		super(cs);
	}
	
	public String getDescripton() {
		return cs.getDescripton()+" + give Shower";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.0+ super.cost();	}

}
