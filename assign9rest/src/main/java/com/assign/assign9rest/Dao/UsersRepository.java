package com.assign.assign9rest.Dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UsersRepository extends JpaRepository<User, Integer> {

}
