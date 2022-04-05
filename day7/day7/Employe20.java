package com.day7;

public class Employe20 {

	public Employe20() {
		System.out.println("In constructor");
	}

	public int calculatesalary(int salary) {
		return salary;
	}

	public int calculatebonus(int bonus) {
		return bonus;
	}

	public void show() {
		System.out.println("Salary is:" + calculatesalary(1000));
		System.out.println("Bonus is :"+ calculatebonus(1200));

	}

	public static void main(String[] args) {
		Employe20 e = new Employe20();
		e.show();
	}
}
