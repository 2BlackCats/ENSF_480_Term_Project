package entity;

import java.util.ArrayList;

public class Airline {
	private ArrayList<User> listOfUsers;
	private ArrayList<AirlineAgent> listOfAgents;
	private ArrayList<SystemAdmin> listOfAdmins;
	private ArrayList<Flight> listOfFlights;
	private ArrayList<Aircraft> listOfAircrafts;
	
	private static Airline airline;
	
	private Airline() {
		listOfUsers = new ArrayList<User>();
		listOfAgents = new ArrayList<AirlineAgent>();
		listOfAdmins = new ArrayList <SystemAdmin>();
		listOfFlights = new ArrayList<Flight>();
		listOfAircrafts = new ArrayList<Aircraft>();
	}
	
	static public Airline getAirline() {
		if (airline == null) {
			airline = new Airline ();
		}
		return airline;
	}
	
	public User verifyUser(String Username, String Password) {
		for (int i = 0; i < listOfUsers.size(); i++) {
			if(listOfUsers.get(i).getUsername() == Username && listOfUsers.get(i).getPassword() == Password) {
				return listOfUsers.get(i);
			}
		}
		return null;
	}
	
	public User verifyAgent(String Username, String Password) {
		for (int i = 0; i < listOfAgents.size(); i++) {
			if(listOfAgents.get(i).getUsername() == Username && listOfAgents.get(i).getPassword() == Password) {
				return listOfAgents.get(i);
			}
		}
		return null;
	}
	
	public User verifyAdmin(String Username, String Password) {
		for (int i = 0; i < listOfAdmins.size(); i++) {
			if(listOfAdmins.get(i).getUsername() == Username && listOfAdmins.get(i).getPassword() == Password) {
				return listOfAdmins.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<User> getListOfUsers(){
		return listOfUsers;
	}
	
	public ArrayList<AirlineAgent> getListOfAgents(){
		return listOfAgents;
	}
	
	public ArrayList<SystemAdmin> getListOfAdmins(){
		return listOfAdmins;
	}
	
	public ArrayList<Flight> getListOfFlights(){
		return listOfFlights;
	}
	
	public ArrayList <Aircraft> getListOfAircrafts(){
		return listOfAircrafts;
	}
}
