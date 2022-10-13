import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
    
    Scanner Scanner = new Scanner(System.in);
    
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    
    while(fileScanner.hasNextLine()){
			arrayList.add(fileScanner.nextLine());
      
		}
    
    int input = 0;
    
    do {
      System.out.println("Press 1 to learn about salary.");
			System.out.println("Press 2 to learn about the job.");
			System.out.println("Press 3 to learn about demand.");
			System.out.println("Press 4 to view current students.");
			System.out.println("Press 5 to quit.");
      
			input = Scanner.nextInt();
      
			if(input == 1){
        System.out.println("1$ per hour");
      }
      if(input == 2){
        System.out.println("Roblox game developer make games for children!");
      }
			if(input == 3){
        System.out.println("Your chances of getting hired is nothing. Start your own game, that is how you will get the job!");
      }
			if(input == 4){
        System.out.println("Current Students: ");
				for(String s : arrayList){
					System.out.println(s);
				}
      }

		}while(input != 5);

    
	}
}