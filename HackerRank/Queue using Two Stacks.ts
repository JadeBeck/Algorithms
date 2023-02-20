function processData(input: any) {
    let mainStack = [];
    let tempStack = [];
    /* First use input.split("\n").slice(1)  to obtain an array of only instruction strings, because the first item willl be q, the number of queries, which we won't need in our function*/
    let queries = input.split("\n").slice(1);
    for (let i = 0; i < queries.length; i++) {
        /* If the 1st char of the query is "1", then push the second "word" of that query string into the end of mainStack, which is going to be our queue. */
        if (queries[i].charAt(0) === "1") {
            let pair = queries[i].split(" ");
            mainStack.push(pair[1]);
        }
        /* if the 1st char of the query is "2", then first pop everything from mainStack and push them into tempStack to reverse the order of items.
        Then pop tempStack once to dequeue the element at the front of the queue
        Then pop everything from tempStack back to mainStack to restore the order */
        if (queries[i].charAt(0) === "2") {
            while (mainStack.length > 0) {
                tempStack.push(mainStack.pop());
            }
            tempStack.pop();
            while (tempStack.length > 0) {
                mainStack.push(tempStack.pop());
            }
        }
// if the 1st char is "3", then simply print the first element of the main stack
        if (queries[i].charAt(0) === "3") {
            console.log(mainStack[0]);
        }
    }
}



/*⭐️⭐️⭐️⭐️⭐️
1. string으로 구성된 input을 줄바꿈 단위로 분리하여 배열로 만들어줌
2. 배열의 첫 값은 큐의 길이이므로 len 변수에 넣어줌
3. q라는 빈 배열을 생성
4. 1번 인덱스부터(0번은 큐 길이이므로) for문을 돌면서 switch 문을 사용하여 각 조건에 맞는 것을 실행해줌 → 1일 경우 1뒤에 있는 숫자를 q에 푸시, 2일 경우 shift()로 q에서 제거, 3일 경우 q의 첫번째 값을 출력
*/
function processData2(input) {
    let arr = input.split('\n');
    let len = arr[0]
    let q = [];
    for (let i = 1; i <= len; i++) {
        switch (true) {
            case arr[i][0] == 1 :
                q.push(arr[i].slice(2));
                break;
            case arr[i] == 2 :
                q.shift();
                break;
            case arr[i] == 3 :
                console.log(q[0]);
                break;
        }
    }
}



function processData3(input) {
    const data = input.split("\n");
    const loops = data[0];

    const queue = [];

    for (let i = 1; i <= loops; i++) {
        const currentInput = data[i].split(" ");
        //console.log(currentInput)
        if (currentInput.length > 1) {
            if (currentInput[0] == 1) {
                queue.push(currentInput[1]);
            }
        } else {
            if (currentInput[0] == 2) {
                queue.shift();
            } else if (currentInput[0] == 3) {
                console.log(queue[0]);
            }
        }
    }
}