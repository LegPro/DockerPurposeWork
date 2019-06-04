package com.infoway.petclinic.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.infoway.petclinic.Dao.OwnerRepository;
import com.infoway.petclinic.model.Owner;

@RequestMapping("/owners")
@RestController
public class OwnerResource {
	@Autowired
	OwnerRepository ownerRepository;
	
	
	@PostMapping("/add")
    @ResponseStatus//(HttpStatus.CREATED)
    public Owner createOwner(@Valid @RequestBody Owner owner) {
	return ownerRepository.save(owner);
    }
	
	 @GetMapping(value = "/{ownerId}")
     public Optional<Owner> findOwner(@PathVariable("ownerId") int ownerId) {
         return ownerRepository.findById(ownerId);
     }
	 
	 @GetMapping
		public List<Owner> findAll() {
			return ownerRepository.findAll();
		}
	 
	 
	
	
	
}
