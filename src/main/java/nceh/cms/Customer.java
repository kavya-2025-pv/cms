package nceh.cms;

public class Customer {
	String empFirstname;
	String empLastName;
	long empId;
	double empSalary;
	String empEmail;
	public Customer(String empFirstname, String empLastName, long empId, double empSalary, String empEmail) {
		super();
		this.empFirstname = empFirstname;
		this.empLastName = empLastName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "Customer [empFirstname=" + empFirstname + ", empLastName=" + empLastName + ", empId=" + empId
				+ ", empSalary=" + empSalary + ", empEmail=" + empEmail + "]";
	}
	

}
