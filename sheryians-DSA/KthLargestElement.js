function kethLargestElemnet(arr, k) {

    for (let i = 0; i < arr.length; i++) {
        let count = 0
        for (let j = 0; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                count++
            }
        }
        if (count == k - 1) {
            return arr[i]
        }

    }
}
import { MinPriorityQueue }from '@datastructures-js/priority-queue';

function findKthLargestHeap(nums, k) {
    const heap = new MinPriorityQueue();
    for (let num of nums) {
        heap.enqueue(num);
        if (heap.size() > k) heap.dequeue();
    }
    return heap.front().element;
}
console.log(kethLargestElemnet([3, 2, 1, 5, 6, 4], 3));

console.log('====================================');
console.log([3, 2, 1, 5, 6, 4].sort((a, b) => b - a));
console.log('====================================');

console.log(findKthLargestHeap([3, 2, 1, 5, 6, 4], 3));