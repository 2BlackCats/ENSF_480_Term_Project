package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.*;

public class ReadDB {
	private Airline al;
	private ResultSet results;
	private Connection dbConnect;
	
	public ReadDB () {
		al = Airline.getAirline();
	}
	
	public void createConnection() {
		try {
			dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3307/ams", "root", "");
		}
		catch (SQLException e) {
			System.out.println("Problem establishing connection");
            e.printStackTrace();
		}
	}
	
	public void closeConnection() {
        try {
            results.close();
            dbConnect.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void loadFromDB() {
		populateUsers();
		populateAircrafts();
		populateFlights();
	}
	
	public void populateUsers() {
		
	}
	
	public void populateAircrafts() {
		
	}
	
	public void populateFlights() {
		
	}
	
	public void populateSeats(int AircraftID) {
		
	}
	
	
}
