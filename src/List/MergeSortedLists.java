package List;
import java.util.*;
public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 7));
        System.out.println("Merged Sorted List: " + mergeSortedLists(list1,list2));
    }
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++; // ONLY i moves
            } else {
                result.add(list2.get(j));
                j++; // ONLY j moves
            }
        }
        /*j has already become 4 and so ended but i is still 3 and so it runs 1 more time in below loop
        and ends in this case*/
        //to adds remaining element
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
}
