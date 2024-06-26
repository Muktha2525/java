public class Music {
    public static void main(String[] args) {
        // Declare 6 local variables
        String musicType[] = {"Classical","Pop music","Rap"};
        long pricePerSong[] ={1500000L,1200000L,1400000L};
        float albumPrice[] = {2456.6f,1983.6f,3975.3f};
        int numberOfSongs[] = {155,234,145,121};

    
        for(int array=0; array<musicType.length; array++){
		System.out.println("MUSIC TYPE : "+musicType[array]);
		}

		 for(int array=0; array< pricePerSong.length; array++){
		System.out.println("PRICE PER SONG : "+ pricePerSong[array]);
		}
		
		for(int array=0; array< albumPrice.length; array++){
		System.out.println("ALBUM PRICE : "+ albumPrice[array]);
		}
		
		for(int array=0; array< numberOfSongs.length; array++){
		System.out.println("NUMBER OF SONGS : "+ numberOfSongs[array]);
		}
    }
}
