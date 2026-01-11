function mergeSortedArrays(arr1, m, arr2, n) {
        // implement logic
        let i=m-1
        let j=n-1
        let len=m+n-1
        while (i>=0&&j>=0) {
            if (arr1[i]>arr2[j]) {
                arr1[len]=arr1[i]
                i--
            }
            else{
                 arr1[len]=arr2[j]
                j--
            }
            len--
        }
        for(let x=0;x<1;x++){
            console.log('['+ arr1.join(',')+']')
        }
        
    }
    mergeSortedArrays([1,2,34,0],3,[1],1)