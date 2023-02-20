function isBalanced(s) {
    if (s.length % 2 !== 0) return 'NO';

    let string = s;

    while (string.length >= 1) {
        if (string.includes('()')) {
            string = string.replace('()', '');
        } else if (string.includes('[]')) {
            string = string.replace('[]', '');
        } else if (string.includes('{}')) {
            string = string.replace('{}', '');
        } else {
            break;
        }
    }
    return s.length > 0 ? 'NO' : 'YES'
}