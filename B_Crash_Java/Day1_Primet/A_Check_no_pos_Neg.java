import java.util.*;
public class A_Check_no_pos_Neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Postitive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
/*
-6
Negative
 */
