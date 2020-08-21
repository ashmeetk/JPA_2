package com.newthinktank.JEETut3;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CustID", unique = true)
	private int id;
	
	@Id
	@Column(name = "firstName", nullable = false)
	private String fName;
	
	@Id
	@Column(name = "lastName", nullable = false)
	private String lName;
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	
	public String getFName()
	{
		return this.fName;
	}
	
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	
	public String getLName()
	{
		return this.lName;
	}
	
	
}
