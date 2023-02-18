

function gridChallenge(grid) {
    let gridSplit = grid.map(e => [...e].sort());

    let colSorted = [];
    for (let i = 0 ; i < gridSplit[0].length ; i++) {
        let temp = "";
        for (let j = 0 ; j < gridSplit.length ; j++ ) {
            temp += gridSplit[j][i]
        }
        colSorted.push(temp)
    }

    let colFiltered = colSorted.filter(item => {
        let t = item.split("").sort().join("")
        console.log(t," : ",item)
        return item === t;
    })
    return colFiltered.length === colSorted.length?"YES":"NO";
}



function gridChallenge2(grid) {
    const sortedGrid = grid.map(e => e.split("").sort().join(""))
    for(let i = 0 ; i < grid.length ; i++){
        for(let j = 0 ; j < grid.length - 1 ; j++){
            if(sortedGrid[j][i] > sortedGrid[j+1][i]){
                return 'NO';
            }
        }
    }
    return 'YES';
}



function gridChallenge3(grid) {
    const g = grid.map(r => r.split('').sort());
    for(let c = 0; c < g.length; c++) {
        for(let r = 1; r < g.length; r++) {
            if(g[r - 1][c] > g[r][c]) return "NO";
        }
    }
    return "YES"
}