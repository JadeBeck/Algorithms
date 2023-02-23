function getLastString(s) {
    while (s.length >= 1) {
        if (s.includes('ABC')) {
            s = s.replace('ABC', '');
        }
        else {
            break;
        }
    }
    console.log(s)
}

console.log(getLastString('ACBABCD'))