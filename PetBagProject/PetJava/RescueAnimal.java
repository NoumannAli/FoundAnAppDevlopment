package PetJava;
import java.text.DateFormat;

import java.util.*;

public class RescueAnimal {
	Scanner scnr = new Scanner(System.in);
	

	
	// Class variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private Date acquisitionDate;
    private Date statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private Date trainingStart;
    private Date trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

 
    //getter methods
    public String getName() {
    	System.out.println(name);
    	return name;
    }
    
    public String getType(String type) {
    	return type;
    }
    
    public int getAge() {
    	
    	return age;
    	

    }
    
    public float getWeight() {
    
    	return weight;
    }
    
    public String getGender() {
    
    	return gender;
    }
    
    public  Date getAcquisstionDate() {
    	return acquisitionDate;
    }
    
    public Date getStatusDate() {
    	return statusDate;
    }
    
    public String getAcquisitionSource() {
    	return acquisitionSource;
    	
    }
    public boolean getAnimalStatus() {
  	  return reserved;
    }
    public String getTrainingLocation() {
    	return trainingLocation;
    }
    
    public  Date  getTrainingStart() {
    	return trainingStart;
    }
    
    public Date  getTrainingEnd() {
    	return trainingEnd;
    }
    
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    
    public String getInServiceCountry() {
   	 return inServiceCountry;
    }
    
    public String getInServiceCity() {
   	 return inServiceCity;
   	 
    }
    

    public String getInServiceAgency() {
   	 return inServiceAgency;
    }
    
    public String getInServicePOC() {
   	 return inServicePOC;
    }
    
    public String getInServiceEmail() {
    	return inServiceEmail;
    }
    
    public String getInServicePhone() {
    	return inServicePhone;
    }
    public String getInServicePostalAddress() {
    	return inServicePostalAddress;
    }
    
    //setters methods
    public String setName(String name) {
    	System.out.println(name);

    	return name;
    }
    public String setType(String type) {
    	System.out.println(type);
    	return type;
    }
 
    
    public String setGender(String gender) {
    	System.out.println(gender);
    	return gender;
    }
    
   
    public int setAge(int age) {
    	System.out.println(age);
    	return age;
    }
   
    
    public float setWeight(float weight) {
    	System.out.println(weight);
    	return weight;
    }
    
    public  Date setAcquisstionDate(Date acquisitionDate) {
    	System.out.println(acquisitionDate);
    	return acquisitionDate;
    }
    
    public Date setStatusDate(Date  statusDate) {
    	System.out.println(statusDate);
    	return statusDate;
    }
    
    public String setAcquisitionSource(String AcquisitionSource) {
    	System.out.println(AcquisitionSource);
    	return acquisitionSource;
    	
    }
    
    public boolean setAnimalStatus(boolean reserved) {
    
    	  return reserved;
    }   
    
    public String setTrainingLocation(String trainingLocation) {
    	System.out.println(trainingLocation);
    	return trainingLocation;
    }
    
    public  Date  setTrainingStart(Date trainingStart) {
    	System.out.println(trainingStart);
    	return trainingStart;
    }
    
    public Date  setTrainingEnd(Date trainingEnd) {
    	System.out.println(trainingEnd);
    	return trainingEnd;
    }
    
    public String setTrainingStatus(String trainingStatus) {
    	System.out.println(trainingStatus);
    	return trainingStatus;
    }
     public String setInServiceCountry(String inServiceCountry) {
    	 System.out.println(inServiceCountry);
    	 return inServiceCountry;
     }
     
     public String setInServiceCity(String inServiceCity) {
    	 System.out.println(inServiceCity);
    	 return inServiceCity;
    	 
     }
    
     public String setInServiceAgency(String inServiceAgency) {
    	 return inServiceAgency;
     }
     
     public String setInServicePOC(String inServicePOC) {
    	 System.out.println(inServicePOC);
    	 return inServicePOC;
     }
    public String setInServiceEmail(String inServiceEmail) {
      System.out.println(inServiceEmail);
    	return inServiceEmail;
    }
    public String setInServicePhone(String inServicePhone) {
    	System.out.println(inServicePhone);
    	return inServicePhone;
    }
    
    public String setInServicePostalAddress(String inServicePostalAddress) {
    	System.out.println(inServicePostalAddress);
    	return inServicePostalAddress;
    }
    
    

}
