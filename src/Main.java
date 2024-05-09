import java.util.List;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.insert(new Book(1, "Book One"));
        bst1.insert(new Book(3, "Book Three"));
        bst1.insert(new Book(5, "Book Five"));

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(new Book(2, "Book Two"));
        bst2.insert(new Book(3, "Book Three"));
        bst2.insert(new Book(6, "Book Six"));

        List<Book> sortedList1 = bst1.inOrderTraversal();
        List<Book> sortedList2 = bst2.inOrderTraversal();

        List<Book> mergedList = BSTUtilities.mergeSortedLists(sortedList1, sortedList2);
        BinarySearchTree mergedBST = BinarySearchTree.fromSortedList(mergedList);
        mergedBST.printBST();

        List<Book> intersectedList = BSTUtilities.intersectSortedLists(sortedList1, sortedList2);
        BinarySearchTree intersectedBST = BinarySearchTree.fromSortedList(intersectedList);
        intersectedBST.printBST();
    }
}
