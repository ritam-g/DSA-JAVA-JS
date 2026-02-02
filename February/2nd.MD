# 📘 Daily DSA Practice Log

## 🗓 2nd Feb

Today

## 🧠 Question Practiced

**LeetCode 3013 – Divide an Array Into Subarrays With Minimum Cost II (Hard)**

---

## 🔍 Problem Summary

* Given an array `nums`, and integers `k` and `dist`
* Divide `nums` into **k disjoint contiguous subarrays**
* **Cost of a subarray = first element** of that subarray
* Constraint:

  * Difference between the starting index of the **2nd** and **kth** subarray must be `<= dist`
* Goal:

  * Minimize the **sum of costs** of all k subarrays

---

## 💡 Key Insight

* First subarray **must start at index 0** → cost is fixed: `nums[0]`
* Remaining task:

  * Choose **k−1 elements** from a sliding window of size `dist+1`
  * Minimize their sum

This converts the problem into:

> Sliding window + maintaining **k−1 smallest elements** efficiently

---

## 🛠 Approach Used

* Sliding window over indices `[1 ... dist+1]`
* Maintain two sorted lists:

  * `small` → stores smallest `k−1` elements
  * `large` → stores remaining elements
* Keep track of sum of `small`
* Slide window and update minimum sum

---

## ✅ Final Result

* Time Complexity: **O(n · k)**
* Space Complexity: **O(k)**
* Handles all edge cases
* No `Infinity` / Runtime Errors

---

## 🧪 Status

✅ All test cases passed

---

## 🧠 Learning Takeaways

* Difference between **Easy vs Hard** versions matters a lot
* Greedy selection + sliding window is powerful
* Maintaining `k−1` minimum elements is a common pattern

---

## 🔖 Tags

`Sliding Window` · `Multiset` · `Greedy` · `Hard` · `LeetCode`

---

✍️ *Consistency beats talent — one hard problem at a time.*
