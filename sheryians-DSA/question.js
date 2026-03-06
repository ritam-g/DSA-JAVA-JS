let arr = [10, 2, -2, -20, 10]

k = -10
let sum = 0
let ans = 0
for (let i = 0; i < arr.length; i++) {
    for (let j = i; j < arr.length; j++) {
        sum += arr[j]

        if (sum == k) {
            ans++
        }
    }
    sum=0

}
console.log(ans);
