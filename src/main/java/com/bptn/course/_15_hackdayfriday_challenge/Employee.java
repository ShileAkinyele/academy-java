package com.bptn.course._15_hackdayfriday_challenge;

class Employee {
	   // Instance variable to store salary
	    private int salary;
	    
	   
	   // Instance variable to store hours per day worked by employee
	    private int hoursPerDay;

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	    public Employee(int salary,int hoursPerDay ){

	      setSalary(salary);//setting the values of salary using set method

	      setHoursPerDay(hoursPerDay);//setting the values of hoursperday using set method

	    }


	  

	   // Set method to update salary
	    public void setSalary(int salary){
	      if (salary<500){
	        this.salary= salary+10;
	      }else{
	        this.salary = salary;

	      }
	    }
	   

	   // Set method to update hoursPerDay
	    public void setHoursPerDay(int hoursPerDay){
	      if (hoursPerDay>6){
	        this.salary +=5;
	      }else{
	        this.hoursPerDay = hoursPerDay;

	      }
	    }
	   

	   // Get method to return salary
	   public int getSalary(){
	    return this.salary;
	   }
	}
