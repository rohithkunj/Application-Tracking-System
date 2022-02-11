



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
import net.javaguides.springboot.model.OverallFeedback;
import net.javaguides.springboot.repository.OverallFeedbackRepository;






@Service
public class OverallFeedBackServiceImpl implements OverallFeedbackService {






@Autowired
private OverallFeedbackRepository overallfeedbackRepository;





@Override
public List<OverallFeedback> getAllFeedback() {
	return overallfeedbackRepository.findAll();
}


@Override
public void saveOverallFeedback(OverallFeedback overallfeedback) {
	this.overallfeedbackRepository.save(overallfeedback);
}


@Override

public OverallFeedback getEmployeeOverallFeedbackById(long id) {
	Optional<OverallFeedback> optional = overallfeedbackRepository.findById(id);
	OverallFeedback overallfeedback = null;
	if (optional.isPresent()) {
		overallfeedback = optional.get();
	} else {
		throw new RuntimeException(" Employee hrfeedback not found for id :: " + id);
	}
	return overallfeedback;
}


@Override

public void deleteEmployeeOverallFeedbackById(long id) {
	this.overallfeedbackRepository.deleteById(id);
}


@Override
public Page<OverallFeedback> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
		Sort.by(sortField).descending();
	
	Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	return this.overallfeedbackRepository.findAll(pageable);
}


}
