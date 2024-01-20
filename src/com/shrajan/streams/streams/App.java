package com.shrajan.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	
	static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		
		
		    EmployeeFactory employeeFactory = new EmployeeFactory();
	        employeeList = employeeFactory.getAllEmployee();
	        
	       // getDistinctProjects().forEach(c->System.out.println(c.getName()));
	       // printNamesStartingwithA();
	        // getEmployeeWhoJoined("2017").forEach(c->System.out.println(c.getId()));
	      //sortEmployeesForFirstNameandSalary().forEach(c->System.out.println(c.getFirstName()+"  :   "+c.getSalary()));
	   //     Employee emp =  getNthHighestSalary(0);
	   //     System.out.println(">>>>>>"+emp.getFirstName()+" :  "+emp.getSalary());
	        
	      //  printMinSalary();
	      
	   //   printEmplWithMinSalary().forEach(c->System.out.println(c.getId()+"  :::: "+c.getFirstName()));
	     // getMutitaskers().forEach(c->System.out.println(c.getId()+"  ::  "+c.getFirstName()+" "+c.getLastName()+" Projects "+c.getProjects().size()));
	      //System.out.println(countOfLaptops());
	     // System.out.println(countOfProjectsforPM("Robert Downey Jr"));
	      
	      allReporties("Robert Downey Jr").forEach(c->System.out.println(c.getFirstName()+" "+c.getLastName()));
	}
	
	//1. List all distinct project in non-ascending order.
	public static List<Project> getDistinctProjects(){
	
		return employeeList.stream().map(cons->{return cons.getProjects();}).flatMap(list->list.stream()).distinct().collect(Collectors.toList());
	
	}
	
	//2. Print full name of any employee whose firstName starts with ‘A’.
	public static void printNamesStartingwithA() {
		employeeList.stream().filter(c->c.getFirstName().startsWith("E")).distinct().collect(Collectors.toList()).forEach(c->System.out.println(c.getFirstName()+" "+c.getLastName()));
	}
	
	
	//3. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
	public static List<Employee> getEmployeeWhoJoined(String cyear){
	List<Employee> empls=	employeeList.stream().filter(c-> {
			
			String year = c.getId().substring(0, 4).trim();
			
		    return year.equals(cyear);
		}).collect(Collectors.toList());
	
	 return empls;
	}
	
	
	//4. Sort employees based on firstName, for same firstName sort by salary.
	
	public static List<Employee> sortEmployeesForFirstNameandSalary(){
		
		
		return employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName)).sorted(Comparator.comparing(Employee::getSalary)).distinct().collect(Collectors.toList());
	} 
	
	//5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
	public static Employee getNthHighestSalary(int n){
		return employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n).findFirst().orElse(null);
	}
	
	//6. Print min salary.
	public static double minSalary() {
		return employeeList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
	}
	
	//7. Print list of all employee with min salary.
	public static List<Employee> printEmplWithMinSalary(){
		return employeeList.stream().filter(c->{
			return Double.valueOf(c.getSalary()).compareTo(minSalary())==0;
		}).collect(Collectors.toList());
	}
	
	
	//8. List of people working on more than 2 projects.
	public static List<Employee> getMutitaskers(){
		return employeeList.stream().filter(c->{
			return (c.getProjects().size()>=2);
		}).collect(Collectors.toList());
	}
	
	//9. Count of total laptops assigned to the employees.
	public static int countOfLaptops() {
		return employeeList.stream().mapToInt(Employee::getTotalLaptopsAssigned).sum();
	}
	
	//10. Count of all projects with Robert Downey Jr as PM.
	public static int countOfProjectsforPM(String pm) {
		
		List<Project> empls =  employeeList.stream().map(c->{ 
			return c.getProjects();}).flatMap(v->v.stream()).filter(filt->{ return filt.getProjectManager().equals(pm);})
				.distinct().collect(Collectors.toList());
	
	    return empls.size();
	}
	
	//12. List of all people working with Robert Downey Jr.
	public static List<Employee> allReporties(String managerName){
		
		// getProjects with Manager
		// getEmployees for those Projects
		
		List<Project> projects = employeeList.stream().map(c->{return c.getProjects();
		}).flatMap(c->c.stream()).filter(filt->{
		return filt.getProjectManager().equals(managerName);}).collect(Collectors.toList());
		
		
	   List<Employee> empls=	employeeList.stream().filter(filt->{
		   
		     for(Project prj: filt.getProjects()) {
		    	 if(projects.contains(prj)) return true;
		     }   
		   
		   return false;
		   
	   
	   }).distinct().collect(Collectors.toList());
	
	   return empls;
	
	}
	//13. Create a map based on this data, they key should be the year of joining, 
	 //    and value should be list of all the employees who joined the particular year.
	
	

	/*
	 * 

    













14. Create a map based on this data, the key should be year of joining and value should be the count of people joined in that particular year.
	 * 
	 * */

}
