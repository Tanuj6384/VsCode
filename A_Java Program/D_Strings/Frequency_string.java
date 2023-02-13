import java.util.*;
public class Frequency_string {
    public static void main(String[] args) {
        String str="tanuj";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)==true){
                map.put(ch,map.get(ch));
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)>0){
                System.out.print(map.get(ch));
                map.put(ch,0);
            }
        }
    }
}
