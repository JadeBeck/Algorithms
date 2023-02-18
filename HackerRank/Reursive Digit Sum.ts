
function superDigit(n, k) {
    function recSum(num) {
        const numArr = String(num).split("").map(Number);
        return numArr.reduce((acc, curr) => acc + curr, 0)
    }

    let p = n.repeat(k);
    while (Number(p) >= 10) {
        p = recSum(p)
    }
    return p
}