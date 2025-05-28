function longRunningOperation(callback)
{
    setTimeout(callback, 3000);
}

function webRequest(request)
{
    console.log("starting a long operation for request:", request.id);
    longRunningOperation(function(){
        console.log("ending a long operation for request ", request.Id);
    })
}

//simulate a web request
// webRequest({id: 1});
// //simulate a second web request
// webRequest({id: 2});

// console.time('uniqueTimer')
// setTimeout(function() {
//     console.timeEnd('uniqueTimer')}, 1000)

console.time('timeit');
function fibonacci(n){
    if (n < 2)
        return 1;
    else
        return fibonacci(n - 2) + fibonacci(n - 1)
}

setTimeout(function(){
    console.timeEnd('timeit')}, 1000)
//Start the long running operation
fibonacci(43);
