package net.javaguides.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.javaguides.springboot.model.Doc;
import net.javaguides.springboot.model.Employee;


public interface DocRepository  extends JpaRepository<Doc,Integer>{

	
	@Query(value = "select * from Docs e where e.docName like %:keyword% or e.docType like %:keyword% ", nativeQuery = true)
	List<Doc> findByKeyword(@Param("keyword") String keyword);

	
}

