package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //annotation for table class this class is a table
@Table(name = "payment")
public class Payment {

	
	@Id
	@Column(name = "payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentid;
	
	@Column(name = "payment_amount")
	private String paymentamount;
	
	@Column(name = "payment_type")
	private String paymenttype;
	
	@Column(name = "client_id")
	private int clientid;
	
	public Payment() {
		super();
	}
	
	public Payment(int paymentid, String paymentamount, String paymenttype, int clientid) {
		super();
		this.paymentid = paymentid;
		this.paymentamount = paymentamount;
		this.paymenttype = paymenttype;
		this.clientid = clientid;
		
	}

	public long getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(long paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentamount() {
		return paymentamount;
	}

	public void setPaymentamount(String paymentamount) {
		this.paymentamount = paymentamount;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", paymentamount=" + paymentamount + ", paymenttype=" + paymenttype
				+ ", clientid=" + clientid + "]";
	}

}
