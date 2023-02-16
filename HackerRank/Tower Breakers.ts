function towerBreakers1(n: number, m: number) {
    // Write your code here
    if(m === 1){
        // height is 1 and P1 is stuck.. so they lose
        return 2
    }
    else if (n % 2 !== 0){
        // n is odd
        return 1
    }
    else {
        // n is even
        return 2
    }
}

function towerBreakers2(n: number, m: number) {
    return n % 2 === 0 || m === 1 ? 2 : 1;
}


console.log(towerBreakers1(2, 2))
console.log(towerBreakers1(1, 4))
console.log(towerBreakers1(4, 1))

console.log(towerBreakers2(2, 2))
console.log(towerBreakers2(1, 4))
console.log(towerBreakers2(4, 1))
