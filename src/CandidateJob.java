package second.part.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CandidateJob  {     
	  private String name;     
	  private String surname;
	  private int age;
	 

	  public CandidateJob(String name,String surname,int age) {         
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

	  
	  @Override     
	  public String toString() {         
	    return " Name: " + this.name +  ", Surname: " + this.surname + ", age:" + this.age;     
	  }
	  public static void main(String[] args) {
		  // create new array list objects
	        CandidateJob c1 = new CandidateJob ("Katarina", "Rakicevic", 26);
	        CandidateJob c2 = new CandidateJob("Stefan", "Markovic", 27);
	        CandidateJob c3 = new CandidateJob("Petar", "Petrovic", 29);
// create new ArrayList
	        ArrayList<CandidateJob> jobList = new ArrayList<>();
//add new elements to the Array list objects
	        jobList.add(c1);
	        jobList.add(c2);
	        jobList.add(c3);
	        

	        // test with the candidate name that does not exist
	        System.out.println(jobList.contains("Katarina")); 
	        
	        //test with the candidate names that exist in Array list object
	        System.out.println(jobList.contains(c1)); 
	        System.out.println(jobList.contains(c2)); 
	        System.out.println(jobList.contains(c3)); 
	     
	        
	        // test if array list is empty and print the result
	        
	        boolean ans = jobList.isEmpty();
	        if (ans == true)
	        	
	            System.out.println("The ArrayList is empty");
	        
	        else
	            System.out.println("The ArrayList is not empty");

	        
	  
		  // create new file
	        File fileName = new File("kandidati.txt"); 


		    try {
		        FileWriter fw = new FileWriter(fileName);
		        BufferedWriter output = new BufferedWriter(fw);
//interation through the list to insert the elements of array list in the file
		        for (int i = 0; i < jobList.size(); i++){
		            output.write(jobList.get(i).toString());// write in the file
		            output.newLine();
		        }

		        output.close();

		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "I cannot create that file");
		    }
		    
		    
		    // read the file 
		    try {
		        File myObj = new File("kandidati.txt");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          System.out.println(data);
		        }
		        myReader.close();
		      } catch (FileNotFoundException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		}
}
	
