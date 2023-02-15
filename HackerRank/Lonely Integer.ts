let a: any = [0, 0, 1, 2, 1,]

function lonelyinteger(a: any) {
    let sorted: any = a.sort((a: any, b: any) => a - b);
    let unique;
    for (let i = 0 ; i < sorted.length ; i++) {
        if (a[i] !== a[i-1] && a[i] !== a[i+1]) {
            return a[i];
        }
    }
}

console.log(lonelyinteger(a))