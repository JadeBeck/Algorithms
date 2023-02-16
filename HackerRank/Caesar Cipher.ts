
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