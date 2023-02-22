const binarySearch = function (arr, target) {
    let start = 0;
    let end = arr.length - 1
    let mid

    while (start <= end) { //점점 좁혀지다가 start와 end의 순서가 어긋나면 반복을 종료
        mid = parseInt(String((start + end) / 2))

        if (target === arr[mid]) {
            return mid;
        } else {
            if (target < arr[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
    }
    return -1
};