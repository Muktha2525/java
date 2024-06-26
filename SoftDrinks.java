public class SoftDrinks {
    public static void main(String[] args) {
        
        String softDrinks_Names[] = {"CoCola","COLD COFFEE","MILKSHAKE","GREEN TEA"};
        int softDrinksPrice[] = {25,50,45,30};
		double softDrinksML[] = {500.0,250.0,500.0,150.0};
		
		 for(int array=0; array<softDrinks_Names.length; array++){
		System.out.println(" SOFTDRINKS NAME : "+softDrinks_Names[array]);
		}

		 for(int array=0; array<softDrinksPrice.length; array++){
		System.out.println("SOFTDRINKS PRICE IS: "+softDrinksPrice[array]);
		}
		
		for(int array=0; array< softDrinksML.length; array++){
		System.out.println("SOFTDRINKS IN ML : "+ softDrinksML[array]);
		}
        
    }
}
