'use strict';

console.log('Hello world');
var foo = 3;
console.log(foo);

var bar = 5;

console.log(foo + 1);
console.log(foo / bar);
console.log(foo * bar);
console.log(foo - bar);
console.log(foo % 2);

var foo = true;
console.log(foo);
console.log(true && true);
console.log(true && false);
console.log(true || false);
console.log(false || false);
console.log(!true);
console.log(!false);

var foo = [];

foo.push(1);
console.log(foo);

foo.push(2);
console.log(foo);
console.log(foo[0]);
console.log(foo[1]);

foo.unshift(3);
console.log(foo);

console.log("Program is hanging. Press Ctrl+C to exit.");
process.stdin.resume();