# DSA Practice Log – Cousins in Binary Tree

## Problem
**LeetCode 993 – Cousins in Binary Tree**

Two nodes in a binary tree are called **cousins** if:
- They are at the **same depth**
- They have **different parents**

Root is at depth `0`.

---

## Question Type
**Binary Tree – Logical Condition / DFS–BFS Based**

- Tree traversal
- Level (depth) comparison
- Parent relationship checking
- Boolean logic (`&&`, `!`)

---

## Core Concepts Used
- Depth / Level of a node
- Parent–child relationship
- Difference between **siblings** and **cousins**
- Boolean negation (`!`)

---

## Important Definitions
- **Sibling** → nodes with the **same parent**
- **Cousin** → nodes with:
  - same level
  - **different parents**

---

## Key Logical Condition
```js
sameLevel && differentParents
