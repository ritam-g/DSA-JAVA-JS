arr = [100, 200, 300, 400,10000], k = 2
arr2 = [1, 4, 2, 10, 23, 3, 1, 0, 20]
k2 = 4


function helper(arr,k) {
    
    let maxSum=0
    let windowSum=0
    for (let i = 0; i < k; i++) {
        windowSum+=arr[i]
    }
    maxSum=windowSum
    for (let j = k; j < arr.length; j++) {
        windowSum=windowSum-arr[j-k]+arr[j]
        maxSum=Math.max(maxSum,windowSum)
    }
    return maxSum
}


console.log(helper(arr,k));
console.log(helper(arr2,k2));