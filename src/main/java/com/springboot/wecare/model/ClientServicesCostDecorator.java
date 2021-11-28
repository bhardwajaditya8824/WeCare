package com.springboot.wecare.model;

public class ClientServicesCostDecorator extends ClientServicescost {
	
	ClientServicescost cs;
	
	public ClientServicesCostDecorator(ClientServicescost cs) {
		this.cs=cs;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return cs.cost();
	}

}
