(function() {
    console.log('in a anonymous function');
})();

var varSquare = function(num1, num2){ //variable declared with var has function scope
    console.log('in var square function');
    return num1 + num2;
}

sumSquare = function(num1, num2){ //Without pre-fix, this is global variable by default
    console.log('in sum square function');
    return num1 + num2;
}

console.log(sumSquare(5, 10));
console.log(varSquare(5, 10));

var util1 = function(input){
    if (input > 5)
    {
        var message = 'it has higher input';
    }
    else
    {
        var message = 'it has lower input';
    }
    console.log(message); //var has function scope not block scope.
}

util1(3);
util1(6);

var doubleExecution = function(function1){
    console.log('In double execution function');
    console.log('First execution');
    function1();
    console.log('Second execution');
    function1();
}

doubleExecution(function(){
    console.log('Please execute this')
});

function displayUserInfo(){
    console.log(`This is private information`);
}

var func1 = displayUserInfo;
var func2 = displayUserInfo;
func1();
func2();
displayUserInfo();

var displayAdminInfo = function(){
    console.log('This is urgent information');
}
displayAdminInfo();


