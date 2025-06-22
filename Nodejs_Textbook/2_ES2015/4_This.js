var relationship1 = {
    name: 'zero',
    friend : ['nero', 'hero', 'xero'],
    logfriends: function(){
        var that = this;
        this.friend.forEach(function (friend){
            console.log(that.name, friend);
        });
    },
};