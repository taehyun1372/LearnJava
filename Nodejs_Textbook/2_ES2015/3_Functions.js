var addFunction = function(num1, num2) {
    return num1 + num2;
}; //We can declare a function and assign to a variable.. n

(function(){
    console.log('This runs immediately');
})(); //Immediately Invoked Function Expression

const sum = (num1, num2) => (num1 + num2); //Arrow function

function add1(num1, num2) {
    return num1 + num2;
} //Standard declaration

const add2 =  (x, y) => {
    x = x + 1;
    x = x- 1;
    return x + y; //multiple line arrow function
};

const add3 = (x, y) => x + y;

const not2 = x => !x;