/*
🧩 Problem: Fibonacci Number

📝 Description:
The Fibonacci sequence is:
0, 1, 1, 2, 3, 5, 8, 13, ...

Each number is the sum of the previous two:
F(n) = F(n-1) + F(n-2)

🎯 Task:
Given a number n, return the nth Fibonacci number
*/

// ✅ Iterative Approach (Best for beginners)
function fibonacci(n) {
    // base cases
    if (n === 0) return 0;
    if (n === 1) return 1;

    let prev = 0;  // F(0)
    let curr = 1;  // F(1)

    // calculate from 2 → n
    for (let i = 2; i <= n; i++) {
        let next = prev + curr; // sum of last two
        prev = curr;            // move forward
        curr = next;
    }

    return curr;
}


// 🔧 Test Cases

console.log(fibonacci(0));  // 0
console.log(fibonacci(1));  // 1
console.log(fibonacci(5));  // 5
console.log(fibonacci(10)); // 55