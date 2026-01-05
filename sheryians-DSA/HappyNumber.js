let n=12
function addTwo(n) {
    let sum=0
    while (n!=0) {
        r=n%10
        sum+=(r*r)
        n=n/10
    }
    return Math.floor(sum)
    
}
addTwo(12)