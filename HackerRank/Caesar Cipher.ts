function caesarCipher(s, k) {
    let splitInput = s.split("");
    let toCode = splitInput.map(item => item.charCodeAt());

    return toCode.map(code => code === 45 ?
        String.fromCharCode(code)
        : code + k > 122 ?
            String.fromCharCode(code + k - 26)
            : String.fromCharCode(code + k)
    ).join("");
}

function caesarCipher2(s, k) {
    let newString = '';
    for (let i = 0; i < s.length; i++) {
        var code = s[i].charCodeAt(0);
        var letter = ''
        if (code >= 65 && code <= 90) {
            letter = String.fromCharCode((code - 65 + k) % 26 + 65);
        } else if (code >= 97 && code <= 122) {
            letter = String.fromCharCode((code - 97 + k) % 26 + 97);
        } else {
            letter = s[i]
        }
        newString += letter;
    }
    return newString
}

function caesarCipher3(s, k) {
    let splitInput = s.split("");
    let toCode = splitInput.map(item => item.charCodeAt());
    let result = "";

    console.log(toCode)
    for (let i = 0 ; i < toCode.length ; i++) {
        let code = toCode[i];
        let letter = "";

        if (65 <= code && code <= 90) {
            if (code + k >= 91) {
                letter = String.fromCharCode((code - 65 + k) % 26 + 65)
            } else {
                letter = String.fromCharCode(code + k)
            }
        } else if (97 <= code && code <= 122) {
            if (code + k >= 123) {
                letter = String.fromCharCode((code - 97 + k) % 26 + 97)
            } else {
                letter = String.fromCharCode(code + k)
            }
        } else {
            letter = String.fromCharCode(code)
        }
        result += letter;
    }
    return result
}