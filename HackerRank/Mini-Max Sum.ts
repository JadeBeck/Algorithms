let arr: [number, number, number, number, number] = [1, 2, 3, 4, 5,];

function miniMaxSum(arr: [number, number, number, number, number]) {
    arr.sort(function(a, b) {
        return a - b;
    });
    console.log(arr[0]+arr[1]+arr[2]+arr[3], arr[4]+arr[1]+arr[2]+arr[3])
}

console.log(miniMaxSum(arr))