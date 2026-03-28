// Definition for singly-linked list
class ListNode {
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
}

// Function to add two numbers
function addTwoNumbers(l1, l2) {

    let dummy = new ListNode(0)
    let curr = dummy
    let carry = 0
    while (l1!=null || l2!=null || carry != 0) {
        let n1= l1 ? l1.val : 0
        let n2= l2 ? l1.val : 0

        let sum=n1+n2+carry

        carry = Math.floor(sum/10)
        curr.next=new ListNode(sum%10)
        curr=curr.next
        l1=l1 ? l1.next : null
        l2=l2 ? l2.next : null

    }

    return dummy.next
}

// Helper: create linked list from array
function createList(arr) {
    let dummy = new ListNode(0);
    let current = dummy;

    for (let num of arr) {
        current.next = new ListNode(num);
        current = current.next;
    }

    return dummy.next;
}

// Helper: print linked list
function printList(head) {
    let result = [];
    while (head != null) {
        result.push(head.val);
        head = head.next;
    }
    console.log(result.join(" -> "));
}

// 🔥 Test Example
let l1 = createList([2, 4, 10, 7]); // represents 342
let l2 = createList([5, 6, 4]); // represents 465

let result = addTwoNumbers(l1, l2);

printList(result); // Expected: 7 -> 0 -> 8 (807)