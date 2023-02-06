import java.util.*;
public class A_Prime_range {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low; i<=high; i++){
            if(i==0 || i==1){
                continue;
            }
            int count=0;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
            System.out.println(i);
        }
    }
    }
}
/*
 1-10
2
3
5
7
 */
