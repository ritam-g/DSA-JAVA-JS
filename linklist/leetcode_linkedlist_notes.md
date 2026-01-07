# LeetCode Linked List Practice Notes

## 1️⃣ Reverse Linked List (LeetCode 206)

**Question:**
Reverse a singly linked list.

**Example:**
```
Input: 1 → 2 → 3 → 4 → 5
Output: 5 → 4 → 3 → 2 → 1
```

**Approach / Tricks:**

- **Iterative:** Use two pointers `prev` and `curr`.
  - Save `next = curr.next`
  - Reverse: `curr.next = prev`
  - Move forward: `prev = curr`, `curr = next`
- **Recursive:**
```js
function reverse(head){
    if(head == null || head.next == null) return head;
    let newHead = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}
```
- **Key Points:**
  - Never lose the next node; always save it first.
  - Recursive reversal returns the **new head**.

---

## 2️⃣ Palindrome Linked List (LeetCode 234)

**Question:**
Check if a singly linked list is a palindrome.

**Example:**
```
Input: 1 → 2 → 3 → 2 → 1
Output: true
```

**Approach / Tricks:**

1. **Find middle of the list** using slow & fast pointers.
2. **Reverse the second half** starting from middle.
3. **Compare first half and reversed second half**.
4. **Recursive reverse trick:**
```js
function reverse(node){
    if(node.next == null) return node;
    let newHead = reverse(node.next);
    node.next.next = node;
    node.next = null;
    return newHead;
}
```
5. **Middle finder:**
```js
function middleFinder(node){
    let slow = node, fast = node;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```
6. **Comparison:** iterate through first half and reversed second half, stop when reversed half ends.

**Key Tricks:**
- Only reverse the second half to save time & space.
- Compare `.val` of nodes, not `.next`.
- Optional: reverse back second half if needed to restore original list.

---

## 3️⃣ Reorder List (LeetCode 143)

**Question:**
Reorder list from:
```
L0 → L1 → … → Ln-1 → Ln
```
to:
```
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
```

**Example:**
```
Input: 1 → 2 → 3 → 4 → 5
Output: 1 → 5 → 2 → 4 → 3
```

**Approach / Tricks:**

1. **Find middle** using slow & fast pointers.
2. **Reverse second half** from middle.
3. **Merge two halves** alternating nodes:
```js
let first = head, second = reversed;
while(second != null && first != middle){
    let tmp1 = first.next, tmp2 = second.next;
    first.next = second;
    second.next = tmp1;
    first = tmp1;
    second = tmp2;
}
if(first != null) first.next = null;
```
**Key Points / Tricks:**
- Always **save next nodes** before modifying `.next`.
- Stop merge when **second half ends**.
- Ensure last node points to null to prevent cycles.
- Works for both odd and even length lists.

---

### ✅ Summary Tricks Across All Three Questions

- **Slow & Fast pointer:** find middle efficiently.
- **Reverse sublist:** recursive or iterative.
- **Merge carefully:** save next nodes first.
- **Never lose reference** to remaining list nodes.
- **Compare first half with reversed second half** for palindrome check.
- **Ensure tail `.next = null`** to prevent cycles.

These tricks are reusable for many linked list problems!

