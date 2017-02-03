package com.dharbor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dharbor.entity.PersonalInformation;


public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long>{
}