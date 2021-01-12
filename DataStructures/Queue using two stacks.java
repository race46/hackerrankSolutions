import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            switch(a){
                case 1:
                q.add(sc.nextInt());
                break;
                case 2:
                q.remove();
                break;
                case 3:
                System.out.println(q.peek());
                break;
            }
        }
        sc.close();
    }
}
