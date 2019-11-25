package ca.glebestudents;

public class Group {
	//teacher name and number of students: the two required fields of data for a class of students
	private String teacherName;
	private int numStudents;
	
	//constructor which splits apart a string of data, separating it into the two types of data required
	public Group(String dataInput) {
		String[] dataSplit = dataInput.split(",");
		teacherName = dataSplit[0].trim();
		numStudents = Integer.parseInt(dataSplit[1].trim());
	}
	
	//"getters" for the two fields
	public String getTeacherName() {
		return teacherName;
	}
	public int getNumStudents() {
		return numStudents;
	}
}