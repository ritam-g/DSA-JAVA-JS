function generateParenthesis(n) {
    let result = []
    // ""
    // ├── "("
    // │   ├── "(("
    // │   │   ├── "((("
    // │   │   │   └── "((()))" ✅
    // │   │   └── "(()"
    // │   │       ├── "(()())" ✅
    // │   │       └── "(())()" ✅
    // │   └── "()"
    // │       ├── "()(())" ✅
    // │       └── "()()()" ✅
    function helper(curr, open, close) {
        if (curr.length === 2 * n) {
            result.push(curr)
            return
        }

        if (open < n) {
            helper(curr + "(", open + 1, close)
        }

        if (close < open) {
            helper(curr + ")", open, close + 1)
        }
    }

    helper("", 0, 0)
    return result
}

// 🔥 Test
console.log(generateParenthesis(3))