package question8;

public class Manager2 {
   int salary;
   float bonus;
   
   public Manager2(int salary,float bonus) {
	   this.salary=salary;
	   this.bonus=bonus;
	   
   }
	public int getSalary() {
	   return (int) (salary+bonus);	
	}
}
