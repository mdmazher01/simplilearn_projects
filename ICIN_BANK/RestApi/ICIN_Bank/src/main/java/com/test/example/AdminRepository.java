package com.test.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<AdminData, Long>{
		
	@Query("select u from AdminData u where u.name =:n")
	AdminData findByNames(@Param("n") String name);
}
