package com.project.spring.Entity;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee1 e)
	
	{
		
		String query="insert into employeedata (id,name,salary) values(?,?,?)";
	    return jdbcTemplate.update(query,e.getId(),e.getName(),e.getSalary());
	}
	
	
public int updateEmployee(Employee1 e)
	
	{
		
		String query="update employeedata set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
	    return jdbcTemplate.update(query);
	}
public int deleteEmployee(Employee1 e)

{
	
	String query="delete from employeedata where id ='"+e.getId()+"' ";;
    return jdbcTemplate.update(query);
}
	
	
	
	

}
