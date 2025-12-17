package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Stuentity;


@Repository
public interface StudentRespository extends JpaRepository<Stuentity,Long>{

}