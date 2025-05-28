var roy = {Id : 123}
// var mike = roy
var mike = {Id : roy.Id}
mike.Id = 456
console.log(roy.Id)

//Default Values
var foo1 //Unassigned variable
console.log(foo1)

var foo2 = {bar:123}
console.log(foo2.bar)
console.log(foo2.bas) //Unassigned property

console.log(5 =='5')
console.log(5 ==='5')

console.log('' == '0')
console.log('' == 0)

var foo3 = null
console.log(foo3)

var foo4 = undefined
console.log(foo4)

console.log(null == undefined);
console.log(null === undefined);

//Are these all falsy
if (!false){
    console.log('falsy')
}
else{
    console.log('Truthy')
}
if (!null){
    console.log('falsy')
}
else{
    console.log('Truthy')
}
if (!undefined){
    console.log('falsy')
}
else{
    console.log('Truthy')
}
if(!0){
    console.log('falsy')
}
else{
    console.log('Truthy')
}
if(!''){
    console.log('falsy')
}
else{
    console.log('Truthy')
}
if (![]){
    console.log('falsy')
}
else{
    console.log('Truthy')
}