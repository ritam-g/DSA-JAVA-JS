// let arr = [1,1,2,3,4,4,5,5]

// let freq = {}

// for (let i = 0; i < arr.length; i++) {
//     let num=arr[i]
//     freq[num]=(freq[num] || 0)+1
// }
// for (const key in freq) {
//     console.log(key,freq[key]);
    
// }
//! with arr 

 let arr = [1,1,1,1,1,2,3,4,4,4,5,5]
let maxfreq=0 
let ans=arr[0]
 let visited=new Array(arr.length).fill(false)
 for (let i = 0; i < arr.length; i++) {
    
    if(visited[i]) continue
    let count=0
    count++
    for (let j = i+1; j < arr.length; j++) {
        if (arr[i]==arr[j]) {
            visited[j]=true
            count++
        }
        
    }
    if(maxfreq<count){
        maxfreq=count
        ans=arr[i]
    }
    
    
 }
 console.log(ans);
 