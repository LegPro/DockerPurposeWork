package com.infoway.petclinic.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoway.petclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
