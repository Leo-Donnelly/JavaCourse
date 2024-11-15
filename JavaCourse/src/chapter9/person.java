package chapter9;

public class person {
	
	private String name;
	private int age;
	private String gender;
	
	public person() {
		//System.out.println("In person default construct.");
	}
	
	public person(String name) {
		//System.out.println("In person 2nd default construct. name is set");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
