import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            switch(a){
                case 1:
                s2.push(sc.nextInt());
                break;
                case 2:
                if(!s1.isEmpty()){s1.pop();}
                else{
                    while(!s2.isEmpty()){
                        s1.push(s2.pop());
                    }
                    s1.pop();
                }
                break;
                case 3:
                if(!s1.isEmpty()){System.out.println(s1.peek());}
                else{
                    while(!s2.isEmpty()){
                        s1.push(s2.pop());
                    }
                    System.out.println(s1.peek());
                }
                break;
            }
        }
        sc.close();
    }
}
