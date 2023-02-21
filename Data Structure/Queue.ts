//Queue? First In First Out
class Queue {
    private _arr: any[];
    constructor () {
        this._arr = [];
    }
    enqueue(item: any) {
        this._arr.push(item);
    }
    dequeue(){
        this._arr.shift();
    }
    peek() {
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

