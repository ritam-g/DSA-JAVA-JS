# 🌳 Trees in Data Structures & Algorithms (DSA)

> A **Tree** is a **non-linear data structure** that represents data in a **hierarchical** way. It is widely used in **DSA, databases, file systems, compilers, and real-world applications**.

---

## 🌱 Why Trees?

✅ Faster searching than arrays & linked lists  
✅ Represents hierarchy naturally  
✅ Used in **DSA problems, system design, and interviews**  

---

## 🌲 Basic Tree Terminology

| Term | Meaning |
|----|----|
| 🌿 Node | Each element in a tree |
| 🌱 Root | Topmost node |
| 🌿 Parent | Node that has children |
| 🍃 Child | Node coming from a parent |
| 🍂 Leaf | Node with no children |
| 🌳 Subtree | Tree inside another tree |
| 🔥 Height | Longest path from node to leaf |
| 📏 Depth | Distance from root |

---

## 🌳 Types of Trees

### 1️⃣ General Tree
- Any number of children
- No strict rules

---

### 2️⃣ Binary Tree 🌲
- Each node has **at most 2 children**
- Left & Right child

```
      1
     / \
    2   3
```

---

### 3️⃣ Binary Search Tree (BST) 🔍

📌 **Rule:**
- Left < Root
- Right > Root

```
      10
     /  \
    5    15
```

✅ Fast search (Average: O(log n))

---

### 4️⃣ Balanced Binary Tree ⚖️
- Height difference ≤ 1
- Example: **AVL Tree**

---

### 5️⃣ Complete Binary Tree ✅
- All levels filled except last
- Nodes filled from **left to right**

---

### 6️⃣ Full Binary Tree 🔒
- Every node has **0 or 2 children**

---

### 7️⃣ Heap Tree 🔥

📌 Used in **Priority Queue**

- **Max Heap:** Parent > Children
- **Min Heap:** Parent < Children

```
      50
     /  \
   30    40
```

---

### 8️⃣ Trie 🌐 (Prefix Tree)

📌 Used in:
- Auto-complete
- Dictionary
- Search engines

```
C
 └── A
     └── T
```

---

## 🔁 Tree Traversals (VERY IMPORTANT ⭐)

### 🔹 Depth First Search (DFS)

1️⃣ **Inorder (L → Root → R)**  
2️⃣ **Preorder (Root → L → R)**  
3️⃣ **Postorder (L → R → Root)**

```
       1
      / \
     2   3
```

| Traversal | Output |
|----|----|
| Inorder | 2 1 3 |
| Preorder | 1 2 3 |
| Postorder | 2 3 1 |

---

### 🔹 Breadth First Search (BFS)

➡️ **Level Order Traversal**  
➡️ Uses **Queue**

Output: `1 2 3`

---

## ⏱️ Time Complexity

| Operation | Complexity |
|----|----|
| Search (BST avg) | O(log n) |
| Insert | O(log n) |
| Traversal | O(n) |

---

## 🧠 Common Tree Problems (LeetCode)

✅ Maximum Depth of Binary Tree  
✅ Invert Binary Tree  
✅ Diameter of Tree  
✅ Validate BST  
✅ Lowest Common Ancestor  

---

## 🚀 Tree Tricks for Interviews

⭐ Recursion is key  
⭐ Think in **subtrees**  
⭐ Draw tree before coding  
⭐ Master traversals first  

---

## 🎯 Where Trees Are Used

🌐 File System  
🧠 AI & ML  
📚 Database Indexing  
🧩 Compilers  
🔍 Search Engines  

---

## 📝 Final Note

> **If you master Trees, 50% of DSA becomes easier!** 💪🌳

Happy Coding 🚀

