package first.java.example;


//implement comparable interface to perform the comparing of job candidates by age
public class JobCandidate implements Comparable<JobCandidate> {     
	  private String name;     
	  private String surname;
	  private int age;
	 

	  public JobCandidate(String name,String surname,int age) {         
	    this.name = name;         
	    this.surname =surname; 
	    this.age = age;     
	  }       

	  public String getName() {         
	    return name;     
	  }       
	  public String getSurname() {         
		    return surname;     
		  }   
	                    

	  public int getAge() {         
	    return age;     
	  }       
	//sort by age ascending  function. compare the ages of Job candidates
	  
	  @Override     
	  public int compareTo(JobCandidate candidate) {          
	    return (this.getAge() < candidate.getAge() ? -1 : 
	            (this.getAge() == candidate.getAge() ? 0 : 1));     
	  }  
	  @Override     
	  public String toString() {         
	    return " Name: " + this.name +  ", Surname: " + this.surname + ", age:" + this.age;     
	  }

}
	  
	
