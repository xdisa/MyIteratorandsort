//CharacterCounter


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
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

        System.out.println(sortByValue(map));

    }
//SORT
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map ) {
        List<Map.Entry<K, V>> list =
            new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        Collections.reverse(list);
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list)
        {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
