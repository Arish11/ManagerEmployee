package managerEmp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Company {
	HashMap<Integer, List<Integer>> managerEmp;
	int managerId = 0;

	public Company() {
		managerEmp = new HashMap<>();
	}

	public void addEmployee(int managerId, int[] employeeIds) {
		managerEmp.put(managerId, new ArrayList<>());
		for (int employeeId : employeeIds) {
			managerEmp.get(managerId).add(employeeId);
		}
	}

	public boolean checkManagerStatus(Object object) {
		return managerEmp.containsKey(object);
	}

	public List<Integer> getEmployees(int managerId) {
		List employee = managerEmp.get(managerId);
		for (int i = 0; i < employee.size(); i++) {
			if (checkManagerStatus(employee.get(i))) {
				System.out.println(managerEmp.get(employee.get(i)));
			}
		}
		return employee;
	}
}

public class Main {

	public static void main(String[] args) {
		Company company = new Company();
		company.addEmployee(1, new int[] { 2, 3, 11, 12, 15 });
		company.addEmployee(2, new int[] { 4, 5, 8, 9, 0 });
		company.addEmployee(3, new int[] { 6, 7, 10 });
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id ");
		int searchId = sc.nextInt();
		System.out.println(company.getEmployees(searchId));

	}

}
