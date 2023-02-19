class SinglyLinkedList {
    tail: any;
    head: any;
    insertNode(data) {
    }
}

function mergeLists(head1, head2) {
    let merged = new SinglyLinkedList()

    while (head1 && head2) {
        if (head1.data < head2.data) {
            merged.insertNode(head1.data);
            head1 = head1.next;
        } else {
            merged.insertNode(head2.data);
            head2 = head2.next;
        }
    }
    merged.tail.next = (head1) ? head1 : head2;
    return merged.head;
}
/*
 -----------------------------------------------------------
*/
class SinglyLinkedListNode {
    next: any;
    constructor(number: number) {
    }
}

function mergeLists2(head1, head2) {
    let result = new SinglyLinkedListNode(0);
    let current = result;

    while(head1 !== null && head2 !== null) {
        if (head1.data < head2.data) {
            current.next = head1;
            head1 = head1.next;
        } else {
            current.next = head2;
            head2 = head2.next;
        }
        current = current.next;
    }

    if (head1 !== null) {
        current.next = head1;
    } else if (head2 !== null) {
        current.next = head2;
    }

    return result.next;
}
/*
 -----------------------------------------------------------
*/
function mergeLists3(head1, head2) {
    let mergedList = new SinglyLinkedList();
    while (head1 || head2) {
        if (!head1) {
            mergedList.insertNode(head2.data);
            head2 = head2.next;
        } else if (!head2) {
            mergedList.insertNode(head1.data);
            head1 = head1.next;
        } else if (head1.data < head2.data) {
            mergedList.insertNode(head1.data);
            head1 = head1.next;
        } else {
            mergedList.insertNode(head2.data);
            head2 = head2.next;
        }
    }
    return mergedList.head;
}
/*
Time Complexity : O(n)
Space Complexity : O(n)

This solution is simple, we just create a new linked list and traverse through the 2 linked lists and storing them into the new one with a sorted order.
First, we declare the new linked list that we’ll use to store the merged sorted elements.
Then, we’ll use a while loop that’ll continue as long as either list still has an element to traverse.
In the while loop, we have to first check if either head of the linked lists is null. If it is, we store the opposing linked list’s head and traverse that linked list. We do this to avoid error when accessing null value.
Next, we check which head is smaller and store the smaller head so we can get a sorted linked list.
Finally, we return the merged and sorted linked list.
The code seems repetitive, but I have to do it this way to avoid error when accessing null value.
We’re using a while loop and a new linked list to store the linked list so we have O(n) time and O(n) space complexity.
 */