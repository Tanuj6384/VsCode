public class B_Reverse {
    public static void main(String[] args) {
        int n=123;
        int x=0;
        while(n>0){
            x=x*10+n%10;
            n=n/10;
        }
        System.out.println(x);
    }
}
/*
 123
 321
 */
