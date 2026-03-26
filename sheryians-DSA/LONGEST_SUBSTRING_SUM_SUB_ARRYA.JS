// Function to find length of longest substring without repeating characters
function lengthOfLongestSubstring(s) {
    let set = new Set()   // stores unique characters in current window
    let maxLen = 0        // stores maximum length found
    let left = 0          // left pointer

    // right pointer expands the window
    for (let right = 0; right < s.length; right++) {

        // shrink window if duplicate found
        while (set.has(s[right])) {
            set.delete(s[left])
            left++
        }

        // add current character
        set.add(s[right])

        // update max length
        maxLen = Math.max(maxLen, right - left + 1)
    }

    return maxLen
}


// 🔥 Test Cases (you can run directly)
function runTests() {
    const testCases = [
        "abcabcbb",
        "bbbbb",
        "pwwkew",
        "abba",
        ""
    ]

    testCases.forEach((test, index) => {
        console.log(`Test ${index + 1}: "${test}"`)
        console.log("Output:", lengthOfLongestSubstring(test))
        console.log("------------------------")
    })
}

runTests()