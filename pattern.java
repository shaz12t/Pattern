import java.io.*;
import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("x");
            }
            System.out.print("\n");
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1|| j == 1||j==m || i==n){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.print("\n");
        }
        
    }
}