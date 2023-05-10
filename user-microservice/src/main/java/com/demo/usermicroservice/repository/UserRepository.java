package com.demo.usermicroservice.repository;

import com.demo.usermicroservice.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <UserEntity,String > {

}
