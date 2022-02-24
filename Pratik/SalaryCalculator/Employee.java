package SalaryCalculator;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {

		if (this.salary > 1000)
			return (this.salary * 0.03);
		else
			return 0;

	}

	public int bonus() {
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}
		return 0;
	}

	public double raiseSalary() {
		this.hireYear = 2021 - this.hireYear;
		if (this.hireYear < 10) {
			return (this.salary * 0.05);
		} else if (this.hireYear > 9 && this.hireYear < 20) {
			return (this.salary * 0.10);
		} else if (this.hireYear > 19) {
			return (this.salary * 0.15);
		}
		return 0;
	}

	public void printEmployee() {
		System.out.println("Ad� :" + this.name);
		System.out.println("Maa�� :" + this.salary);
		System.out.println("�al��ma Saati :" + this.workHours);
		System.out.println("Ba�lang�� Y�l� :" + this.hireYear);
		System.out.println("Vergi :" + tax());
		System.out.println("Bonus :" + bonus());
		System.out.println("Maa� Art��� :" + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maa� :" + (this.bonus() - this.tax()+this.salary));
		System.out.println("Toplam Maa� :" + (this.bonus() - this.tax() + this.raiseSalary() + this.salary));
	}
}
