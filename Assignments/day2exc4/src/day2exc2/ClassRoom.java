package day2exc2;

/**
 * 4. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.
 */
import day2exc2.service.ClassDetails;

public class ClassRoom {

	public static void main(String[] args) {
		ClassDetails classDetails = new ClassDetails();
		classDetails.setRoomNo(1);
		classDetails.setRoomType("AC Room");
		classDetails.setRoomArea(145);
		classDetails.setAcMachine("Samsung 3star");
		classDetails.display();
		classDetails = null;

	}

}
