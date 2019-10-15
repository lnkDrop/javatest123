package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sun.security.util.Password;

public class password {
	
	
	public static String randomString(int charnum) {
		String s = "";
		int min = '0';
	    int max = 'z'+1;
	    int count = 0;
	    for(int i=0;count<charnum;i++){
	       int a1 = new Random().nextInt(max-min)+min;
	       char a = (char) a1;
	       if(Character.isDigit(a)||Character.isLetter(a)){
	          
	          s+=a;
	          count++;
	          
	          }
	      }
	    System.out.println("password:"+s);
	    return s;
	}
	
	
	
	
	public static void getpassword() {
		String p = password.randomString(3);
		char[] gesps = new char[3];
		for(int j='0';j<='z';j++) {
			for(int k='0';k<='z';k++) {
				for(int l='0';l<='z';l++) {
					char c1 = (char)j;
					char c2 = (char)k;
					char c3 = (char)l;
					gesps[0]=c1;
					gesps[1]=c2;
					gesps[2]=c3;
					String s = new String (gesps);
					if(s.equals(p)) {
						System.out.println("已找到密码："+s);
						break;
					}
					}
				}
				
			}
			
		
		
	}
	
	
	
	
	public static ArrayList<String> pwdlist = new ArrayList<String>();
	
	public static void getPassword2(char[] gesps,int i,String p) {
		
		for(int j='0';j<'z';j++) {
			char c = (char) j;
			if (!Character.isLetterOrDigit(c)) {    //调用方法，只要不是字母或者数字就进入
                continue;                           //排除字符，进入下次循环（不是跳出循环）
            }
			gesps[i] = c;
			if(i!=gesps.length-1) {
				getPassword2(gesps, i+1, p);
			}else {
				String gespsS = new String(gesps);
//				pwdlist.add(gespsS);
//				System.out.println("当前容器大小为:"+pwdlist.size());
				if(gespsS.equals(p)) {
					

					System.out.println("已找到密码"+gespsS);
					break;
				}
			}
		}
		
	}
	
	public static void gp(char[] gesps,String p) {
		getPassword2(gesps, 0, p);
	}
	
	
	public static void getPassword3(char[] gesps,int i,String p) {
		
		for(int j='z';j>'0';j++) {
			char c = (char) j;
			if (!Character.isLetterOrDigit(c)) {    //调用方法，只要不是字母或者数字就进入
                continue;                           //排除字符，进入下次循环（不是跳出循环）
            }
			gesps[i] = c;
			if(i!=gesps.length-1) {
				getPassword2(gesps, i+1, p);
			}else {
				String gespsS = new String(gesps);
//				pwdlist.add(gespsS);
//				System.out.println("当前容器大小为:"+pwdlist.size());
				if(gespsS.equals(p)) {
					

					System.out.println("已找到密码"+gespsS);
					break;
				}
			}
		}
		
	}

	public static void gp2(char[] gesps,String p) {
		getPassword2(gesps, 0, p);
	}
	
		
}

