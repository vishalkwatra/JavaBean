package ey.hr.lms.code;

public class Student {
	public String firstName;
	public String lastName;
	public String location;

	public Student() {
		firstName = "Big";
		lastName = "Dino";
		location = "Jungle";
	}
	
	public void onStart() {
		System.out.println("***Object of Student Created****");
	}
	
	public void onEnd() {
		System.out.println("***Object of Student Ended****");
	}
	
	
	// Getter and Setter
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String changeValue() {
		return "Mr." + this.firstName + " Lives in " + this.location;
	}

	public void changeValueofLocation() {
		this.location = this.location + "/Inside";
	}

	public String giveFullName() {
		return this.firstName + " " + this.lastName;
	}

	public String giveLocation() {
		return this.location;
	}

	public String giveAllInString() {
		return "Name: " + this.firstName + " " + this.lastName + ", Location: " + this.location;
	}
}
