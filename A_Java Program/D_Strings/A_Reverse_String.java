public class A_Reverse_String {
    public static void main(String[] args) {
        String str="deepak";
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);
    }
}
