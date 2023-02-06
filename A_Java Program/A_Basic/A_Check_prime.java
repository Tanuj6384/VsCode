public class A_Check_prime {
    public static void main(String[] args) {
        int n=37;
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
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
