package com.graphql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{

	@Query("from Job where job = ?1")
	public Object getbyjob(String name);
}
