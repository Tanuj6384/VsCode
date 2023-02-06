public class A_String1 {
    public static void main(String[] args) {
        String s1="deepak";
        String s2="java";

        System.err.println(s1+s2); //deepak java
        System.out.println(s1+10); //deepak10
        System.out.println(s1+10+20);//deepak1020
        System.out.println(10+s1+20);//10deepak20
        System.out.println(10+20+s1);// 30deepak
        System.out.println(s1+20/10);//deepak2
        System.out.println(s1+10*20);//deepak200

      //System.out.println(s1+10-20);//error

      System.out.println(s1.concat(s2));// deepak java
      System.out.println();
    }
}
