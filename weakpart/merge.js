function mergeSort(arr) {
    // base case
    if (arr.length <= 1) {
        return arr;
    }

    let mid=Math.floor(arr.length/2)

    let left=arr.slice(0,mid)
    let right=arr.slice(mid)

    left=mergeSort(left) 
    right=mergeSort(right) 

    return merge(left,right)
}

function merge(left, right) {
    let result=[]

    let l=0
    let j=0

    while (l<left.length&&j<right.length) {
        if (left[l] <= right[j]) {
            result.push(left[l]);
            l++;
        } else {
            result.push(right[j]);
            j++;
        }
    }
    // remaining elements
    while (l< left.length) {
        result.push(left[l]);
        l++;
    }

    while (j < right.length) {
        result.push(right[j]);
        j++;
    }
    return result



}

let arr=[5,4,3,21]
console.log(mergeSort(arr))
