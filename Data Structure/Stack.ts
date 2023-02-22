//Stack? First In Last Out
class Stack {
    private _arr: any[];
    constructor () {
        this._arr = [];
    }
    push(item:any) {  //데이터 넣기
        this._arr.push(item);
    }
    pop() {  //데이터 추출하기
        this._arr.pop();
    }
    peek() {  //맨 나중에 집어넣은 데이터 확인
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