function combinationSum(candidates, target) {
    let result = []
    let path = []
    // [2,3], target=7

    // helper(0,7) []
    // │
    // ├── take 2 → [2]
    // │   ├── take 2 → [2,2]
    // │   │   ├── take 2 → [2,2,2]
    // │   │   │   ├── ❌ (target < 0)
    // │   │   │   └── take 3 → [2,2,3] ✅
    // │   │
    // │   └── take 3 → ❌
    // │
    // └── take 3 → [3]
    //     ├── take 3 → [3,3]
    //     │   └── ❌
    function helper(index, target) {
        if (target === 0) {
            result.push([...path])
            return
        }

        if (index === candidates.length || target < 0) {
            return
        }

        // ✅ TAKE
        path.push(candidates[index])
        helper(index, target - candidates[index])
        path.pop()

        // ❌ NOT TAKE
        helper(index + 1, target)
    }

    helper(0, target)
    return result
}

// 🔥 Test
console.log(combinationSum([2, 3, 6, 7], 7))