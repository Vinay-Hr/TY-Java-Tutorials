package com.te.assignment5.JobPortal;

public class Candidate implements Comparable<Candidate> {

	String email;
	String name;
	int sslc;
	int pu;
	int be;
	
	public Candidate(String email, String name, int sslc, int pu, int be) {
		super();
		this.email = email;
		this.name = name;
		this.sslc = sslc;
		this.pu = pu;
		this.be = be;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSslc() {
		return sslc;
	}

	public void setSslc(int sslc) {
		this.sslc = sslc;
	}

	public int getPu() {
		return pu;
	}

	public void setPu(int pu) {
		this.pu = pu;
	}

	public int getBe() {
		return be;
	}

	public void setBe(int be) {
		this.be = be;
	}

	@Override
	public int compareTo(Candidate o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Candidate [email=" + email + ", name=" + name + ", sslc=" + sslc + ", pu=" + pu + ", be=" + be + "]";
	}
	
	
}