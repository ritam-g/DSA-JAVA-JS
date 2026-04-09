/**
 * Function to search a target in a rotated sorted array
 * @param {number[]} arr - rotated sorted array
 * @param {number} target - element to find
 * @returns {number} - index of target or -1 if not found
 */
function searchRotateArray(arr, target) {
    // Step 1: Find the pivot index (smallest element in the rotated array)
    let pivot = findPivot(arr);

    // Step 2: If pivot is 0, the array is not rotated
    // We can just perform normal binary search on the whole array
    if (pivot === 0) {
        return binarySearch(arr, 0, arr.length - 1, target);
    }

    // Step 3: If the target is exactly at the pivot, return pivot
    if (arr[pivot] === target) {
        return pivot;
    }

    // Step 4: Decide which side to search
    // Everything >= arr[0] is in the left sorted portion
    // Everything < arr[0] is in the right sorted portion
    if (target >= arr[0]) {
        // Target is in the left sorted portion
        return binarySearch(arr, 0, pivot - 1, target);
    } else {
        // Target is in the right sorted portion
        return binarySearch(arr, pivot, arr.length - 1, target);
    }
}

/**
 * Function to find the pivot index in a rotated sorted array
 * Pivot is the index of the smallest element
 * This helps split the array into two sorted halves
 */
function findPivot(arr) {
    let left = 0;
    let right = arr.length - 1;

    // Binary search to find the smallest element
    while (left < right) {
        let mid = Math.floor((left + right) / 2);

        // If mid element is greater than rightmost, pivot must be on the right
        if (arr[mid] > arr[right]) {
            left = mid + 1;
        } else {
            // Otherwise, pivot is at mid or on the left
            right = mid;
        }
    }

    // Left now points to the pivot (smallest element)
    return left;
}

/**
 * Standard binary search function
 * Searches for target in the sorted portion [left..right]
 */
function binarySearch(arr, left, right, target) {
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);

        if (arr[mid] === target) return mid; // target found
        if (arr[mid] < target) left = mid + 1; // search right half
        else right = mid - 1; // search left half
    }

    return -1; // target not found
}

// Example usage:
console.log(searchRotateArray([4, 5, 6, 7, 0, 1, 2], 0)); // Output: 4