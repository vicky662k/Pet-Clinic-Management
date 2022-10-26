package com.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pet.constants.PetConstants;
import com.pet.entities.Staff;
import com.pet.services.PetServices;

/**
 * 
 * @author eyjfsaw29
 * @since 18/10/2022
 * @version 1.0
 *
 */

@RestController
public class PetController {

	@Autowired
	private PetServices p;

	@RequestMapping(value=PetConstants.GET_STAFF_DATA,method=RequestMethod.GET)
	public List<Staff> getstaff(@RequestBody Staff s) {

		List<Staff>slist=p.getstaffs();
		return slist;

	}

	@RequestMapping(value=PetConstants.INSERT_STAFF_DATA,method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Staff> insertstaff(@RequestBody List<Staff> s) {

		List<Staff>slist=p.insertstaffs(s);
		return slist;

	}


	@RequestMapping(value=PetConstants.UPDATE_STAFF_DATA,method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Staff updatestaff(@RequestBody Staff s) {

		Staff staff=p.updatestaffs(s.getStaffId(),s.getStaffName(),s);
		return staff;

	}
	
}
