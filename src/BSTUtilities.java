import java.util.ArrayList;
import java.util.List;

public class BSTUtilities {

    public static List<Book> mergeSortedLists(List<Book> list1, List<Book> list2) {
        List<Book> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getId() < list2.get(j).getId())
                mergedList.add(list1.get(i++));
            else
                mergedList.add(list2.get(j++));
        }
        while (i < list1.size()) {
            mergedList.add(list1.get(i++));
        }
        while (j < list2.size()) {
            mergedList.add(list2.get(j++));
        }
        return mergedList;
    }

    public static List<Book> intersectSortedLists(List<Book> list1, List<Book> list2) {
        List<Book> intersectedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getId() < list2.get(j).getId())
                i++;
            else if (list1.get(i).getId() > list2.get(j).getId())
                j++;
            else {
                intersectedList.add(list1.get(i));
                i++;
                j++;
            }
        }
        return intersectedList;
    }
}
