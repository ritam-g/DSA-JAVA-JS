
function findFactors(n,k) {
    // Write your code here
    let s=0
    let c=0
    return rec(s,n,c,k)
    
}
function rec(s,n,c,k){
    if(s>n) {
        return -1
    }
    if(n%s===0){
        c++;
        if(c==k) return s
    }
    return rec(s+1,n,c,k)
    
    
}
console.log(findFactors(6,3));



