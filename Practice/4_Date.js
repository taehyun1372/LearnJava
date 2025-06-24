let date = new Date();
let date2 = new Date(2025, 6, 24, 10, 3, 0);

displayDate = function(date){
    console.log(date.getFullYear(), date.getMonth(), date.getDate());
    console.log(date.getDay(), date.getHours(), date.getMinutes(), date.getSeconds());
    console.log(date.toString());
    console.log(date.toDateString());
    console.log(date.toTimeString());
    console.log(date.toISOString());
}
date2.setFullYear(2024);
displayDate(date2);

if (date > date2) {
    console.log("date is bigger than date2");
}
date.setFullYear(2025, 6, 23);
date.setHours(10, 11, 0);
date2.setFullYear(2025, 6, 24);
date2.setHours(10, 11, 0);

console.log(`Now is ${Date.now()} in milli seconds`);
console.log(`One day is ${date - date2} in milli seconds`);

