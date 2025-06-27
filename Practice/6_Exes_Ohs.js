function XO(str) {
    str = str.toLowerCase();
    let xCount = str.split('x').length;
    let oCount = str.split('o').length;
    return xCount == oCount;
}

console.log(XO("ooxx"))
console.log(XO("xooxx"))
console.log(XO("ooxXm"))
console.log(XO("zpzpzpp"))
console.log(XO("zzoo"))

function invert(array) {
    return array.map(n => n * -1);
}

testData = [1, -2, 3, -4, 5];
newData = invert(testData)
console.log(newData);