public class Cloth{
    public static void main(String[] args) {
        // Declare 5 local variables
        String clothType[] = {"COTTON","RAYON","SILK","WOOL"};
        String brand[] = {"FabIndia","ZUDIO","PUMA","ADIDAS"};
        double price[] = {1500.0,2500.98,5000.0,4300.87};
        int size[] ={36,30,28,34};

        
    
		 for(int array=0; array<clothType.length; array++){
		System.out.println(" CLOTH TYPE : "+clothType[array]);
		}

		 for(int array=0; array<brand.length; array++){
		System.out.println("BRAND OF THE CLOTH: "+brand[array]);
		}
		
		for(int array=0; array< price.length; array++){
		System.out.println("PRICE OF THE CLOTH : "+ price[array]);
		}
		
		for(int array=0; array<size.length; array++){
		System.out.println("SIZE OF THE  CLOTH: "+ size[array]);
		}
	
    }
}
