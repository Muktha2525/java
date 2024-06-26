public class Chair {
    // Declare 8 static variables
    static String material[]= {"wood","Plastic","Fibre"};
    static double height[] = {35.5,32.5,33.8};
    static float width[] = {18.0f,17.7f,16.6f};
    static double depth[] = {20.0,18.0,19.5};
    static boolean hasArmrests[]={true,true,false};
    static String type[]={"Dinner chair","Office Chair","Club Chair"};
    static long price[]={25000L,22000L,44000L};

		public static void main(String[]chairs){
			
				for(int array=0; array<material.length; array++){
		System.out.println(" MATERIAL NAME : "+ material[array]);
		}

		 for(int array=0; array<height.length; array++){
		System.out.println("HEIGHT OF THE CHAIR : "+height[array]);
		}
		
		for(int array=0; array< width.length; array++){
		System.out.println("WIDTH OF THE CHAIR : "+ width[array]);
		}
		
		for(int array=0; array<depth.length; array++){
		System.out.println("DEPTH OF THE CHAIR: "+depth[array]);
		}
	
		for(int array=0; array<hasArmrests.length; array++){
		System.out.println(" HAS ARMRESTS : "+ hasArmrests[array]);
		}

		 for(int array=0; array< type.length; array++){
		System.out.println("CHAIR TYPES : "+ type[array]);
		}
	
		
		for(int array=0; array<price.length; array++){
		System.out.println("PRICE OF THE CHAIR: "+price[array]);
		}
	}
}
