package com.pet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.entities.Staff;
import com.pet.repos.PetRepository;

@Service
public class PetServices {

	@Autowired
	PetRepository p;

	public List<Staff> getstaffs() {

		List<Staff>slist=p.findAll();
		return slist;

	}

	public List<Staff> insertstaffs(List<Staff> s) {
		p.saveAll(s);
		List<Staff> slist=getstaffs();
		return slist;
	}

	public Staff updatestaffs(int staffId, String staffName, Staff s) {
		if(s.getStaffId()==staffId) {
			s.setStaffName(staffName);;
		}
		Optional<Staff>slist=p.findById(staffId);
		return slist.get();
	}



}
