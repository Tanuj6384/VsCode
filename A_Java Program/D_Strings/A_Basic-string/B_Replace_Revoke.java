public class B_Replace_Revoke {
    public static void main(String[] args) {
        String s1="this is demo";

        System.out.println(s1.replace("is","was"));
        //thwas was demo

        System.out.println(s1.replaceFirst("is","was"));
        //thwas is demo
    }
}
