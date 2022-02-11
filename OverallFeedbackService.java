package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.OverallFeedback;

public interface OverallFeedbackService {

	Page<OverallFeedback> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);

	List<OverallFeedback> getAllFeedback();

	void saveOverallFeedback(OverallFeedback overallfeedback);

	OverallFeedback getEmployeeOverallFeedbackById(long id);



	void deleteEmployeeOverallFeedbackById(long id);

}
