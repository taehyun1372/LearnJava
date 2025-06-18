function run(){
    console.log("3 seconds later");
}

function longRunningTask(){
    Thread.sleep(1000);
    console.log("Running task");
}

console.log('Start');
//setTimeout(run, 3000);
setTimeout(longRunningTask, 1000);
console.log('End');