const array: [number, number, number, number, number, number] = [-4, 3, -9, 0, 4, 1];

function plusMinus(array: [number, number, number, number, number, number]) {
    let arr = [];
    for (var i = 0; i < array.length; i++) {
        arr.push(array[i]);
    }
    let countPositive = arr.filter(element => element > 0).length / array.length;
    console.log(countPositive)
    let countNegative = arr.filter(element => element < 0).length / array.length;
    console.log(countNegative)
    let countZero = arr.filter(element => element === 0).length / array.length;
    console.log(countZero)
}

console.log(plusMinus(array))