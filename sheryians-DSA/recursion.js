let arr = [34, 42, 4, 332, 42, 34];

function sort(arr) {
    if (arr.length <= 1) {
        return;
    }

    let ele = arr.pop();
    sort(arr)
    rightPlace(arr,ele)
}

function rightPlace(arr, num) {
    if (arr.length == 0 || arr[arr.length - 1] >= num) {
        arr.push(num);
        return;
    }

    let x = arr.pop();
    rightPlace(arr, num);
    arr.push(x)
}

sort(arr);
console.log(arr);
