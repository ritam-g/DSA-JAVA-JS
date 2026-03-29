// 🧩 Problem: Intersection of Two Linked Lists

// Node class
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// Function to find intersection
class Solution {
    findIntersection(head1, head2) {
        let p1 = head1;
        let p2 = head2;
        let dummy = new Node(0);
        let ans = dummy
        let set = new Set()
        //! here  we are storing the first linked list in set
        while (p1 != null) {
            set.add(p1.data)
            p1 = p1.next;
        }

        while (p2 != null) {
            if (set.has(p2.data)) {
                let newNode = new Node(p2.data)
                dummy.next = newNode
                dummy = dummy.next
            }
            p2 = p2.next
        }

        return ans.next


    }
}


// 🧪 Helper function to create linked list from array
function createLinkedList(arr) {
    let head = new Node(arr[0]);
    let temp = head;

    for (let i = 1; i < arr.length; i++) {
        temp.next = new Node(arr[i]);
        temp = temp.next;
    }

    return head;
}

// 🧪 Helper function to print linked list
function printLinkedList(head) {
    let result = [];
    while (head != null) {
        result.push(head.data);
        head = head.next;
    }
    console.log(result.join(" -> "));
}


// 🚀 Test Case
let head1 = createLinkedList([1, 2, 3, 4, 6]);
let head2 = createLinkedList([2, 4, 6, 8, 2]);

let sol = new Solution();
let result = sol.findIntersection(head1, head2);

printLinkedList(result);


// ✅ Expected Output:
// 2 -> 4 -> 6