package com.crick.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.crick.dao.WorldCupDao;
import com.crick.entity.CricketStaff;
@Service
public class WorldCupService {
	
	@Autowired
	WorldCupDao dao;
	public List<CricketStaff> fetchliststaff() 
	{
		System.err.println("I am in service");
		List<CricketStaff> allstafflist= dao.allInsdianCricketstaffList();
		return allstafflist;
	}

	public int fetchMedicaldeptcount() 
	{
		List<CricketStaff> allstafflist= dao.allInsdianCricketstaffList();
		ArrayList<CricketStaff>medicalstaff = new ArrayList<CricketStaff>();
		for(CricketStaff staff:allstafflist)
		{
			medicalstaff.add(staff);
		}
		return medicalstaff.size();
	}
	public HashMap<String,Integer>fechstaffnamewithage()
	{
		List<CricketStaff> allstafflist= dao.allInsdianCricketstaffList();
		HashMap<String,Integer>nameageMap = new HashMap<String,Integer>();
		for(CricketStaff staff:allstafflist)
		{
			nameageMap.put(staff.getStaffName(),staff.getStaffAge());
		}
		return nameageMap;
	}
	
	
	public String playernamewithfirstletter()
	{
		List<CricketStaff> allstafflist= dao.allInsdianCricketstaffList();
		List<CricketStaff>Nameliker = new ArrayList<>();
		
		for(CricketStaff staff:allstafflist)
		{
			if(staff.getStaffName().startsWith("a"))
			{
				Nameliker.add(staff);
			}
		}
		return Nameliker.toString();
	}
	
	public List<String> fetchPlayersBelowAgeThirty() {
		List<CricketStaff> allstafflist = dao.allInsdianCricketstaffList();
		List<String> playersBelowThirty = new ArrayList<>();
		
		for (CricketStaff staff : allstafflist) {
			if (staff.getStaffAge() < 30) {
				playersBelowThirty.add(staff.getStaffName());
			}
		}
		return playersBelowThirty;


	}
	public void insertstaffdetails(CricketStaff staff) {
		dao.insertstaffdetails(staff);
	}

	public void updatestaffdetails(CricketStaff staff) {
		dao.updatestaffdetails(staff);
	}


	public int fetchAllStaffasPerDept(String deptName) 
	{
		List<CricketStaff> allstafflist = dao.allInsdianCricketstaffList();
		ArrayList<CricketStaff>medicalstaff = new ArrayList<CricketStaff>();
		for(CricketStaff staff:allstafflist)
		{
			if(staff.getStaffDept().equalsIgnoreCase(deptName))
			{
				medicalstaff.add(staff);
			}
			
		}
		
		return medicalstaff.size();
	}

	public int fetchAllStaffasPerDeptReqParam(String deptName) {
		List<CricketStaff> allstafflist = dao.allInsdianCricketstaffList();
		ArrayList<CricketStaff>medicalstaff = new ArrayList<CricketStaff>();
		for(CricketStaff staff:allstafflist)
		{
			if(staff.getStaffDept().equalsIgnoreCase(deptName))
			{
				medicalstaff.add(staff);
			}
			
		}
		
		return medicalstaff.size();
		
	}

	public void deleteCricketStaffasperId(Integer id) {
		dao.deleteCricketStaffasperId(id);
	}
	
	
	
}
