package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Doc;


public interface DocRepository  extends JpaRepository<Doc,Integer>{

}
