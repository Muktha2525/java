public class Charger {
    // Declare 10 static variables
    static String brand[]={"TechBrand","SAMSUNG","SONY","ONEPLUS"};
    static double voltage[]={5.0,4.0,8.0,5.0};
    static float current[]={2.0f,5.0f,3.0f,5.0f};
    static boolean isWireless[]={true,false,true,false};
    static String color[]={"Black","white","black","white"};
    static double price[]={500.0f,575.5f,895.6f,675.0f};

   
    public static void main(String[] args) {
        
       
		 for(int array=0; array<brand.length; array++){
		System.out.println(" BRAND NAME : "+brand[array]);
		}

		 for(int array=0; array<voltage.length; array++){
		System.out.println("VOLTAGE OF THE CHARGER : "+voltage[array]);
		}
		
		for(int array=0; array< current.length; array++){
		System.out.println("CURRENT OF THE CHARGER : "+ current[array]);
		}
		
		for(int array=0; array<isWireless.length; array++){
		System.out.println("IS CHARGER IS AN WIRELESS: "+ isWireless[array]);
		}
	
		for(int array=0; array<color.length; array++){
		System.out.println(" COLOR OF THE CHARGER : "+ color[array]);
		}

		 for(int array=0; array< price.length; array++){
		System.out.println("PRICE OF THE CHARGER : "+ price[array]);
		}
	

	}
}
