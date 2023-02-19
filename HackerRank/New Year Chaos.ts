function minimumBribes(q) {
    let count = [];
    for (let i = 0; i < q.length; i++) {
        let num = 0;
        for (let j = 1; j < q.length - i; j++) {
            if (q[i] > q[i + j]) num++
        }
        if (num <= 2) count.push(num)
        else {
            console.log("Too chaotic");
            return;
        }
    }
    console.log(count.reduce((acc, curr) => acc + curr, 0))
}

function minimumBribes2(q) {

    let chaotic = false;
    let bribes = 0;

    for (let i = 0; i < q.length; i++) {
        if (q[i] - (i + 1) > 2) chaotic = true;
        for (let j = Math.max(0, q[i] - 2); j < i; j++) {
            if (q[j] > q[i]) bribes++;
        }
    }
    chaotic === true ?
        console.log('Too chaotic') :
        console.log(bribes);
}