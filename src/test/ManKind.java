package test;

public class ManKind {
	protected int sex;
	protected int salary;
	public  ManKind(int sex,int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void manOrWorman() {
		if(this.sex==0) {
			System.out.println("women");
		}else if(this.sex==1) {
			System.out.println("man");
		}else {
			System.out.println("error，please input 0 or 1");
		}
		
	}
	
	public void employeed() {
		if(this.salary<=0) {
			System.out.println("no job");
		}else {
			System.out.println("job");
		}
	}
}
