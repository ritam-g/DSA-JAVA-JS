// Union of Two Arrays

class Solution {
    findUnion(a, b) {
        const set=new Set()
        let max=Math.max(a.length,b.length)

        for(let i=0;i<max;i++){
            if (a[i]) {
                set.add(a[i])
            }
            if (b[i]) {
                set.add(b[i])
            }
        }

        return Array.from(set)
    }
}


// ======= TEST CASES =======

const sol = new Solution();

// Test Case 1
let a1 = [1, 2, 3, 4];
let b1 = [3, 4, 5, 6];
console.log("Output 1:", sol.findUnion(a1, b1)); 
// Expected: [1,2,3,4,5,6]

// Test Case 2
let a2 = [1, 1, 2, 2];
let b2 = [2, 3, 3];
console.log("Output 2:", sol.findUnion(a2, b2)); 
// Expected: [1,2,3]

// Test Case 3
let a3 = [];
let b3 = [1, 2];
console.log("Output 3:", sol.findUnion(a3, b3)); 
// Expected: [1,2]