//"use strict"; //At the top of code or function block
//Almost everywhere it should be enabled

// function myFunc(){
//     x = 10; //Implicitly global variable
// }
// myFunc();
// console.log(x);

// function foo(a , a){ //Duplicated parameter names
//     console.log(a, a);
// }
// foo("Hello", "World");

// const obj = {};
// Object.defineProperty(obj, 'name', {value: 'Hello', writable: false});
// obj.name = 'World'; //Cannot write to a readonly property
// console.log(obj.name);

// let public = 1; //Use of reserved word
// console.log(public);

function f(){
    console.log(this); //No reference to global with this
}
f();