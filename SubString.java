
public class SubString {
	

	static private int min(int a, int b) {

		return a>b?b:a;
	}

	static int sstring(String str) {
	
		int l = str.length();
		int cMin = 0;		
		int dp[][] = new int[l][l];
		
		
		for(int i = 1; i < l; i++) 
			for(int j = 0; j < l-i; j++) 
			{
				int k = j+i;
				
				if ((str.charAt(j) == 'a' && str.charAt(k) == 'b') ||
					(str.charAt(j) == 'b' && str.charAt(k) == 'a')) {
					
					dp[j][k] = i+1;						
					cMin = min(i+1, cMin);
					if (cMin == 0)
						cMin = i+1;
				}											
				
			}
		
		return cMin;
	}
	
	public static void main(String args[]) {
		
		String c = "";
//		String str = "Hi bow are You";
		String str = "ahhhxb";

		int val = sstring(str);
		System.out.println(val);

	}
}
