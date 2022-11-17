package com.project.spring.Entity;

import java.util.List;
import java.util.Set;

public class Employeee {
	private int Eid;
	private String Ename;
	public Employeee() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employeee [Eid=" + Eid + ", Ename=" + Ename + ", Knownlangauge=" + Knownlangauge + ", Skills=" + Skills
				+ "]";
	}
	List<String> Knownlangauge;
	Set<String> Skills;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public List<String> getKnownlangauge() {
		return Knownlangauge;
	}
	public void setKnownlangauge(List<String> knownlangauge) {
		Knownlangauge = knownlangauge;
	}
	public Set<String> getSkills() {
		return Skills;
	}
	public void setSkills(Set<String> skills) {
		Skills = skills;
	}
	

}
