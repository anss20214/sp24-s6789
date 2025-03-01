import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (Integer i : L) {
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evens = new ArrayList<Integer>();
        for (Integer i : L) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        return evens;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {

        List <Integer> comlist = new ArrayList<Integer>();
        for (Integer i : L2) {
            if (L1.contains(i)) {
                comlist.add(i);
            }
        }
        return comlist;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int num = 0;
        String targetstr = String.valueOf(c);
        for (String w : words) {
            if (w.contains(targetstr)){
                num ++;
            }
        }

        return num;
    }
}
