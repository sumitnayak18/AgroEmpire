package com.mlm.agro.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.mlm.agro.entity.UserEntity;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, String>  {

	
	@Query("select mobileNo from user  where mobileNo = :title")
	List findByMobileNo(@Param("title") String title);
	 
	@Query("select user from user as user  where user.userId = :title1 and user.password = :title2")
	UserEntity findByUserAndPassword(@Param("title1") String userId, @Param("title2") String password );
	
}
