
package net.javaguides.springboot.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Feedback1;
import net.javaguides.springboot.repository.Feedback1Repository;
import net.javaguides.springboot.repository.FeedbackRepository;






@Service

public class Feedback1ServiceImpl implements Feedback1Service  {


@Autowired
private Feedback1Repository feedback1Repository;




@Override
public List<Feedback1> getAllFeedback() {
	return feedback1Repository.findAll();
}

@Override
public void saveFeedback(Feedback1 feedback1) {
	this.feedback1Repository.save(feedback1);
}

@Override

public Feedback1 getEmployeeFeedbackById(long id) {
	Optional<Feedback1> optional = feedback1Repository.findById(id);
	Feedback1 feedback1 = null;
	if (optional.isPresent()) {
		feedback1 = optional.get();
	} else {
		throw new RuntimeException(" Employee hrfeedback not found for id :: " + id);
	}
	return feedback1;
}

@Override

public void deleteEmployeeFeedbackById(long id) {
	this.feedback1Repository.deleteById(id);
}


@Override
public Page<Feedback1> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
		Sort.by(sortField).descending();
	
	Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	return this.feedback1Repository.findAll(pageable);
}
}
