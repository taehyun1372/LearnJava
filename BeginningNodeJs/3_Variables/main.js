console.log(3);

var foo = [];
foo.push(1);
foo.push(2);
console.log(foo);
console.log(foo[0]);
console.log(foo[1]);
console.log(foo[2]);

foo.unshift(3);
console.log(foo);

var foo2 = {};
console.log(foo2);

foo2.Id = 1;
foo2.Name = "Something";
console.log(foo2);
console.log(foo2.Name);

var foo3 = {
    Id : 2
};
console.log(foo2.Id + foo3.Id);
foo3.Name = "Anonymous";
console.log(foo3);

function CustomFunction1()
{
    console.log("In CustomFunction1");
}

function CustomFunction2()
{
    console.log("In CustomFunction2");
}

console.log(CustomFunction2());

(function ImmediateFunction()
{
    console.log("In ImmediateFunction");
})();

var foo3 = 123;
if (true)
{
    var foo3 = 456;
}
console.log(foo3); //if statement doesn't create a new variable scope

var foo4 = 123;
if (true)
{
    (function () {
        var foo4 = 456;
        })();
}
console.log(foo4);

var myFunction1 = function NewFunction()
{
    console.log("Display Something 1");
}
myFunction1();

var myFunction2 = function ()//Anonymous function
{
    console.log("Display Something 2");
}

myFunction2();

setTimeout(function () {
    console.log("3000 milli seconds have passed since this demo started..")}, 3000);

function DisplayEnormousThing()
{
    console.log("Something enormous");
}

setTimeout(DisplayEnormousThing, 2000);

function outerFunction1(arg){
    var variableInOuterFunction = arg;
    function bar(){
        console.log(variableInOuterFunction); // Access a variable from the outer scope
    }
    bar();
}

outerFunction1("Hello Closure!");

function outerFunction2(arg){
    var variableInOuterFunction = arg;
    return function() {console.log(variableInOuterFunction);};
}

var innerFunction = outerFunction2("Hello My Pleasure!"); // outerFunction2 has been returned but variableInOuterFunction is still accessible.
innerFunction();

function longRunningOperation(callback){
    //simulate a 3 second operation
    setTimeout(callback, 3000);
}

function userClicked()
{
    console.log("A user click detected, starting a long operation");
    longRunningOperation(function(){
        console.log("ending a long operation");
    });
}

userClicked();
