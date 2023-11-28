package entity;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Flight {
	private String destination;
	private LocalDateTime flightDate;
	private Aircraft plane;
	
	private Flight (String destination, int day, int month, int year, int hour, int minute, Aircraft plane) throws
	DateTimeException {
			this.destination = destination;
			this.flightDate = LocalDateTime.of(year, month, day, hour, minute);
			this.plane = plane;
			plane.changeUsed();
	}
	
	static public Flight flightMaker(String destination, int day, int month, int year, int hour, int minute, Aircraft plane) {
		Flight f;
		try {
			f = new Flight(destination, day, month, year, hour, minute, plane);
		}
		catch (Exception DateTimeException) {
			return null;
		}
		return f;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String dest) {
		this.destination = dest;
	}
	
	public LocalDateTime getFlightDate() {
		return flightDate;
	}
	
	public void setFlightDate(int day, int month, int year, int hour, int minute) {
		this.flightDate = LocalDateTime.of(year, month, day, hour, minute);
	}
	
	public Aircraft getPlane() {
		return plane;
	}
	
	public void setPlane(Aircraft plane) {
		this.plane = plane;
	}
	
	public boolean flightHappened() {
		if (flightDate.isAfter(LocalDateTime.now(ZoneId.of("MST")))) {
			return true;
		}
		return false;
	}
}
