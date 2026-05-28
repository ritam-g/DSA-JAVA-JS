class Solution {

    findUnion(a, b) {


        return [...new Set([...a, ...b])].sort((x, y) => x - y)
        // other way
        /**  
         * const merge = [...a, ...b]
    	
        const unique = new Set(merge)
    	
        // Convert back to array
        const ans = Array.from(unique)
        
        return ans.sort((a,b)=>a-b)
         */

    }
}


const sol = new Solution()

console.log(sol.findUnion([111, 2, 3], [111, 2, 3]))

module.exports = Solution