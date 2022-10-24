package com.nestdigital.twitterbackend.Dao;

import com.nestdigital.twitterbackend.Model.TwitterModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TwitterDao extends CrudRepository<TwitterModel,Integer> {
    @Query(value = "SELECT `id`, `conpass`, `dob`, `emailid`, `name`, `password`, `phnum`, `place` FROM `users` WHERE `emailid`= :emailid AND `password` = :password",nativeQuery = true)
    List<TwitterModel> adduser (String emailid,String password);
}
