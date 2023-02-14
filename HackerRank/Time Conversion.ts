let s: any = [0, 7, ":", 0, 5, ":", 4, 5, "P", "M"];

function timeConversion(s: any) {
    if (s[8] === "A") {
        if (s[0] === "1" && s[1] === "2") {
            return "00" + s[2] + s[3] + s[4] + s[5] + s[6] + s[7];
        }
        else {
            return s[0] + s[1] + s[2] + s[3] + s[4] + s[5] + s[6] + s[7];
        }
    }
    else {
        if (s[0] === "1" && s[1] === "2") {
            return s[0] + s[1] + s[2] + s[3] + s[4] + s[5] + s[6] + s[7];
        }
        else {
            return (s[0]*10 + s[1]*1 + 12) + s[2] + s[3] + s[4] + s[5] + s[6] + s[7];
        }
    }
}

console.log(timeConversion(s))