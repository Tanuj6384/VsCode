public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=2*n-1; i++){
            for(int k=0; k<=n-i; i+=2){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
