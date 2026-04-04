function permute(arr) {
    let result = []
    // [1,2,3]

    // [1,2,3]
    // ├── [1,2,3]
    // │   └── [1,3,2]
    // ├── [2,1,3]
    // │   └── [2,3,1]
    // ├── [3,2,1]
    // │   └── [3,1,2]
    function helper(i) {
        if (i === arr.length) {
            result.push([...arr])
            return
        }

        for (let j = i; j < arr.length; j++) {
            // swap
            [arr[i], arr[j]] = [arr[j], arr[i]]

            helper(i + 1)

            // backtrack (swap back)
            [arr[i], arr[j]] = [arr[j], arr[i]]
        }
    }

    helper(0)
    return result
}

// 🔥 Test
console.log(permute([1, 2, 3]))