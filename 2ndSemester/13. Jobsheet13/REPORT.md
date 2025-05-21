|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020083|
| Nama |  Zid'Avwa Al Bari'i |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/ZidAvwa/CollegeStudy/tree/main/2ndSemester) |

# Labs #13 Double Linked Lists

## 13.1 Experiment 1

The lab is implemented in DoubleLinkedLists.java, Student.java, Node.java, and DoubleLinkedListsMain.java

**Questions:**

1. **Difference between singly and doubly linked list:**

   * Singly linked list has only a `next` pointer; can only move forward.
   * Doubly linked list has both `next` and `prev`; can move forward and backward.

2. **Purpose of `next` and `prev` in `Node`:**

   * `next` points to the next node.
   * `prev` points to the previous node.

3. **Purpose of constructor in `DoubleLinkedLists`:**

   * Initializes an empty list by setting `head` and `tail` to `null`.

4. **Meaning of `if (isEmpty()) { head = tail = newNode; }`:**

   * If list is empty, the new node becomes both head and tail.

5. **Meaning of `head.prev = newNode`:**

   * Sets the previous pointer of the current head to the new node being added in front.

6. **Meaning of `current.next.prev = newNode`:**

   * Updates the previous pointer of the node after the current one to link back to the new node.

7. **Traversal method:**

   * Implemented in `insertAfter()` and `print()`.
   * `temp = temp.next` moves to the next node.

8. **Meaning of `if (temp == tail) { addLast(data); }` in `insertAfter`:**

   * If the key is found in the tail node, simply add after using `addLast()`.
   * If removed, `insertAfter` would not work for tail properly.

9. **Meaning of `if (temp.data.nim.equalsIgnoreCase(key))`:**

   * Checks if the current node matches the key (NIM) to decide where to insert the new node.

## 13.2 Experiment 2

The lab is implemented in DoubleLinkedLists.java, Student.java, Node.java, and DoubleLinkedListsMain.java

**Questions:**

1. **What is the use of `head = head.next; head.prev = null;` in `removeFirst()`?**

   * Moves the head to the next node, and breaks the link to the previous head node.

2. **Why is this condition used: `else if(head == tail) { head = tail = null; }`?**

   * It ensures both head and tail are cleared when there is only one node in the list.

3. **If there is no `tail` attribute, how to update `removeLast()`?**

   * Traverse from `head` to find the second last node, then set `secondLast.next = null`.

4. **Purpose of `if (isEmpty())` in `remove(int index)`?**

   * Prevents errors by checking if the list is empty before trying to remove any node.

5. **How does `remove(int index)` handle the first and last node?**

   * If index is 0, it calls `removeFirst()`. If node is `tail`, it calls `removeLast()`.

6. **How does the method update links when removing a middle node?**

   * It sets `temp.prev.next = temp.next` and `temp.next.prev = temp.prev` to skip over `temp`.

7. **How to handle invalid index (negative or out of bounds)?**

   * Add checks like `if (index < 0)` and `if (temp == null)` inside the loop and before deletion.

## 13.3. Assignment

The Assignment is implemented in Student.java, Node.java, DoubleLinkedLists.java, and DoubleLinkedListsMain.java

1. Add an add() function to the DoubleLinkedList class to insert a node at a specific index. 
**Modification of DoubleLinkedLists.java at lines A - B**

    ![Screenshot](img/A.png)

2. Add a removeAfter() function to the DoubleLinkedList class to delete the node that comes after the node containing a specified key.
**Modification of DoubleLinkedLists.java at lines A - B**
    
    ![Screenshot](img/A.png)

3. Add the methods getFirst(), getLast(), and getIndex() to retrieve data from the head node, tail node, and node at a specific index, respectively.
**Modification of DoubleLinkedLists.java at lines A - B**

    ![Screenshot](img/A.png)

4. Add a method getSize() to return the number of DoubleLinkedLists data!
**Modification of DoubleLinkedLists.java at lines A - B**

    ![Screenshot](img/A.png)

5. Add method indexOf() to return the index of a specific data specified by key (nim)!
**Modification of DoubleLinkedLists.java at lines A - B**

    ![Screenshot](img/A.png)

**Modification of DoubleLinkedListsMain.java at lines A - B to run the Modifications**

![Screenshot](img/A.png)
