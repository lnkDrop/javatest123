package Thread;

public class Hero {
	public int hp;
	public String name;
	public int damage;
	
	public void attack(Hero h) {
//		try {
//			Thread.sleep(500); //去掉暂停时间可以观察进程优先级
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		h.hp-=damage;
		System.out.println(name+"攻击了"+h.name+",造成"+damage+"点伤害，"+h.name+"剩余"+h.hp+"点血量");
		if(h.isDead()) {
			System.out.println(h.name+"死了！");
		}
	}
	
	public boolean isDead() {
		return hp<=0?true:false;
	}
	
}
