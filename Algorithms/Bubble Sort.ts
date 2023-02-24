const bubbleSort = function (arr) {
    let newArr = arr.slice(0) //배열 복사

    for(let j=0; j<newArr.length-1; j++){
        for(let i=0; i<newArr.length-1; i++){
            if(newArr[i]>newArr[i+1]){
                let x = newArr[i+1];
                newArr[i+1] = newArr[i];
                newArr[i] = x;
            }
        }//1~3과정
        if(JSON.stringify(newArr)===JSON.stringify(arr)){ //어떠한 요소도 바뀌지 않은 경우
            break;
        }
    }
    return newArr;
};