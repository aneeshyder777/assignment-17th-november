package com.project.spring;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.spring.Entity.Agent;
import com.project.spring.Entity.AgentDao;
import com.project.spring.Entity.Employee1;
import com.project.spring.Entity.EmployeeDao;
import com.project.spring.Entity.Employeee;
import com.project.spring.Entity.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Car obj=new Car();
    	//obj.drive();
    	
    	//Vehicle obj=(Vehicle)new Bike();
    	//obj.drive();
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	/*
    	 
        Vehicle obj=(Vehicle) context.getBean("Vehicle");
    	obj.drive();
    	
    	System.out.println( "Here are the Student details" );
    	
    	Student obj1=(Student)context.getBean("y");
    	
    	System.out.println(obj1.getSid());
    	System.out.println(obj1.getSname());
    	System.out.println(obj1.getScourse());
    	
    	
    	System.out.println( "Here are the Employee details" );
    	
    	Employee obj2=(Employee)context.getBean("x");
    	
   	    System.out.println(obj2.getEid());
    	System.out.println(obj2.getEname());
    	System.out.println(obj2.getEdepartment()); 
    	
    	
    	Employeee obj3=(Employeee)context.getBean("e1");
    	System.out.println(obj3.getEid());
    	System.out.println(obj3.getEname());
    	List<String> ek=obj3.getKnownlangauge();
    	for(String s:ek)
    	{
    		System.out.println(s);	
    	}
    	
    	Set<String> sk=obj3.getSkills();
    	for(String e:sk)
    	{
    		System.out.println(e);	
    	}
    	
    	Question obj4=(Question)context.getBean("q1");
    	System.out.println(obj4.getQid());
    	System.out.println(obj4.getQtype());
    	List<String> ls=obj4.getQuestionlangauge();
    	for(String o:ls)
    	{
    		System.out.println(o);	
    	}
    	
    	Set<String> in=obj4.getIncharge();
    	for(String r:in)
    	{
    		System.out.println(r);	
    	}
    	
    	
    	
    	JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	String query="insert into studentdata(id, name, marks) values(?,?,?)";
    	int result=template.update(query,1004,"asifa",469);
    	System.out.println(result);
    	*/
    	
    	
    	//EmployeeDao e1=(EmployeeDao)context.getBean("e2"); 
    	
    	//int st=e1.saveEmployee(new Employee1(151,"aneesa",25000));
    	//System.out.println(st);
    	
    	//int sp=e1.updateEmployee(new Employee1(150,"maam",6786));
    	//System.out.println(sp);
    	
    	//int sd=e1.deleteEmployee(new Employee1(150));
    	//System.out.println(sd);
    	
         AgentDao e2=(AgentDao)context.getBean("e3"); 
    	
    	int st=e2.saveAgent(new Agent(151,"aneesa","srinagar"));
    	System.out.println(st);
    	
    	int sp=e2.updateAgent(new Agent(151,"maam","Delhi"));
    	System.out.println(sp);
    	
    	int sd=e2.deleteAgent(new Agent(151));
    	System.out.println(sd);
    }
}
