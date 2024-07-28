package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Aneesh.Mathai
 */
public class SearchStringInFile {

	public static void main(String[] args) throws FileNotFoundException {
		 File file =new File("D:/Eclipse Workspace/Programs/CodeingQuestions/src/programs/textFile.txt");
			 String s="dummy";
			 boolean flag=false;
			 try (Scanner scanner = new Scanner(file)) {
				while(scanner.hasNextLine()) {
					String nextLine= scanner.nextLine();
					
					if(nextLine.contains(s)) {
						System.out.println("Found the specified String");
						flag=true;
						break;
					}else {
						flag= false;
					}
				 }
				 scanner.close();
				 if(!flag) {
					 System.out.println("String is not present in the file");
				 }
			}
	}

}
