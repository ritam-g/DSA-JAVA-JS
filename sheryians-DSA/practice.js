//! Largest Element in Array – GFG    

function findLargest(arr) {
    if (arr.length <= 1) return
    let max = arr[0]
    arr.map((ele) => {
        if (max < ele) max = ele
    })

    return max
}

// console.log(findLargest([1,20,3,4,5]));


//! Second Largest Element – GFG	

function getSndLargest(arr) {
    if (arr.length <= 1) return

    let max = arr[0]
    let sndMax = -Infinity

    arr.map(ele => {
        if (ele > max) {
            if (max > sndMax && max < ele) {
                sndMax = max
            }
            max = ele
        }
        if (ele > sndMax && ele < max) {
            sndMax = ele
        }
    })

    return sndMax

}


// console.log(getSndLargest([1, 2, 3, 45, 6, 10]))


//! Check if Array is Sorted – GFG

function isSorted(arr) {
    let ans = true

    arr.map((ele, i) => {
        if (ele > arr[i + 1] && (i + 1) < arr.length) {
            ans = false
        }
    })
    return ans
}

// console.log('====================================');
// console.log(isSorted([1,1,2,3,5,10,7]));
// console.log('====================================');


//! Remove Duplicates from Sorted Array – LeetCode  

function removeDublicate(arr) {
    if (arr.length == 0) return 0
    let track = 0

    for (let i = 1; i < arr.length; i++) {
        if (arr[track] != arr[i]) {
            track++
            arr[track] = arr[i]
        }
    }

    return track+1

}
let array=[11,11,2,2,3,4]
// console.log(removeDublicate(array));
// console.log('====================================');
// console.log(array);
// console.log('====================================');

