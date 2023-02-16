let input: any = "1 7 1234567";

function processData1(input: any) {
    const arr = input.slice(4, input.length).split("");
    let sorted = arr.sort((a: any, b: any) => a - b);
    let lastOne = sorted[sorted.length - 1];
    sorted.pop();
    sorted.splice(sorted.length / 2, 0, lastOne);
    let reverse = [...sorted].reverse()
    reverse.splice(sorted.length / 2)
    let answer = sorted.slice(0, sorted.length / 2 + 1) + "," + reverse;
   return answer.replace(/,/g, ' ')
}

function processData2(input: any) {
    const arr = input.slice(4, input.length).split(" ");
    const middle = (arr.length-1)/2;
    const sorted = arr.sort((a: any,b: any)=>a-b);
    const max = sorted[sorted.length-1];
    const result = [...sorted.slice(0, middle), max, ...sorted.slice( middle, sorted.length-1).reverse()];
    return result.join(" ");
}

console.log(processData1(input))
console.log(processData2(input))