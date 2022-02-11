package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//@Query("SELECT e FROM Employee e WHERE CONCAT(e.firstName, ' ',e.lastName, ' ', e.email, ' ', e.Title) LIKE %?1%")
// public List<Employee> getAllEmployees(String keyword);

	@Query(value = "select * from Employees e where e.candidatename like %:keyword% or e.email like %:keyword% or e.title like %:keyword%", nativeQuery = true)
	List<Employee> findByKeyword(@Param("keyword") String keyword);

}

	
