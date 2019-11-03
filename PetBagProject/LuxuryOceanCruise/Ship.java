package LuxuryOceanCruise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ship {
	// Class Variables
    private String shipName;
    private int roomBalcony;
    private int roomOceanView;
    private int roomSuite;
    private int roomInterior;
    private boolean inService;
Scanner scnr =  new Scanner(System.in);
    // Constructor - default
    Ship() {
    	System.out.println("please enter ship name");
    	shipName =  scnr.nextLine();
    	System.out.println("Please enter size of room Balconys");
    	roomBalcony =  scnr.nextInt();
    	System.out.println("Please enter size of ocean views");
    	roomOceanView = scnr.nextInt();
    	System.out.println("Please enter size of room suits");
    	roomSuite =  scnr.nextInt();
    	System.out.println("Please Enter room interiors");
    	roomInterior = scnr.nextInt();
    	System.out.println("is room in service true or fale?");
    	inService =  scnr.nextBoolean();
    		
    	
    }

    // Constructor - full
    Ship(String tName, int tBalcony, int tOceanView,
         int tSuite, int tInterior, boolean tInService) {
        shipName = tName;
        roomBalcony = tBalcony;
        roomOceanView = tOceanView;
        roomSuite = tSuite;
        roomInterior = tInterior;
        inService = tInService;
    }

    // Accessors
    public String getShipName() {
    	System.out.println();
    	shipName= scnr.next();
    	
    	
        return shipName;
    }

    public int getRoomBalcony() {
    	System.out.println("Please enter room balcony");
    	roomBalcony = scnr.nextInt();
        return roomBalcony;
    }

    public int getRoomOceanView() {
    	System.out.println("please enter ocean view");
    	roomOceanView = scnr.nextInt();
        return roomOceanView;
    }

    public int getRoomSuite() {
    	System.out.println("please enter the qty of room suite");
    	roomSuite = scnr.nextInt();
        return roomSuite;
    }

    public int getRoomInterior() {
    	System.out.println("please enter room interior");
    	roomInterior = scnr.nextInt();
        return roomInterior;
    }

    public boolean getInService() {
    	
    	System.out.println("Please enter room in service Yes or no");
    	inService = scnr.nextBoolean();
    	
    	
    	if(inService == true) {
    		return true;
    	}else {
    		return false;
    	}
    
    }

	// Mutators
    public void setShipName(String tVar) {
        shipName = tVar;
    }

    public void setRoomBalcony(int tVar) {
        roomBalcony = tVar;
    }

    public void setRoomOceanView(int tVar) {
        roomOceanView = tVar;
    }

    public void setRoomSuite(int tVar) {
        roomSuite = tVar;
    }

    public void setRoomInterior(int tVar) {
        roomInterior = tVar;
    }

    public void setInService(boolean tVar) throws InputMismatchException {
    	boolean tvar = true;
    	try {System.out.println("Room in serive Yes/NO");
    	tvar=scnr.nextBoolean();
        inService = tVar;}
    	catch
    		(Exception e){
    			System.out.println("invalid input");
    		}
    	
    }

    // print method
    public void printShipData() {
        int spaceCount;
        String spaces = "";
        spaceCount = 20 - shipName.length();

        for (int i = 1; i <= spaceCount; i++) {
            spaces = spaces + " ";
        }

        System.out.println(shipName + spaces + roomBalcony + "\t" +
                roomOceanView + "\t" + roomSuite + "\t" +
                roomInterior + "\t\t" + inService);
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return shipName;
    }
}



