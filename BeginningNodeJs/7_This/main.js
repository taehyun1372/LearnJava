var foo = {
    bar : 123,
    bas : function(){
        console.log('inside this.bar is :', this.bar); //this refers to the calling context
    }
}

bar = "this is global bar"

console.log('foo.bar is', foo.bar);
foo.bas(); // i amm calling bas using calling context foo.

function foo2(){
    console.log('is this called from globals? : ', this === global);
}

foo2();

console.log(global.bar);