package com.springboot.wecare.model;

public class givePills extends ClientServicesCostDecorator {
	
	
	
	public givePills(ClientServicescost cs) {
		super(cs);
	}
	
	public String getDescripton() {
		return cs.getDescripton()+" + give Pills";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5.0+ super.cost();	}

}
