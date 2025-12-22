let str = 'hello hello';
let strArray = str.split(" ");
let res = [];

for (var i = 0; i < strArray.length; i++) {
    let temp = strArray[i];
    
   
    let capitalized = 
        temp[0].toUpperCase() +                  
        temp.slice(1, -1) +                     
        temp[temp.length - 1].toUpperCase();    
    
    console.log(capitalized);
    res.push(capitalized);
}

console.log(res.join(' '));  