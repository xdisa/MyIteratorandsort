//CharacterCounter


import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main (String[] args) throws java.lang.Exception
    {
        String string = "qqwewrfeg";

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for ( int i = 0; i < string.length(); i++ ) {
            Integer n = map.get( string.charAt(i) );
            if ( n == null ) map.put( string.charAt(i), 1 );
            else map.put( string.charAt(i), ++n );
        }

        System.out.println(map);
    }
}
