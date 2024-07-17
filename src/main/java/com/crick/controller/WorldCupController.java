package com.crick.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crick.entity.CricketStaff;
import com.crick.service.WorldCupService;

@RestController

public class WorldCupController{
	@Autowired
	WorldCupService service;
	@GetMapping("/test")
	public String testapi()
	{
		return "testapi";
	}
	
	@GetMapping("/getallstaff")
	public List<CricketStaff> fetchliststaff()
	{
		return service.fetchliststaff();
	}
	
	@GetMapping("/getmedicalstaffcount")
	public int fetchMedicaldeptcount()
	{
		return service.fetchMedicaldeptcount();
	}
	
	@GetMapping("getallstaffasperdeptReqParam")
	public int fetchAllStaffasPerDept(@RequestParam String deptName,@RequestParam String age)
	{
		System.err.println(deptName);
		System.err.println(age);
		
		
		return service.fetchAllStaffasPerDeptReqParam(deptName);
	}
	
	@GetMapping("/getnamewithage")
	public HashMap<String,Integer>fechstaffnamewithage()
	{
		return service.fechstaffnamewithage();
	}
	
	@GetMapping("/getNameliker")
	public String Namelikep()
	{
		List<CricketStaff>Nameliker = new ArrayList<>();
		return service.playernamewithfirstletter();
	}
	@GetMapping("/belowage")
	public void someMethod() {
        List<String> youngPlayers = service.fetchPlayersBelowAgeThirty();
        
    }
	@PostMapping("insertstaffdetails")
		public void insertstaffdetails(@RequestBody CricketStaff staff)
		{
			service.insertstaffdetails(staff);
		}
	@PutMapping("updatecricketstaff")
		public void updatestaffdetails(@RequestBody CricketStaff staff)
	{
		service.updatestaffdetails(staff);
	}
	@DeleteMapping("deletecricketstaff/{id}")
	public void deleteCricketStaffasperId(@PathVariable Integer id)
	{
		service.deleteCricketStaffasperId(id);
	}
	
}
