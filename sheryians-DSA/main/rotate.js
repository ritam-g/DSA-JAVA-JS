// Rotate Array Clockwise

class Solution {

    rotateclockwise(arr, k) {
        const n = arr.length
        k = k % n

        // first rotate all
        this.reverse(arr, 0, n - 1)
        // then rotae k element
        this.reverse(arr, 0, k - 1)
        // now rotate remanign
        this.reverse(arr, k, n - 1)

        return arr

    }

    reverse(arr, left, right) {
        while (left < right) {
            [arr[left], arr[right]] = [arr[right], arr[left]]
            left++
            right--
        }


    }
}

module.exports = Solution