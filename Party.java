public class Party {

    public static void main(String[] args) {
       
        String hostName[] = {"Alankara Decorer","Anusha decorer","Vijrumba decorer"};
        int numberOfGuests[] = {25,35,68};
        boolean isCatered[] = {true,true,false};
        String theme[]= {"Naming Ceremony","Marriage ceremony","Engagement Ceremony"};

        
        for(int array=0; array<hostName.length; array++){
		System.out.println("HOST NAME : "+hostName[array]);
		}

		 for(int array=0; array< numberOfGuests.length; array++){
		System.out.println("NO OF GUESTS ARRIVING : "+ numberOfGuests[array]);
		}
		
		for(int array=0; array< isCatered.length; array++){
		System.out.println("IS IT CATERED : "+ isCatered[array]);
		}
		
		for(int array=0; array< theme.length; array++){
		System.out.println("THEME OF THE EVENT : "+ theme[array]);
		}
    }
}
