package net.javaguides.springboot.service;

import java.util.List;


import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Feedback;



public interface FeedbackService {



	List<Feedback> getAllFeedback();

	void saveFeedback(Feedback feedback);


	void deleteEmployeeFeedbackById(long id);

	Feedback getEmployeeFeedbackById(long id);


Page<Feedback> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

//List<Feedback> getByKeyword(String keyword);


}
