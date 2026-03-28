txt = "forxxorfxdofr", pat = "for"

function helper(txt,pat) {

    let count = 0

    for (let i = 0; i < txt.length; i++) {
        
        let window = txt.slice(i,i+pat.length).split('').sort().join('')

        if (window === pat.split('').sort().join('')) {
            count++
        }
    }
    return count
    
}

console.log(helper(txt,pat));