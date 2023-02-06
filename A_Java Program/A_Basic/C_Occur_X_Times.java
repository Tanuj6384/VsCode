import java.util.*;
public class C_Occur_X_Times {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        while(n1>0){
            if(n1%10==n2){
                count++;
            }
            n1=n1/10;
        }
        System.out.println(count);
    }
}
/*
 1121231
 1=4
 */