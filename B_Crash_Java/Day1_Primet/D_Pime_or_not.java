import java.util.*;
public class D_Pime_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i==0 || i==1){
                continue;
            }
        }
        int count=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.print("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
