// Merge Sort in JavaScript

// Function to perform merge sort
function mergeSort(arr) {
    // Base case: array of length 0 or 1 is already sorted
    if (arr.length <= 1) return arr;

    // Find the middle index
    const mid = Math.floor(arr.length / 2);

    // Recursively split and sort left and right halves
    const left = mergeSort(arr.slice(0, mid));
    const right = mergeSort(arr.slice(mid));

    // Merge the sorted halves
    return merge(left, right);
}

// Function to merge two sorted arrays
function merge(left, right) {
    const result = [];
    let i = 0, j = 0;

    // Compare elements from both arrays and push the smaller one
    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            result.push(left[i]);
            i++;
        } else {
            result.push(right[j]);
            j++;
        }
    }

    // Add remaining elements from left or right
    return result.concat(left.slice(i)).concat(right.slice(j));
}

// Example usage
const arr = [5, 2, 9, 1, 5, 6];
const sortedArr = mergeSort(arr);
console.log("Original array:", arr);
console.log("Sorted array:", sortedArr);