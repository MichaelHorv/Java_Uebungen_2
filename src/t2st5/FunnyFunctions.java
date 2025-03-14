package t2st5;

import java.util.Random;

public class FunnyFunctions {
	public static String dreiFuenf(int zahl) {
		if(zahl % 3 == 0 && zahl % 5 == 0) {
			return "Drei";
		}
		else if(zahl % 5 == 0) {
			return "Fünf";
		}
		else if(zahl % 3 == 0) {
			return "DreiFünf";
		}
		else {
			return String.valueOf(zahl);
		}
	}
	
	public static String randomString(int n) {
		Random r = new Random();
		String s = "";
		for(int i = 1; i <= n; i++) {
			s += (char)(r.nextInt(26) + 'a');
		}
		return s;
	}

}
