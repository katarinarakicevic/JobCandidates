package first.java.example;

 
import org.junit.Test;


import java.util.ArrayList;   

public class JobCandidateTest {  
	
	
	 @Test     
	  public void testGetSortedJobCandidateByAge() throws Exception {   
		 
		 //create list objects
      
    JobCandidate jobCandidate1 = new JobCandidate("Katarina", "Rakicevic", 26);         
    JobCandidate jobCandidate2 = new JobCandidate("Stefan","Dimovic", 23);         
    JobCandidate jobCandidate3 = new JobCandidate("Nikola","Maksimovic", 20);         
    JobCandidate jobCandidate4 = new JobCandidate("Ivana", "Vasic", 24);         
    ArrayList<JobCandidate> jobCandidateList = new ArrayList<>(); 
   
    //add candidates to the list object

    jobCandidateList.add(jobCandidate1);  
   
   
    jobCandidateList.add(jobCandidate2); 
    
    jobCandidateList.add(jobCandidate3);   
  
    jobCandidateList.add(jobCandidate4);  
    
    // Test if list contains the candidates names
    
    // test with the candidate name that does not exist
    System.out.println(jobCandidateList.contains("Katarina")); 
    
    //test with the candidate names that exist in Array list object
    System.out.println(jobCandidateList.contains(jobCandidate1)); 
    System.out.println(jobCandidateList.contains(jobCandidate2)); 
    System.out.println(jobCandidateList.contains(jobCandidate3)); 
    System.out.println(jobCandidateList.contains(jobCandidate4)); 
    
    // test if array list is empty and print the result
    
    boolean ans = jobCandidateList.isEmpty();
    if (ans == true)
        System.out.println("The ArrayList is empty");
    else
        System.out.println("The ArrayList is not empty");

    
    
  //sorting related code
    
    JobCandidatesSort jobCandidateSorter = new JobCandidatesSort (jobCandidateList);  // new object of sorted array list elements       
    ArrayList<JobCandidate> sortedJobCandidate = jobCandidateSorter.getSortedJobCandidateByAge();// call the function to show the sorted elements         
    System.out.println("-----Sorted JobCandidate by age: Ascending-----");         
    for (JobCandidate jobCandidate : sortedJobCandidate) {             
      System.out.println(jobCandidate);   // print candidates    
  }  
     
}
  
	
   
}
  
   
