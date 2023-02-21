//Stack? First In Last Out
class Stack {
    private _arr: any[];
    constructor () {
        this._arr = [];
    }
    push(item:any) {
        this._arr.push(item);
    }
    pop() {
        this._arr.pop();
    }
    peek() {
        return this._arr[this._arr.length - 1];
    }
}

const stack = new Stack;
stack.push(1);
stack.push(2);
stack.push(3);
stack.pop();
console.log(stack.peek());
console.log(stack);