package com.test.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long>{
	
	@Query("select u from UserData u where u.username =:n")
	List<UserData> findByName(@Param("n") String name);
	
	@Query("select u from UserData u where u.username =:n")
	UserData findByNames(@Param("n") String name);
	

	
	@Query("select u from UserData u where u.username =:n and u.password =:j")
	List<UserData> findByNamess(@Param("n") String name, @Param("j") String password);
}
