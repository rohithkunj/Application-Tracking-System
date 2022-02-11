package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import net.javaguides.springboot.model.ScheduleInterview;

import net.javaguides.springboot.repository.ScheduleInterviewRepository;
@Service
public class ScheduleInterviewServiceImpl implements ScheduleInterviewService {
	@Autowired
	private ScheduleInterviewRepository scheduleinterviewRepo;

	
	@Override
	public List<ScheduleInterview> getAllInterviewDetails() {
		// TODO Auto-generated method stub
		return scheduleinterviewRepo.findAll();
	}

	@Override
	public ScheduleInterview getInterviewDetailsById(long id) {
		Optional<ScheduleInterview> optional = scheduleinterviewRepo.findById(id);
		ScheduleInterview scheduleinterview = null;
		if (optional.isPresent()) {
			scheduleinterview = optional.get();
		} else {
			throw new RuntimeException(" Interview details  not found for id :: " + id);
		}
		return scheduleinterview;
	}

	
	@Override
	public void saveScheduleInterview(ScheduleInterview scheduleinterview) {
		// TODO Auto-generated method stub
		this.scheduleinterviewRepo.save(scheduleinterview);
		
	}

	@Override
	public Page<ScheduleInterview> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.scheduleinterviewRepo.findAll(pageable);
	}

	

	}


