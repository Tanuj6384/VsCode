import java.util.*;
public class D_Armstrong_Number {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int c=n;
   int rem=0;
   int arm=0;
   while(n>0){
      rem=n%10;
      arm=(rem*rem*rem)+arm;
      n=n/10;
   }
   if(c==arm){
      System.err.println("arm");
   }
   else{
      System.out.println("not");
   }
}
}
// 153

// n1*n2 = hcf*lcm
// (n1*n2/HCF) = lcm