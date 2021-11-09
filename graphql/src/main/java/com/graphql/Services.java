package com.graphql;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service 
@GraphQLApi
public class Services {

	@Autowired 
	Data repo;

	@GraphQLQuery(name="getpersons")
	public List<Person> getpersons(){
		return repo.findAll();
	} 
	
	@GraphQLQuery(name="getperson")
	public Object getperson(@GraphQLArgument(name="id") int id) {
		return repo.findById(id);
	}
	 
	@GraphQLMutation(name="postperson")
	public Object postperson(@GraphQLArgument(name="person") Person person) {
		return  repo.save(person);
		
	}
	

}
