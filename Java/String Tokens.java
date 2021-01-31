import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] words = s.split("[^a-zA-Z]+");
        if(words.length==0){
            System.out.println(0);
            return;
        }
        if(words[0].trim().equals("")){
            System.out.println(words.length-1);
        }else{
            System.out.println(words.length);
            System.out.println(words[0].trim());
        }


        for (int i=1;i<words.length;i++) {
            System.out.println(words[i].trim());
        }
        scan.close();
    }
}

