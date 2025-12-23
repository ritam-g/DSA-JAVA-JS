let words="ck bk ak"
let arr=words.split(" ")
for (let i = 0; i < arr.length; i++) {
    
    // console.log(arr[i][0].charCodeAt());
    for (let j = 0; j < arr.length-1-i; j++) {
        if (arr[j][0].charCodeAt()> arr[j+1][0].charCodeAt()) {
            let temp=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=temp
        }
        
    }
}
console.log(arr.join(" ").toString());
