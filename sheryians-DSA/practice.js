// Largest Element in Array – GFG    

function findLargest(arr) {
    if (arr.length <= 1) return
    let max = arr[0]
    arr.map((ele) => {
        if(max<ele) max=ele
    })

    return max
}

console.log(findLargest([1,20,3,4,5]));
