package Object;

public class StudentDriver {

	public static void main(String[] args) {
		Student st1 = new Student("Rishabh", 21, "KDK",99.9,2024);
		Student st2 = new Student("Rishabh", 21, "KDK",99.9,2024);
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.toString());
		System.out.println(st1.hashCode());
	
		System.out.println(st1.getClass().getName()+"@"+Integer.toHexString(st1.hashCode()));
		System.out.println(st1.getClass().getName());
	}
}