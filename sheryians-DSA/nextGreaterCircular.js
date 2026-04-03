/*
🧩 Problem: Next Greater Element II (Circular Array)

📝 Description:
Given a circular integer array nums, return the next greater number for every element.

The next greater number of a number x is the first greater number to its right.
If not found, search from the beginning (circular).
If it doesn't exist, return -1.

🔁 Examples:

Input: [1,2,1]
Output: [2,-1,2]

Input: [1,2,3,4,3]
Output: [2,3,4,-1,4]
*/

function nextGreaterElements(nums) {
    let n = nums.length;

    // result array → default -1 (if no greater element found)
    let res = new Array(n).fill(-1);

    // stack will store "possible next greater elements"
    let stack = [];

    // loop runs 2*n times to simulate circular array
    for (let i = 2 * n - 1; i >= 0; i--) {

        // convert i into valid index (0 to n-1)
        // because array is circular
        let index = i % n;

        // 🔥 STEP 1: remove all smaller or equal elements
        // because they can never be "next greater"
        while (stack.length > 0 && stack[stack.length - 1] <= nums[index]) {
            stack.pop();
        }

        // 🔥 STEP 2: store answer ONLY in second pass
        // i < n means → we are in second round (real answer time)
        if (i < n) {
            if (stack.length > 0) {
                // top of stack = next greater element
                res[index] = stack[stack.length - 1];
            }
            // else → already -1 (no greater element)
        }

        // 🔥 STEP 3: push current element into stack
        // so it can help previous elements
        stack.push(nums[index]);
    }

    return res;
}

// 🔧 Test Cases

console.log(nextGreaterElements([1, 2, 1]));      // [2, -1, 2]
console.log(nextGreaterElements([1, 2, 3, 4, 3])); // [2, 3, 4, -1, 4]
console.log(nextGreaterElements([5, 4, 3, 2, 1])); // [-1,5,5,5,5]