package com.graphql;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.types.GraphQLType;

@Entity
@GraphQLType
public class Job {
	
	@Id
	@GraphQLQuery(name = "id")
	private int id;
	@GraphQLQuery(name = "job")
	private String job;
	@GraphQLQuery(name = "experience")
	private int experience;
	
	public int getId() {
		return id;
	}
	public void setJobId(int id) {
		this.id = id;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Job(int id,String job, int experience) {
		this.id = id;
		this.job = job;
		this.experience = experience;
	}
	public Job() {
	 
	}
	

}
