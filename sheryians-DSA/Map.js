// let map=new Map()
// map.set("s1",1)
// map.set("s2",2)
// map.set("s2",3)
// map.set("s3",4)
// map.set("s4",5)

// for (const key of map.keys()) {
//     console.log(map.get(key));
// }


let arr=[1,2,3,4,5,6,5,4,3,2,4,2,5]
let map=new Map()
let count=0
for (let i = 0; i < arr.length; i++) {
    // ! I AM DONG THE ELEMT IT SELF IS A KEY 
    if (map.has(arr[i])) {
        map.set(arr[i],map.get(arr[i])+1)
        count++
    }else{
    map.set(arr[i],1)
    
    }
}
console.log(map,count);
