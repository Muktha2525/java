public class Job{
	public static void main(String[]args){
		 String jobtitle [] = {"Asst Engineer","Manager","Developer","Tester"};
		 float ctcInLpa []= {5.5f,6.5f,4.0f,3.5f};
		 int experienceInYears[] = {1,3,5,7};
		 
			 for(int array=0; array<jobtitle.length; array++){
		System.out.println("JOB TITLE : "+jobtitle[array]);
		}

		 for(int array=0; array<ctcInLpa.length; array++){
		System.out.println("CTC IN LPA: "+ctcInLpa[array]);
		}
		
		for(int array=0; array< experienceInYears.length; array++){
		System.out.println("EXPERIENCE IN YEARS : "+ experienceInYears[array]);
		}
		}
	}