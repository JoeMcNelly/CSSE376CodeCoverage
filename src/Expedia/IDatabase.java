package Expedia;

import java.util.List;

public abstract class IDatabase {

	public List<String> Passengers = null;
	public List<String> Rooms = null;
	public int Miles = 0;

	public abstract String getCarLocation(int carNumber);

	public abstract String getRoomOccupant(int roomNumber);

	public List<String> getRooms() {
		// TODO Auto-generated method stub
		return Rooms;
	}

	public List<String> getPassengers() {
		// TODO Auto-generated method stub
		return Passengers;
	}
	

}
