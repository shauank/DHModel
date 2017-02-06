package com.dharbor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dharbor.entity.StudentInformation;


public interface StudentInformationRepository extends JpaRepository<StudentInformation, Long>{
}