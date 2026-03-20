//make a arry
arr=[
    [1,2,3],
    [4,5,6],
    [7,8,9]

]

let ans=arr.reduce((acc,ele,index)=>{
    acc[index]=ele
    return acc
},{})
console.log(ans);
