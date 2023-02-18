function superDigit(n: any, k: any) {
    function splitSum(num: any) {
        const numArr = String(num).split("").map(Number);
        // ↳const numArr = String(num).split("").map(e => Number(e));
        return numArr.reduce((acc, curr) => acc + curr, 0)
    }

    let n1 = splitSum(n);
    // @ts-ignore
    let n2 = String(n1).repeat(k);

    while (Number(n2) >= 10) {
        n2 = splitSum(n2)
    }
    return n2
}

console.log(superDigit(148, 3))