
function superDigit(n, k) {
    function splitSum(num) {
        const numArr = String(num).split("").map(Number);
        // ↳const numArr = String(num).split("").map(e => Number(e));
        return numArr.reduce((acc, curr) => acc + curr, 0)
    }

    let p = n.repeat(k);
    while (Number(p) >= 10) {
        p = splitSum(p)
    }
    return p
}