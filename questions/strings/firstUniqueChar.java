import java.util.HashMap;

public class firstUniqueChar{
    static int uniqueChar(String str ){
        int index =-1;
        HashMap<Character,Integer> maap= new HashMap<>();
        str=str.toLowerCase();

        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);

            int  freq=maap.getOrDefault(c, 0);

            maap.put(c,freq+1);
        }
        for(int i=0;i<str.length();i++){  
            if(maap.get(str.charAt(i))==1){
                index =i;
                break;

            }
        }
        return index;
    }
    public static void main(String[] args) {
        String str = "fourByFourFrog";
        System.out.println(uniqueChar(str));
    }
}