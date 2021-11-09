package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service 
@GraphQLApi
public class JobService {
	
	@Autowired 
	JobRepo jobrepo;
	
	@GraphQLQuery
	public Job getjob(@GraphQLContext Person person){
	return jobrepo.getById(person.getJobid());
	}
	
//	@GraphQLQuery(name="getjobs")
//	public List<Job> getjobs(){
//		return jobrepo.findAll();
//	}
	
//	@GraphQLQuery(name="getjobbyid") 
//	public Object getjobbyid(@GraphQLArgument(name="id") int id) {
//		return jobrepo.findById(id);
//	} 
	
	@GraphQLQuery(name="getjobbyname")
	public Object getjobbyname(@GraphQLArgument(name="name") String name) {
		return jobrepo.getbyjob(name);
	}
	 
	@GraphQLMutation(name="postjob")
	public Object postjob(@GraphQLArgument(name="job") Job job) {
		return jobrepo.save(job);
		
	}
}
