package com.project.spring.Entity;

import java.util.List;
import java.util.Set;

public class Question {
	
	private int Qid;
	private String Qtype;
	List<String> Questionlangauge;
	Set<String> Incharge;
	
	
	public int getQid() {
		return Qid;
	}
	public Question() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", Qtype=" + Qtype + ", Questionlangauge=" + Questionlangauge + ", Incharge="
				+ Incharge + "]";
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQtype() {
		return Qtype;
	}
	public void setQtype(String qtype) {
		Qtype = qtype;
	}
	public List<String> getQuestionlangauge() {
		return Questionlangauge;
	}
	public void setQuestionlangauge(List<String> questionlangauge) {
		Questionlangauge = questionlangauge;
	}
	public Set<String> getIncharge() {
		return Incharge;
	}
	public void setIncharge(Set<String> incharge) {
		Incharge = incharge;
	}

}
