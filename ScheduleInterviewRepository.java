package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.ScheduleInterview;
@Repository
public interface ScheduleInterviewRepository extends JpaRepository<ScheduleInterview,Long> {

}
