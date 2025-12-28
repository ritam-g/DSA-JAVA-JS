let jewel = 'ab';
let stones = 'aabbcc';

let set = new Set(jewel);
let count = 0;


// Step 2: Stones ke har character ko check karo
for (let i = 0; i < stones.length; i++) {
    if (set.has(stones[i])) {
        count++;
    }
}

console.log(count);  // Output: 3