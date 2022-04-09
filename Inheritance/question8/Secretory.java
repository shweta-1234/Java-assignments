package question8;

public class Secretory extends Manager2 {

	public Secretory() {
		super(10000, 3000);
	}

	public int getSalary() {
		return (int) (salary + bonus);
	}
}
