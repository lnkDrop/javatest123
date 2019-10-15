package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import sun.security.util.Length;

public abstract class txt {
	
	public abstract void code();
	
	public final void getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}
	

	
}

class Test extends txt{
	
	@Override
	public void code() {
		int k = 0;
		for(int i=0;i<500000;i++) {
			k+=1;
		}
		System.out.println(k);
	}
	
}

