const arr = [1,1,1, 2, 3, 4, 5, 6, 6]

function rearrange(arr) {
    let ans = []
    arr.sort((a, b) => a - b)

    let left = 0
    let right = arr.length - 1

    while (left < right) {
        if(right<arr.length-1 && arr[right] ===arr[right+1]) {
            right--
        }
        if(left>0 && arr[left] ===arr[left-1]) {
            left++
        }
        ans.push(arr[right])
        ans.push(arr[left])
        left++
        right--
    }
    

    return ans


}

console.log(rearrange(arr));