package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //this class is a table
@Table(name = "address") //access : wecare.client

public class Address {
	
	@Id //next thing will be a primary key
	@Column(name = "addressId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;  

	@Column(name = "addressFirstLine")
	private String addrFirLine;
	
	@Column(name = "addressSecondLine")
	private String addrSecLine;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "county")
	private String county;	
	
	@Column(name = "eircode")
	private String eircode;

	public Address(long addressId, String addrFirLine, String addrSecLine, String city, String county, String eircode) {
		super();
		this.addressId = addressId;
		this.addrFirLine = addrFirLine;
		this.addrSecLine = addrSecLine;
		this.city = city;
		this.county = county;
		this.eircode = eircode;
	}

	public String getAddrFirLine() {
		return addrFirLine;
	}

	public void setAddrFirLine(String addrFirLine) {
		this.addrFirLine = addrFirLine;
	}

	public String getAddrSecLine() {
		return addrSecLine;
	}

	public void setAddrSecLine(String addrSecLine) {
		this.addrSecLine = addrSecLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getEircode() {
		return eircode;
	}

	public void setEircode(String eircode) {
		this.eircode = eircode;
	}

	public long getAddressId() {
		return addressId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addrFirLine=" + addrFirLine + ", addrSecLine=" + addrSecLine
				+ ", city=" + city + ", county=" + county + ", eircode=" + eircode + "]";
	}
	
}
