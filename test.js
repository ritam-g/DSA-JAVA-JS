let arr = [1,1,2,3,4,4,5,5]

let freq = {}

for (let i = 0; i < arr.length; i++) {
    let num = arr[i]
    freq[num] = (freq[num] || 0) + 1
}

for (let key in freq) {
    console.log(key, freq[key])
}
