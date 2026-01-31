let nums = [2, 1, 5, 1, 3, 2];
let k = 3;

let windowSum=0
let maxSum=0
//! fitst 3 addintion in widow  
for (let i = 0; i < k; i++) {
    windowSum+=nums[i]
}
maxSum=windowSum

for (let j = k; j < nums.length; j++) {
    windowSum+=nums[j]//! adding right side
    windowSum-=nums[j-k]//! the left one have to remove from the new additon 
    //! i want max 
    maxSum=Math.max(maxSum,windowSum)
    console.log(windowSum);
    
}
console.log('real max sum ',maxSum);

