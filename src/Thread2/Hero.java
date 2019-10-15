package Thread2;

public class Hero {
	public String name;
	public int hp;
	public int damage;
	public synchronized void recover() {
		
		hp=hp+1;
		System.out.printf("%s回血1点，血量是%d\n",name,hp);
		this.notify();
	}
	
	public synchronized void hurt() {
		if(hp==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hp=hp-1;
		System.out.printf("%s减血1点，血量是%d\n",name,hp);
		
	}
	
	public void attackHero(Hero h) {
		h.hp -= damage;
		System.out.printf("%s正在攻击%s,%s剩余血量%d\n",name,h.name,h.name,h.hp);
		if(h.isDead()) {
			System.out.printf("%s死了!",h.name);
		}
	}
	
	public boolean isDead() {
		return hp <= 0? true:false;
	}
	
}
