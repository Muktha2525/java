public class Kruthika{
	public static void main (String[]args){
	
		String friendsList[]= {"Kavya","Pooja","Bhanu","Veeresh"};
		int usnNumbersList[]= {121,122,123,124};
		double marksList[]={98.5,87.5,22.4,73.6};
		boolean promotions[]={true,true,false,true};
		
		for(int array=0; array<friendsList.length; array++){
		System.out.println(" Friend :"+friendsList[array]);
		}

		 for(int array=0; array<usnNumbersList.length; array++){
		System.out.println("USN Number  :"+usnNumbersList[array]);
		}
		
		for(int array=0; array<marksList.length; array++){
		System.out.println("Mark :"+marksList[array]);
		}
		
		for(int array=0; array<promotions.length; array++){
		System.out.println("Promotion :"+promotions[array]);
		}
	}
}