package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SUPP_REQUESTS
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int Request_ID;
	private String emailid;
	private String software;
	private String os;
	private String problem;
	public int getRequest_ID() {
		return Request_ID;
	}
	public void setRequest_ID(int request_ID) {
		//request_ID+=request_ID+1;
		Request_ID = request_ID;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	
}
