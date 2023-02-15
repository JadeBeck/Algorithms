let arr:any = [ [ 11, 2, 4 ], [ 4, 5, 6 ], [ 10, 8, -12 ] ];

function diagonalDifference(arr: any) {
    let PD = 0;
    let SD = 0;

    for (let i = 0 ; i < arr.length ; i++) {
        PD = PD + arr[i][i];
        SD = SD + arr[i][arr.length-(i+1)];
    }

    let x = Math.abs(PD*1-SD*1);
    return x;
}

console.log(diagonalDifference(arr))