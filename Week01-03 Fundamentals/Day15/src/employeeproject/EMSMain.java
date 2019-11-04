package employeeproject;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EMSMain {

	public static void main(String[] args) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		Map<Integer,Employee> employeeList = new TreeMap<>();

		while(true) {
			System.out.println("1. ADD\n" + "2. REMOVE\n" + "3. MODIFY\n" + "4. PRINT\n" + "5. EXIT");
			try {
				int method = scanner.nextInt();
				if(method == 1) {
					Employee e = new Employee();
					int id;
					
					System.out.println("ENTER ID:");
					id  = scanner.nextInt();
					
					if(!employeeList.containsKey(id)) {
						e.setId(id);
						
						System.out.println("ENTER FIRST NAME:");
						e.setFirstName(scanner.next());
						
						System.out.println("ENTER LAST NAME:");
						e.setLastName(scanner.next());
						
						System.out.println("ENTER DEPARTMENT:\n1.ACCOUNTING\n2.HR\n3.DEVELOPMENT\n4.SALES");
						int depart = scanner.nextInt();
						e.setDepartment(depart);
						System.out.println("Input type not an integer closing program.");
						
						System.out.println("ADDED EMPLOYEE:\n" + e);
						employeeList.put(e.getId(), e);
					} else {
						System.out.println("ID already exists. Please try again.");
					}
				} else if(method == 2) {
					System.out.println("Enter an ID to remove:");
					int id = scanner.nextInt();
					
					if(employeeList.containsKey(id)) {
						System.out.println("Employee Removed: " + employeeList.get(id));
						employeeList.remove(id);
					} else {
						System.out.println("Employee ID doesn't exist.");
					}
				} else if(method == 3) {
					System.out.println("Enter ID to modify:");
					int id = scanner.nextInt();
					
					if(employeeList.containsKey(id)) {
						Employee e = employeeList.get(id);
						System.out.println(id + " Found");
						
						System.out.println("ENTER DEPARTMENT:\n1.ACCOUNTING\n2.HR\n3.DEVELOPMENT\n4.SALES");
						int depart = scanner.nextInt();
						e.setDepartment(depart);
						
						System.out.println("Department changed: " + employeeList.get(id));
					} else {
						System.out.println("Employee ID doesn't exist.");
					}
				} else if(method == 4) {
					System.out.println("Employee List");
					System.out.println("------------------------------------------------------------------");
					
					for(Map.Entry<Integer, Employee> entry : employeeList.entrySet()) {
						System.out.println(entry.getValue().toString());
					}
				} else if(method == 5) {
					System.out.println("Thank you for using Employee management system!");
					break;
				}
				System.out.println();
			}
			catch(InputMismatchException exception) {
				System.out.println("Input type not an integer closing program.");
				break;
			}
		}
		
		
		scanner.close();
	}

}
