package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Airline;

public class UpdateDB {
	
	private Airline al;
	private ResultSet results;
	private Connection dbConnect;
	
	public UpdateDB () {
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

	}
	
	public void updateUsers() {
		
	}
	
	public void updateFlights() {
		
	}
	
	public void updateAircrafts() {
		
	}
	
	public void updateSeats() {
		
	}
}
