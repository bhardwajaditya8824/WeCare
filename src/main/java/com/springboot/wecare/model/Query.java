package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "query")
public class Query {
	@Id
	@Column(name = "query_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queryId;

	@Column(name = "query_description")
	private String queryDescription;

	@Column(name = "query_response")
	private String queryResponse;

	@Column(name = "query_answered")
	private Boolean isQueryAnswered;

	@Column(name = "client_id")
	private int clientID;

	@Column(name = "caregiver_id")
	private int caregiverID;

	@Column(name = "manager_id")
	private int managerID;

	public Query() {
		super();
	}

	public Query(Long queryId, String queryDescription, String queryResponse, Boolean isQueryAnswered, int clientID,
			int caregiverID, int managerID) {
		super();
		this.queryId = queryId;
		this.queryDescription = queryDescription;
		this.queryResponse = queryResponse;
		this.isQueryAnswered = isQueryAnswered;
		this.clientID = clientID;
		this.caregiverID = caregiverID;
		this.managerID = managerID;
	}

	public Long getQueryId() {
		return queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	public String getQueryDescription() {
		return queryDescription;
	}

	public void setQueryDescription(String queryDescription) {
		this.queryDescription = queryDescription;
	}

	public String getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(String queryResponse) {
		this.queryResponse = queryResponse;
	}

	public Boolean getIsQueryAnswered() {
		return isQueryAnswered;
	}

	public void setIsQueryAnswered(Boolean isQueryAnswered) {
		this.isQueryAnswered = isQueryAnswered;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getCaregiverID() {
		return caregiverID;
	}

	public void setCaregiverID(int caregiverID) {
		this.caregiverID = caregiverID;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	@Override
	public String toString() {
		return "Query [queryId=" + queryId + ", queryDescription=" + queryDescription + ", queryResponse="
				+ queryResponse + ", isQueryAnswered=" + isQueryAnswered + ", clientID=" + clientID + ", caregiverID="
				+ caregiverID + ", managerID=" + managerID + "]";
	}

}