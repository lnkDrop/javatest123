package test;

public class Kid extends ManKind{
	
	public Kid(int sex, int salary) {
		super(sex, salary);
		// TODO Auto-generated constructor stub
	}

	int yaersOld;
	
	public int getYaersOld() {
		return yaersOld;
	}
	public void setYaersOld(int yaersOld) {
		this.yaersOld = yaersOld;
	}
	public void printAge() {
		System.out.println(this.yaersOld);
	}
	
	@Override
	public void employeed() {
		super.employeed();
		System.out.println("but kids should study,so no job");
	}
	
	public static void main(String[] args) {
		
		Kid somekid = new Kid(0,200);
		somekid.manOrWorman();
		somekid.employeed();
	}
	
	
}
