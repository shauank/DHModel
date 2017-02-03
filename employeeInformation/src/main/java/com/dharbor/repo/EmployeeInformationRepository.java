package com.dharbor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dharbor.entity.EmployeeInformation;


public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long>{
}