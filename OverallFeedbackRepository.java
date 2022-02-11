package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import net.javaguides.springboot.model.OverallFeedback;
@Repository
public interface OverallFeedbackRepository extends JpaRepository<OverallFeedback, Long>{  

}





	
