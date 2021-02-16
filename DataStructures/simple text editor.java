import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner sc=new Scanner(System.in);
        int a, N=sc.nextInt();
        Stack<String> st=new Stack<>();
        st.push("");
        for(int i=0;i<N;i++){
            a=sc.nextInt();
            switch(a){
                case 1:
                st.push(st.peek()+sc.next());
                break;
                case 2:
                st.push(st.peek().substring(0,st.peek().length()-sc.nextInt()));
                break;
                case 3:
                
                bufferedWriter.write(st.peek().charAt(sc.nextInt()-1));
                bufferedWriter.newLine();
                break;
                case 4:
                st.pop();
                break;
            }
        }
        bufferedWriter.close();

        sc.close();
    }
}
