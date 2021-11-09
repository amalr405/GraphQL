package com.graphql;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;
 

@Entity
public class Person {
	
	@Id
	@GraphQLQuery(name="id" )
	int id;
	@GraphQLQuery(name="fname" )
	String firstname;
	@GraphQLQuery(name="lname" )
	String lastname;
	@GraphQLQuery(name="age" )
	int age;
	@GraphQLQuery(name="jobid" )
	int jobid;
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public Person(int id, String firstname, String lastname, int age,int jobid) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.jobid = jobid;
	}
	public Person( ) {
		 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
