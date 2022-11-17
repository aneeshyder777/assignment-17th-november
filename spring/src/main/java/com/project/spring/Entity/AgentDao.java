package com.project.spring.Entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
public int saveAgent(Agent e)
	
	{
		
		String query="insert into agent (id,name,area) values(?,?,?)";
	    return jdbcTemplate.update(query,e.getId(),e.getName(),e.getArea());
	}

public int updateAgent(Agent e)

{
	
	String query="update agent set name='"+e.getName()+"',area='"+e.getArea()+"' where id='"+e.getId()+"' ";
    return jdbcTemplate.update(query);
}
public int deleteAgent(Agent e)

{
	
	String query="delete from agent where id ='"+e.getId()+"' ";;
    return jdbcTemplate.update(query);
}
}
