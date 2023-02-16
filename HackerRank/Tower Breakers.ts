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
console.log(towerBreakers1(5, 4))
console.log(towerBreakers1(4, 1))

console.log(towerBreakers2(2, 2))
console.log(towerBreakers2(1, 4))
console.log(towerBreakers2(4, 1))

/*
n: number of towers
m: height or each tower

Consider the solution for the case n=2k, divide the row of towers into two halfs, one half comprising of rows 1 to k and other half for rows k+1 to 2k. Now no matter what move player 1 plays , player 2 replicates it for the mirror image of that tower in the second half. Note that the board will look exactly symmetrical after player 2 has played, throughout the game, consider that only two moves are remaining, then due to the way player 2 played, there must be one move each in each half, player 1 plays something, player 2 does it in the other half and wins.
For n is odd, player 1 realises the above and instantly reduces the last tower to 1, hence no more moves can be done on it, now the situation is identical to n=even, but player 2 plays first and loses.
This assumes that there are moves remaining at the beginning i.e. m!=1; but if m==1 then obviously player 1 will lose.*/