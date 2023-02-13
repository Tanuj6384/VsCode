public class A_String2 {
    public static void main(String[] args) {
        String s1="this is demo";
        
        System.out.println(s1.subSequence(3,9));
        //s is d
        
        System.out.println(s1.substring(3));
        //s is demo

        System.out.println(s1.substring(3,11));
        //s is dem
    }
}
