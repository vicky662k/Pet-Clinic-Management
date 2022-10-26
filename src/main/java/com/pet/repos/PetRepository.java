package com.pet.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet.entities.Staff;

@Repository
public interface PetRepository extends JpaRepository<Staff,Integer> {

}
