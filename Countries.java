public class Countries{

    public static void main(String[] args) {
        
        String countriesNames[] = {"INDIA","AUSTRALIA","AMERICA"};
        long population[] = {1380004385L, 3326785879L, 263457898L};
        double areaSqKm[] = {3287263.0,9833520.0,7692024.0};  
        int states[] = {28,6,50};  
        boolean isDemocratic[] = {true,true,false};
       
        
		for(int array=0; array<countriesNames.length; array++){
		System.out.println("COUNTRY NAME : "+countriesNames[array]);
		}

		 for(int array=0; array<population.length; array++){
		System.out.println("COUNTRY POPULATION : "+population[array]);
		}
		
		for(int array=0; array< areaSqKm.length; array++){
		System.out.println("AREA OF THE COUNTRY : "+ areaSqKm[array]);
		}
		
		for(int array=0; array< states.length; array++){
		System.out.println("STATES OF A COUNTRY : "+ states[array]);
		}
		
		for(int array=0; array< isDemocratic.length; array++){
		System.out.println("IS DEMOCRATIC COUNTRY : "+ isDemocratic[array]);
		}
		
		}
	}