package com.sales.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.entity.Visit;

public interface VisitDAO extends JpaRepository<Visit, Integer> {

}
