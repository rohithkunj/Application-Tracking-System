package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Feedback1;

public interface Feedback1Service {

	void deleteEmployeeFeedbackById(long id);

	Feedback1 getEmployeeFeedbackById(long id);

	void saveFeedback(Feedback1 feedback1);

	Page<Feedback1> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);

	List<Feedback1> getAllFeedback();

}
