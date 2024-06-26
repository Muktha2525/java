public class Telivision{

	static String tv_Companies[] = {"SAMSUNG","SONY","LG","PANASONIC"};
	static char tv_Rows[] = {'a','b','c','d'};
	static long tv_Price[] = {40000L,60000L,28000L,25000L};
	static int tv_inches[] = {32,43,55,65};
	
	public static void main (String[]telivision){
		
		
		for(int array=0; array<tv_Companies.length; array++){
		System.out.println(" TV COMPANY NAME : "+ tv_Companies[array]);
		}

		 for(int array=0; array<tv_Rows.length; array++){
		System.out.println("TV Rows : "+tv_Rows[array]);
		}
		
		for(int array=0; array< tv_Price.length; array++){
		System.out.println("TV PRICE : "+ tv_Price[array]);
		}
		
		for(int array=0; array<tv_inches.length; array++){
		System.out.println("TV SIZE: "+tv_inches[array]);
		}
	}
}