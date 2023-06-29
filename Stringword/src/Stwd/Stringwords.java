package Stwd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stringwords {

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/Desktop/Java Project/Stringword/src/stwd/words.rtf";
        File file = new File(filePath);
        System.out.println("Type a letter that you want all the words to start with");
        if (file.exists()) {
        	
        } else {

        }
        
       Scanner sc = new Scanner(System.in);
       String wd = sc.next();
       char c = wd.charAt(0);
       
       words(c);
    }

    public static void words(char w) throws IOException {
        String filePath = "/Users/Desktop/Java Project/Stringword/src/stwd/words.rtf";

        ArrayList<String> wordsList = new ArrayList<>();

        File file = new File(filePath);
      Scanner sc = new Scanner(file);
            String line;
            int lineNumber = 0;

            while (sc.hasNextLine()) {
                String line1 = sc.nextLine();
                String[] words = line1.split(" ");
                wordsList.add(line1);
            
                       
            for (String word : words) {
                if (!word.isEmpty() && word.charAt(0) == w) {
                    System.out.println(word);
                }
            }
            
        }
            
    }
}
