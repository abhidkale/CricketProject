package com.crick.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CricketStaff {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int staffid;
	String staffName;
	String staffDept;
	int staffAge;
	int NoofyearstoBCCI;
	
	public CricketStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cricketstaff [staffid=" + staffid + ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffAge=" + staffAge + ", NoofyearstoBCCI=" + NoofyearstoBCCI + "]";
	}
	public CricketStaff(String staffName, String staffDept, int staffAge, int noofyearstoBCCI) {
		super();
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		NoofyearstoBCCI = noofyearstoBCCI;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public int getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(int staffAge) {
		this.staffAge = staffAge;
	}
	public int getNoofyearstoBCCI() {
		return NoofyearstoBCCI;
	}
	public void setNoofyearstoBCCI(int noofyearstoBCCI) {
		NoofyearstoBCCI = noofyearstoBCCI;
	}
	
	

}
