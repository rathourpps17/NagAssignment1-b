package com.assign.assign9rest.Dao;




import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.assign9rest.model.Books;


public interface BooksRepository extends JpaRepository<Books, Integer> {

}
