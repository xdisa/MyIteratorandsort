import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator {

    private static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<T>() {
            private int count = array.length;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }
//
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};

        String[] strings = new String[]{"uyfgkuhb","yugulg","kfyufduy","ygliuygf"};

        Iterator<Integer> integerIterator = getIterator(integers);

        Iterator<String> StringIterator = getIterator(strings);

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }


        while (StringIterator.hasNext()) {
            System.out.println(StringIterator.next());
        }

    }
}