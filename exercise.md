# Union and Intersection of Binary Search Trees (BST)

## Union of BSTs
- Create two BSTs storing books with unique IDs and titles.
- Merge the BSTs into one height-balanced BST with the lowest possible height:
    1. In-order traverse both initial BSTs and store values in sorted lists.
    2. Merge the sorted lists into one sorted list.
    3. Construct a height-balanced BST from the merged sorted list:
        - Add middle element from the list to the final BST.
        - Recursively add middle elements from left and right sides of the list.
- Print all trees and lists.

## Intersection of BSTs
- Create two BSTs storing books with unique IDs and titles.
- Intersect the BSTs (find common elements) and create a height-balanced BST with the lowest possible height:
    1. In-order traverse both initial BSTs and store values in sorted lists.
    2. Intersect the sorted lists into one sorted list.
    3. Construct a height-balanced BST from the intersected sorted list:
        - Add middle element from the list to the final BST.
        - Recursively add middle elements from left and right sides of the list.
- Print all trees and lists.
