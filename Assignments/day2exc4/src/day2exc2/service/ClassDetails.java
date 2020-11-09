package day2exc2.service;

public class ClassDetails {
	private int roomNo;
	private String roomType;
	private int roomArea;
	private String acMachine;

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}

	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}

	public void display() {
		System.out.println("Room no:" + roomNo + "  Room Type:" + roomType + "  room area(sqft):" + roomArea
				+ "  Acmachine:" + acMachine);
	}

}
