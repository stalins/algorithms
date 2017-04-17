
public class LPSS {
	
	@SuppressWarnings("unused")
	private static String palindromic(String str) {
		
		int max_length = 1;
		int cur_length = 1, startIndex = 0;
		
		Boolean pal[][] = new Boolean[str.length()][str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				pal[i][j] = false;
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			pal[i][i] = true;
		}
				
		for(int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
					pal[i][i+1] = true;
					max_length = 2;
					startIndex = i;
			}
		}
		
		
		for (int i = 2; i < str.length(); i++) 
			for (int j = 0; j < str.length()-i; j++) {
				int k = i + j;
				System.out.println(i+  "  "+j+"  "+k);
				if (str.charAt(j) == str.charAt(k) && pal[j+1][k-1]) {
					pal[j][k] = true;
					max_length = i;
					startIndex = j;
				}				
			}
		
		System.out.println(startIndex + "  "+ max_length);
		System.out.println(str.substring(startIndex, max_length+startIndex+1));
		
		
		
		return str;			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "elmadamlest";
		palindromic(str);

	}

}
