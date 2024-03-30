// all substrings of a string

public class substring{
    public static void subStrin(String word){
        for(int start=0;start<word.length();start++){
            for(int end=start+1;end<=word.length();end++){
               System.out.println(word.substring(start, end));
            }
        }
    }
    public static void main(String[] args) {
        subStrin("abc");
    }
}