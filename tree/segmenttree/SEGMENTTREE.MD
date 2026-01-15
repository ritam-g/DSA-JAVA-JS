Here is the complete content you can directly copy and save as a file (e.g. segment-tree-complete-guide.md or segment-tree-notes.md).
Just open any text editor (Notepad, VS Code, Obsidian, etc.), paste everything below, and save with .md extension.
Markdown# Segment Tree – Complete Guide & Visual Reference
**Author:** ritam  
**Location:** Hyderabad  
**Date:** January 15, 2026  
**Purpose:** One-file quick revision for interviews & competitive programming

## 1. What is a Segment Tree?

Segment Tree is a **binary tree** that represents intervals (segments) of an array.  
It allows fast **range queries** and **updates** — both in **O(log n)** time.

Main uses:
- Range Sum / Min / Max / GCD / XOR queries
- Point updates (change one element)
- Range updates (add/set value to [L,R]) → needs lazy propagation

Space: ≈ **4n**  
Build: **O(n)**  
Query/Update: **O(log n)**

## 2. When to Use Segment Tree?

| Situation                                   | Use Segment Tree? | Simpler Alternative                  |
|---------------------------------------------|-------------------|--------------------------------------|
| Only range queries, no updates              | No                | Prefix Sum / Sparse Table            |
| Point update + range sum/min/max            | Yes (or Fenwick)  | Fenwick Tree (BIT) for sum only      |
| Point update + any range operation          | Yes               | —                                    |
| Range update + range query                  | Yes (with lazy)   | —                                    |
| n,q ≈ 10⁵–10⁶ and time is tight             | Yes               | —                                    |

**Problem keywords that mean Segment Tree:**
- "sum / min / max / count in range [L,R]" many times
- "update position i"
- "add X to every element from L to R"

## 3. Visual Diagrams – All in One Place

### 3.1 Basic Structure & Array Representation (n = 8 example)
[0–7]                                 ← tree[1] root
/                 
[0–3]                           [4–7]
/       \                       /       
[0–1]         [2–3]             [4–5]         [6–7]
/     \       /     \           /     \       /     
[0]     [1]   [2]     [3]       [4]     [5]   [6]     [7]   ← leaves = arr[]
text**Tree array layout (1-based indices)**
Idx:  1     2     3     4    5    6    7    8  9 10 11 12 13 14 15
Val: [0-7] [0-3] [4-7] [0-1][2-3][4-5][6-7] [0][1][2][3][4][5][6][7]
text**Child rules:**
- Left child of i  →  2*i
- Right child of i →  2*i + 1
- Parent of i      →  i/2

### 3.2 Recursive Division (Build Process)
[0–7] mid=3
├── [0–3] mid=1
│    ├── [0–1] mid=0
│    │    ├── [0]
│    │    └── [1]
│    └── [2–3] mid=2
│         ├── [2]
│         └── [3]
└── [4–7] mid=5
├── [4–5] mid=4
│    ├── [4]
│    └── [5]
└── [6–7] mid=6
├── [6]
└── [7]
text### 3.3 Range Query Example – sum from index 2 to 5

Query [2,5] → arr[2]+arr[3]+arr[4]+arr[5]

Visited nodes (shaded / marked):
[0–7]           ← partial → split
/           
[0–3]               [4–7]     ← partial & partial
/       \           /       
[0–1]           [2–3] [4–5]       [6–7]
/     \         /     \ /     
[0]     [1]     [2]    [3] [4]    [5]    ← [2],[3],[4],[5] used
text**Collected:** [2] + [3] + [4] + [5]

### 3.4 Point Update Example – update index 3 to new value

Change leaf → update path to root
Before: [3] = old value
After:  [3] → new value
[2–3] → sum updated
[0–3] → sum updated
[0–7] → sum updated
textOnly **log n** nodes change (path from leaf to root).

### 3.5 Lazy Propagation Concept (Range Update)

When adding 10 to range [2,5]:

- Mark lazy on covering nodes instead of updating every leaf
- Push lazy down only when needed (query or further update)

Conceptual lazy view:
[0–7]  lazy=0
/       
[0–3] lazy=0   [4–7] lazy=0
/     
[0–1]  [2–3] lazy=10     ← lazy marked (pending +10 to [2–3])
textLater when visiting [2–3] → push 10 to children [2] and [3], then clear lazy.