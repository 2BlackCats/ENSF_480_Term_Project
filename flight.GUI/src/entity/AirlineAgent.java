package entity;

import java.util.ArrayList;

public class AirlineAgent extends User{
	public AirlineAgent(String username, String password, String email) {
		super(username, password, email);
	}
	
	public ArrayList<Flight> getFlights() {
		return Airline.getAirline().getListOfFlights();	
	}
}
