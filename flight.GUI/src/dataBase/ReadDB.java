package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

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
			dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "");
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
	
	public void loadFromDB() throws SQLException {
		populateUsers();
		populateAircrafts();
		populateFlights();
	}
	
	public void populateUsers() throws SQLException {
		Statement st = dbConnect.createStatement();
		String query = "select * from Login where Type = 'User'";
		results = st.executeQuery(query);
		while(results.next()){
			al.addUser(results.getString("Username"), results.getString("Password"), results.getString("Email"), results.getString("Type"));
		}
		
	}
	
	public void populateAircrafts() throws SQLException {
		Statement st = dbConnect.createStatement();
		String query = "select * from Aircrafts";
		results = st.executeQuery(query);
		while (results.next()) {
			al.addAircraft(results.getString("Size"), results.getInt("ID"));
			
		}
		
	}
	
	public void populateFlights() throws SQLException {
		Statement st = dbConnect.createStatement();
		String query = "select * from Flight";
		results = st.executeQuery(query);

		while(results.next()){
			for(int i =0; i < al.getListOfAircrafts().size(); i++){
				al.addFlight(results.getInt("ID"),results.getString("Destination"), results.getTimestamp("Time").toLocalDateTime(), al.getListOfAircrafts().get(i));
			}
			
		}
		
	}
	
	public void populateSeats(int AircraftID) throws SQLException {
		Statement st = dbConnect.createStatement();
		String query = "select * from Seats";
		results = st.executeQuery(query);

		while(results.next()){
		
		}
		
		
	}
	
	
}
