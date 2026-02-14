

// for (let i = 0; i < arr.length; i++) {

//     if (arr[i]=='c') {
//         temp=arr[i-1]
//         arr[i-1]=arr[i]
//         arr[i]=temp
//     }
// }

// function recursion(arr, i) {
//     if (i == arr.length) return
//     if (arr[i] == 'c') {
//         if (i - 1 >= 0) {
//             temp = arr[i - 1]
//             arr[i - 1] = arr[i]
//             arr[i] = temp
//         }
//     }
//     recursion(arr, i + 1)
// }
// recursion(arr,0)
function recursion(arr, i, track) {
    if (i == arr.length) return;

    if (arr[i] == 'c') {

        if (arr[track] !== 'c') {
            let temp = arr[track];
            arr[track] = arr[i];
            arr[i] = temp;

        } else {
            let t = trackCheck(arr, track);
            if (t !== undefined) {
                let temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
            }
        }
        track++;
    }

    recursion(arr, i + 1, track);
}

function trackCheck(arr, t) {
    if (t == arr.length) return;

    if (arr[t] !== 'c') return t;

    return trackCheck(arr, t + 1);
}

// Example
let arr = ['a','c','b','c','d','c'];
recursion(arr, 0, 0);

console.log(arr);
