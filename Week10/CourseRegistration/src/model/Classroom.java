package model;

public class Classroom {
	private String building;
	private String roomNumber;
	private String campus;
	private String type;
	private int capacity;
	
	public Classroom() {}
	
	public Classroom(String building, String roomNumber, String campus, String type, int capacity) {
		setBuilding(building);
		setRoomNumber(roomNumber);
		setCampus(campus);
		setType(type);
		setCapacity(capacity);
	}
	
	
	
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	} 
	
	
	public String toString() {
		return "Classroom [building=" + building + ", roomNumber=" + roomNumber + ", campus=" + campus + ", type="
				+ type + ", capacity=" + capacity + "]";
	}
	
	
}
