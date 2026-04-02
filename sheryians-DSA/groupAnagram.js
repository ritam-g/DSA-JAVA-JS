/**
 * @param {string[]} strs
 * @return {string[][]} - Returns grouped anagrams
 */
var groupAnagrams = function (strs) {
    let map = new Map()
    // actully i will sort the sring and i will do as a key and in value i will push real string simpl ebut efftective
    for (const s of strs) {
        let sorted = s.split('').sort().join('')

        if (map.has(sorted)) {
            // ! two way to push
            // map.get(sorted).push(s)
            map.set(sorted,[...map.get(sorted),s])
        } else {
            map.set(sorted, [s])
        }
    }

    return Array.from(map.values())
};

/* -----------------------------
   TEST CASES (you can edit these)
-------------------------------- */
let test1 = ["eat", "tea", "tan", "ate", "nat", "bat"];
console.log(groupAnagrams(test1));
// Expected: [ [ 'eat','tea','ate' ], [ 'tan','nat' ], [ 'bat' ] ]

let test2 = ["abc", "bca", "cab", "xyz", "zyx", "zxy"];
console.log(groupAnagrams(test2));
// Expected: [ [ 'abc','bca','cab' ], [ 'xyz','zyx','zxy' ] ]

let test3 = ["a"];
console.log(groupAnagrams(test3));
// Expected: [ ['a'] ]

let test4 = ["listen", "silent", "enlist", "google", "gogole"];
console.log(groupAnagrams(test4));
// Expected: [ ['listen','silent','enlist'], ['google','gogole'] ]