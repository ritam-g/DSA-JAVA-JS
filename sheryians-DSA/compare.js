/**
 * @param {character[]} chars
 * @return {number} - Returns the new length of the compressed array
 */
var compress = function (chars) {
    let i = 0
    let write = 0
    while (i<chars.length) {
        let char=chars[i]
        let count=0
        // count the number of occurances also i is updated
        while(i<chars.length&& char==chars[i]){
            i++
            count++
        }

        chars[write++]=char

        if(count>1){
            count=count.toString()
            for(let j=0;j<count.length;j++){
                chars[write++]=count[j]
            }
        }
    }
    // may have posiblry taht chars.length>write so write will be the new length
    return write
};

/* -----------------------------
   TEST CASES (you can edit these)
-------------------------------- */
let chars1 = ["a", "a", "b", "b", "c", "c", "c"];
let len1 = compress(chars1);
console.log(chars1.slice(0, len1), "Length:", len1); // ["a","2","b","2","c","3"], 6

let chars2 = ["a"];
let len2 = compress(chars2);
console.log(chars2.slice(0, len2), "Length:", len2); // ["a"], 1

let chars3 = ["a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b"];
let len3 = compress(chars3);
console.log(chars3.slice(0, len3), "Length:", len3); // ["a","b","1","2"], 4