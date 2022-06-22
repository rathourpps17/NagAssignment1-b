package com.assign.assign9rest.Dao;





import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.assign9rest.model.Authors;



public interface AuthorsRepository extends JpaRepository<Authors, Integer> {

}
