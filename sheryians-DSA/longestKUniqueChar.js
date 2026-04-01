// 👉 Complete this function
function longestKSubstr(s, k) {
    // Write your logic here
    // precess
    // i will store frequescy in a map
    // then ther will be one thing maxlen of accrding k 
    // her we will use sliding window 

    let map = new Map()
    let left = 0
    let maxLen = -1
    for (let right = 0; right < s.length; right++) {
        // now i am going to store value in map becuse k is not lengeth that number freq
        map.set(s[right], (map.get(s[right]) || 0) + 1)

        // real part will be here if map become more than k size

        while (map.size > k) {
            // decreasing freq of the map element 
            map.set(s[left], map.get(s[left]) - 1)
            // now the condition will be if any element is 0 then remove 

            if (map.get(s[left]) == 0) {
                map.delete(s[left])
            }


            left++
        }

        // now the k freq
        if (k == map.size) {
            maxLen = Math.max(maxLen, (right - left) + 1)
        }
    }
    return maxLen

}


// 👉 Input handling (already done for you)
console.log(longestKSubstr("aabacbebe", 3));