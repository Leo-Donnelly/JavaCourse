package chapter9;

public class employee extends person{
	
	private String employeeId;
	private String title;
	
	public employee() {
		super("angie");
		System.out.println("In deafult employee construct.");
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
