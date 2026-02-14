async function call(num) {
    if(num==0) return
    let res=null;
    num!==3?res=individual(num):res=individual2(num)
    console.log(num,res);
    call(num-1)
}
function individual(n) {
    let res=[]
    for (let i = n; i >=1; i--) {
        res.push(i)
        
    }
    return res
}
async function individual2(n) {
    let res=[]
    for (let i = n; i >=1; i--) {
        res.push(i)
        
    }
    return res
}
call(10)