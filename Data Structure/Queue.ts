//Queue? First In First Out
class Queue {
    private _arr: any[];
    constructor () {
        this._arr = [];
    }
    enqueue(item: any) {  //데이터 넣기
        this._arr.push(item);
    }
    dequeue(){  //데이터 추출하기
        this._arr.shift();
    }
    peek() {  //맨 앞의 데이터 확인하기
        return this._arr[0];
    }
}

const queue = new Queue;
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.dequeue();
console.log(queue.peek());
console.log(queue)

