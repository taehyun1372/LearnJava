input =  [[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]
output = ["Open", "Open", "Senior", "Open", "Open", "Senior"]

function openOrSenior(data){
    return data.map(([age, handicap]) => (age>=55 && handicap>7)? "Senior":"Open");
}

result = openOrSenior(input);
result.forEach((i)=>console.log(i));