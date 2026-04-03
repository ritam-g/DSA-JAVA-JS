/*
🧩 Problem: Rotate List

📝 Description:
Given the head of a singly linked list, rotate the list to the right by k places.
*/

class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.val = val ?? 0;
        this.next = next ?? null;
    }
}

function rotateRight(head: ListNode | null, k: number): ListNode | null {
    if (!head || !head.next || k === 0) return head;

    // Step 1: Find length and tail
    let length = 1;
    let tail = head;

    while (tail.next !== null) {
        tail = tail.next;
        length++;
    }

    // Step 2: Make circular
    tail.next = head;

    // Step 3: Calculate effective rotations
    let move = length - (k % length);

    // Step 4: Find new tail
    let newTail = head;
    for (let i = 1; i < move; i++) {
        newTail = newTail.next!;
    }

    // Step 5: Break and get new head
    let newHead = newTail.next;
    newTail.next = null;

    return newHead;
}


// 🔧 Helper Functions (for local testing)

function createList(arr: number[]): ListNode | null {
    if (arr.length === 0) return null;

    let head = new ListNode(arr[0]);
    let curr = head;

    for (let i = 1; i < arr.length; i++) {
        curr.next = new ListNode(arr[i]);
        curr = curr.next;
    }

    return head;
}

function printList(head: ListNode | null): void {
    let result: number[] = [];
    while (head) {
        result.push(head.val);
        head = head.next;
    }
    console.log(result);
}


// 🧪 Test Cases

let head1 = createList([1, 2, 3, 4, 5]);
let k1 = 2;
printList(rotateRight(head1, k1)); // [4,5,1,2,3]

let head2 = createList([0, 1, 2]);
let k2 = 4;
printList(rotateRight(head2, k2)); // [2,0,1]