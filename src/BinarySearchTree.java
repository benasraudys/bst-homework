import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private BSTNode root;

    public void insert(Book book) {
        root = insertRec(root, book);
    }

    private BSTNode insertRec(BSTNode root, Book book) {
        if (root == null) {
            root = new BSTNode(book);
            return root;
        }
        if (book.getId() < root.book.getId())
            root.left = insertRec(root.left, book);
        else if (book.getId() > root.book.getId())
            root.right = insertRec(root.right, book);
        return root;
    }

    public List<Book> inOrderTraversal() {
        List<Book> sortedBooks = new ArrayList<>();
        inOrderTraversalRec(root, sortedBooks);
        return sortedBooks;
    }

    private void inOrderTraversalRec(BSTNode node, List<Book> sortedBooks) {
        if (node != null) {
            inOrderTraversalRec(node.left, sortedBooks);
            sortedBooks.add(node.book);
            inOrderTraversalRec(node.right, sortedBooks);
        }
    }

    public static BinarySearchTree fromSortedList(List<Book> books) {
        return createBalancedBST(books, 0, books.size() - 1);
    }

    private static BinarySearchTree createBalancedBST(List<Book> books, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(books.get(mid));
        BinarySearchTree leftSubtree = createBalancedBST(books, start, mid - 1);
        BinarySearchTree rightSubtree = createBalancedBST(books, mid + 1, end);
        if (leftSubtree != null)
            bst.root.left = leftSubtree.root;
        if (rightSubtree != null)
            bst.root.right = rightSubtree.root;
        return bst;
    }

    public void printBST() {
        printBSTRec(root);
    }

    private void printBSTRec(BSTNode node) {
        if (node != null) {
            printBSTRec(node.left);
            System.out.println(node.book);
            printBSTRec(node.right);
        }
    }
}
