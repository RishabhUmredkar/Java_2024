package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
			Employee emp = new Employee(101, "Rishabh" , "abc123", 2001, 300000,"analyst","Manager", "hyd", "QS");
			System.out.println(emp.getId());
			System.out.println(emp.getname());
			System.out.println(emp.getDeptName());
			System.out.println(emp.getDeptNo());
			System.out.println(emp.getJob());
			System.out.println(emp.getLoc());
			System.out.println(emp.getSalary());
			emp.setLoc(30000);
			System.out.println(emp.getLoc());
			emp.setPass(101, "abc123", "admin");
			emp.setSalary("Manager", "pune");
			System.out.println(emp.getSalary());

			
			
			
	}

}
