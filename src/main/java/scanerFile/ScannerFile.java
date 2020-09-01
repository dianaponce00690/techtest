package scanerFile;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class  ScannerFile {

    public String longestWord = "";

    public String getLongestWord() {
        try {
            Scanner sc = new Scanner(new File("resources/example.txt"));

            while (sc.hasNext()) {
                String current = sc.nextLine();
                if (current.length() > longestWord.length()) {
                    longestWord = current; }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The longest word is: "+ longestWord);

        return longestWord;

    }


    public String reverseLongestWord(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(longestWord);
        return stringBuilder.reverse().toString();
    }


    public boolean isLongestWordAlphabetic() {
        return longestWord.matches("^[a-zA-Z]*$");
    }


}


