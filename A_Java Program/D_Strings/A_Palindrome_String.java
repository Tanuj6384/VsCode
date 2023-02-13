import java.util.*;
public class A_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sol(str);
    }
    public static void sol(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
/*
 naman
palindrome
 */
