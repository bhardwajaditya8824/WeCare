package com.springboot.wecare.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//javax = loose coupling 
@Entity //this class is a table
@Table(name = "cli") //access : wecare.cli

public class Client {

	@Id //next thing will be a primary key
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientId;

	@Column(name = "client_Fname") //first name / surname
	private String clientFName;
	
	@Column(name = "client_Sname")
	private String clientSName;
	
	@Column(name = "client_email")
	private String clientEmail;
	
	@Column(name = "client_dob")
	private String clientDob; //string or int in format YYYYMMDD?  
	
	@Column(name = "client_weight")
	private float clientWeight;

	@Column(name = "client_address_id")
	private long clientAddressId;
	
	@Column(name = "client_about")
	private String clientAbt; 
	
	@Column(name = "client_contact_no")
	private String clientNumber; //(max 31)
	
	@Column(name = "client_login_id")
	private int clientLoginId; //(max 31)
	
	public Client() {
		super();
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientFName() {
		return clientFName;
	}

	public void setClientFName(String clientFName) {
		this.clientFName = clientFName;
	}

	public String getClientSName() {
		return clientSName;
	}

	public void setClientSName(String clientSName) {
		this.clientSName = clientSName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientDob() {
		return clientDob;
	}

	public void setClientDob(String clientDob) {
		this.clientDob = clientDob;
	}

	public float getClientWeight() {
		return clientWeight;
	}

	public void setClientWeight(float clientWeight) {
		this.clientWeight = clientWeight;
	}

	public long getClientAddressId() {
		return clientAddressId;
	}

	public void setClientAddressId(long clientAddressId) {
		this.clientAddressId = clientAddressId;
	}

	public String getClientAbt() {
		return clientAbt;
	}

	public void setClientAbt(String clientAbt) {
		this.clientAbt = clientAbt;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getClientLoginId() {
		return clientLoginId;
	}

	public void setClientLoginId(int clientLoginId) {
		this.clientLoginId = clientLoginId;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientFName=" + clientFName + ", clientSName=" + clientSName
				+ ", clientEmail=" + clientEmail + ", clientDob=" + clientDob + ", clientWeight=" + clientWeight
				+ ", clientAddressId=" + clientAddressId + ", clientAbt=" + clientAbt + ", clientNumber=" + clientNumber
				+ ", clientLoginId=" + clientLoginId + "]";
	}

	public Client(Long clientId, String clientFName, String clientSName, String clientEmail, String clientDob,
			float clientWeight, long clientAddressId, String clientAbt, String clientNumber, int clientLoginId) {
		super();
		this.clientId = clientId;
		this.clientFName = clientFName;
		this.clientSName = clientSName;
		this.clientEmail = clientEmail;
		this.clientDob = clientDob;
		this.clientWeight = clientWeight;
		this.clientAddressId = clientAddressId;
		this.clientAbt = clientAbt;
		this.clientNumber = clientNumber;
		this.clientLoginId = clientLoginId;
	}

	
}
