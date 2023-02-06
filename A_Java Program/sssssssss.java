import java.util.*;
public class sssssssss {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=n1;
   int x=0;
   while(n1>0){
      x=x*10 +n1%10;
      n1=n1/10;
   }
   if(x==n2){
      System.out.println("pal");
   }
   else{
      System.out.println("not");
   }
   
}
}


// n1*n2 = hcf*lcm
// (n1*n2/HCF) = lcm