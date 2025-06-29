var relationship1 = {
    name: 'zero',
    friend : ['nero', 'hero', 'xero'],
    logfriends: function(){
        var that = this;
        this.friend.forEach(function (friend){
            console.log(this.name, friend);
        });
    },
};

var relationship2 = {
    name: 'zero',
    friend : ['nero', 'hero', 'xero'],
    logfriends(){
        this.friend.forEach((friend) =>{
            console.log(this.name, friend);
        });
    },
};

var scopeTest = {
    name: 'Some misterious name',
    age : 33,
    projects : ['project A', 'project B', 'project C'],
    display() {
        console.log(this.name);
        console.log(this.age);
        var that = this;
        this.projects.forEach(function(project){
            console.log(project, that.name);
        })
    }
}

testFunction = function(){
    var list = ['fruit', 'brick'];
    list.forEach(function (item){
        console.log(item);
    })
}

scopeTest.display();
testFunction();

relationship1.logfriends();
relationship2.logfriends();