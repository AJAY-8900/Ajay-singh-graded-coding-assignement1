package com.gl.service;

    class SuperDepartment {


    public String function1() {
		
		String dName = "Super Department";
		return dName;	
		
	}
	
	public String function2() {
		
		String tWork = "No Work as of now";
		return tWork;
	}
	
	public String function3() {
	
	   String wDeadline = "Nil";
	   return wDeadline;
	
}
	public String function4() {
       String tHoliday = "Today is not a holiday";
       return tHoliday;

		
}
	
	}
 
   class AdminDepartment extends SuperDepartment
  {
	 @Override
	 public String function1() {
	 String dName = "Admin Department";
	 return dName;
		 
	 }
	 public String function2() {
		 String tWork = "Complete your document submission";
		 return tWork;	 
	 }
	 
	 public String function3() {
		 String wDeadline = "Complete by end of day";
		 return wDeadline;
		  
	 }
	 }
	 
	 class HrDepartment extends SuperDepartment
	 {
	
		@Override
		 public String function1() {
			 String dName = "HrDepartment";
			 return dName;
			 	 
		 }
	
		 public String function2() {
			 String tWork = "Fill Today's Timesheet and Mark you Attendence";
			 return tWork;
		 }
		 
		 public String function3() {
			String wDeadline = "Complete by EOD";
			return wDeadline;
			 
		 }
		 public String function4() {
			 String dctivity = "team Lunch";
			 return dctivity;
			 
		 }
	 }
	class TechDepartment extends SuperDepartment{
		
		@Override
		public String function1() {
			String dName = "Tech Department";
			return dName;
		}
		public String function2() {
			String tWork = "Complete Coding of module 1";
			return tWork;
		}
		public String function3() {
			String wDeadline = "Complete by EOD";
			return wDeadline;
		}
		public String function4() {
			String tsInformation = "core java";
			return tsInformation;
		}
	
	
	
	 
	 

	public char[] function1(String string) {
	
		return null;
	}
	 
	 
 }
	  
	
	
	
		  
		  
		  
	  
	  
	  
	  
	   
			
			
		    
	  
	  
		 
		  
		  
	  
	  
	
		  
		  
	  
		    
		  
	  
   
   

     
	
