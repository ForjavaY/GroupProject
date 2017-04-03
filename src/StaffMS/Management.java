package StaffMS;

import java.util.ArrayList;

public class Management {

	public double averageSalary(ArrayList<Employee> emplist) {
		double totalSalary = 0;
		for (int i = 0; i < emplist.size(); i++) {
			totalSalary += emplist.get(i).getSalary();
		}
		return totalSalary / emplist.size();
	}

	public String gender(ArrayList<Employee> emplist) {
		int female = 0;
		int male = 0;
		int unknown = 0;

		for (int i = 0; i < emplist.size(); i++) {
			Gender gender = emplist.get(i).getGender();

			if (gender == Gender.FEMALE) {
				female++;

			} else if (gender == Gender.MALE) {

				male++;
			} else
				unknown++;

		}

		return "There are " + female + " females, " + male + " males and " + unknown + " of Unknown gender";
	}
}


