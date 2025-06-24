let testData = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15];
let testData2 = []

function countPositivesSumNegatives(input) {
    let positive = 0;
    let negativeSum = 0;
    let result;
    input.forEach((number) => (number > 0)? positive++: null);
    input.forEach((number) => (number < 0)? negativeSum += number: null);

    return result = [positive, negativeSum]
}

let result = countPositivesSumNegatives(testData);
console.log(result[0]);
console.log(result[1]);

let result2 = countPositivesSumNegatives(testData2);
console.log(result2[0]);
console.log(result2[1]);