package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.Model.Electricity;

public interface ElectricityRepo extends JpaRepository<Electricity, Integer> {

}
