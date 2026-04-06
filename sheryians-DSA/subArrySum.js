//////////////////////////////////////////////////////////
// Problem: Subarray Sum Equals K
// ------------------------------------------------------
// Given an array of integers nums and an integer k,
// return the total number of subarrays whose sum equals k.
//
// A subarray is a contiguous part of the array.
//
// Example:
// Input: nums = [1, 2, 3], k = 3
// Output: 2
// Explanation: Subarrays are [1,2] and [3]
//////////////////////////////////////////////////////////

class Solution {
    subarraySum(nums, k) {
        // Object used as a hashmap (like Python dict)
        // key = prefix sum, value = frequency
        let map = new Map()

        // Base case:
        // Sum = 0 occurs once before starting
        let sum = 0
        let count = 0

        // running prefix sum
        // number of valid subarrays
        map.set(0, 1)
        // Traverse the array
        for (let num of nums) {

            // 1️⃣ Update running sum
            sum += num
            // 2️⃣ Check if there exists a prefix sum = (sum - k)
            //    If yes, it means we found subarray(s) with sum = k
            if(map.has(sum-k)){
                count +=map.get(sum-k)
            }
            // 3️⃣ Store current sum in hashmap
            //    Increase frequency
            map.set(sum,(map.get(sum)||0)+1)
        }

        // 4️⃣ Return total count
        return count;
    }
}

//////////////////////////////////////////////////////////
// 🔹 Example Usage (Local Machine)
//////////////////////////////////////////////////////////

const nums = [1, 2, 3];
const k = 3;

const sol = new Solution();
const result = sol.subarraySum(nums, k);

console.log("Input:", nums);
console.log("k:", k);
console.log("Number of subarrays with sum = k:", result);

//////////////////////////////////////////////////////////
// Expected Output:
// Input: [1, 2, 3]
// k: 3
// Number of subarrays with sum = k: 2
//////////////////////////////////////////////////////////