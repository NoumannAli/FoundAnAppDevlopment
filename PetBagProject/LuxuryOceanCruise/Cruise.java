package LuxuryOceanCruise;
import java.util.ArrayList;
import java.util.Scanner;

public class Cruise  {
	
	private static ArrayList<Cruise> cruiseList = new ArrayList();
	 public static void initializeCruiseList() {
	        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
	        cruiseList.add(newCruise);
	    }
	 // Class Variables
   public String cruiseName;
   static String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;
    
  static Scanner scnr = new Scanner(System.in);
    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors 
    // Method to get CruiseName
    public String getCruiseName() {
    	System.out.println("Please enter cruise name");
    	cruiseName = scnr.nextLine();
    
        
        return cruiseName;
    }
  //Method to get CruiseShipName
    public String getCruiseShipName() {
    	
    	System.out.println("Please enter your Cruise Ship Name");
    	cruiseShipName = scnr.nextLine();
    	
        return cruiseShipName;
    }
   //Method to get departure port
    public String getDeparturePort() {
    	System.out.println("Please enter deapture port");
    	departurePort = scnr.next();
        return departurePort;
    }

    public String getDestination() {
    	System.out.println("Please enter your Destination");
    	destination = scnr.next();
    	
        return destination;
    }

    public String getReturnPort() {
    	System.out.println("Please enter your return Port");
    	returnPort = scnr.next();
    	
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
        System.out.println(cruiseName);
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
        System.out.println(cruiseShipName);

    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
        System.out.println(departurePort);
    }

    public void setDestination(String tVar) {
        destination = tVar;
        System.out.println(destination);
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
        System.out.println(returnPort);
    }

    // print cruise details
    public void printCruiseDetails() {
    	
    	
    	
        
    	
     
        System.out.println(" Cruise Name              | " + cruiseName);
        System.out.println(" Ship name                | " + cruiseShipName);
        System.out.println(" Departure                | " + departurePort);
        System.out.println("Arrival destination       | " + destination);
        System.out.println("Return port               | " + returnPort);
		
        

    	

    }

    // method added to print ship's name vice memory address
    @Override
    public String toString()  {
    	cruiseName=scnr.next();
    	System.out.println(id(cruiseName));
    	
    	
        return cruiseName;
    }

	private char[] id(String cruiseName2) {
		return null;
	}

}
