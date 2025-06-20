var foo = {
};
foo.bas = bas;
var dump = {
}
dump.bas = bas;

function bas(){
    if (this === global)
        console.log('called from global');
    if (this === foo)
        console.log('called from foo');
    if (this == dump)
        console.log('called from dump');
}

bas(); //called from global


foo.bas(); //called from foo
dump.bas(); //called from dump
