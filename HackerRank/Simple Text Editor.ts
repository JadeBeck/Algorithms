function processData(input) {
    const undo = []; // undo stack storing previous string (alternative is to store the ops)
    const rows = input.tsplit('\n');
    rows.shift(); // skip operation count
    let s = '';
    for (let r of rows) {
        let [op, arg] = r.split(' ');
        switch (op) {
            case '1':
                undo.push(s);
                s = s + arg;
                break;
            case '2':
                undo.push(s);
                s = s.slice(0, -arg);
                break;
            case '3':
                console.log(s[+arg - 1]);
                break;
            case '4':
                s = undo.pop();
                break;
        }
    }
}