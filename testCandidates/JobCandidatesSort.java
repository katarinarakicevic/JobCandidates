package first.java.example;

import java.util.ArrayList; 
import java.util.Collections;   
//this class is used to sort list elements
public class JobCandidatesSort{ 
	//new array list
  ArrayList<JobCandidate> jobCandidate = new ArrayList<>();       

  public JobCandidatesSort(ArrayList<JobCandidate> jobCandidate) {         
    this.jobCandidate = jobCandidate;     
  }       
//sort array list
  // Call the function to sort the candidates
  public ArrayList<JobCandidate> getSortedJobCandidateByAge() {         
    Collections.sort(jobCandidate);         
    return jobCandidate;   //returns the candidates sorted by age  
  } 
  
  

  
}
