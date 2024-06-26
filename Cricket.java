public class Cricket{
	public static void main (String[]args){
	
		String teamsList[]= {"RCB","CSK","MI","RR"};
		int scoresList[]= {220,122,153,204};
		int pointsList[]={14,10,4,12};
		boolean playoff[]={true,true,false,true};
		
		
		for(int array=0; array<teamsList.length; array++){
		System.out.println(" Teams: "+teamsList[array]);
		}

		 for(int array=0; array<scoresList.length; array++){
		System.out.println("Score : "+scoresList[array]);
		}
		
		for(int array=0; array<pointsList.length; array++){
		System.out.println("Points : "+pointsList[array]);
		}
		
		for(int array=0; array<playoff.length; array++){
		System.out.println("Playoff : "+playoff[array]);
		}
	}
}