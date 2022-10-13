import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
    boolean loop = true;
    Scanner Scanner = new Scanner(System.in);
    
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    
    while(fileScanner.hasNextLine()){
			arrayList.add(fileScanner.nextLine());
      
		}

    do {
			System.out.println( "Press 1 to learn about salary." + "\n" +
                          "Press 2 to learn about the job." + "\n" +
                          "Press 3 to learn about demand." + "\n" +
                          "Press 4 to view current students." + "\n" +
                          "Press 5 to quit."
                        ); 
			char input = Scanner.next().charAt(0);
			if(input == '1'){
        System.out.println("1$ per hour");
      }
      if(input == '2'){
        System.out.println("Roblox game developer make games for children!");
      }
			if(input == '3'){
        System.out.println("Your chances of getting hired is nothing. Start your own game, that is how you will get the job!");
      }
			if(input == '4'){
        System.out.println("Current Students: ");
				for(String s : arrayList){
					System.out.println(s);
				}
      }
      if(input == '5'){
        loop = false;
      }
		}while(loop);

    
	}
}