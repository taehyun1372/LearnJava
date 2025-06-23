function displayUserInfo(config){
    console.log(`Name : ${config.name}`);
    console.log(`Age : ${config.age}`);
    console.log(`IsAdmin : ${config.isAdmin}`);
}

displayUserInfo({
    name : "Alice",
    age : 30,
    isAdmin : true
});

const calculator = {
    add(a, b){
        return a + b;
    },
    subtract(a, b){
        return a - b;
    }
}


const circleCalculator = {

    pi : 3.14,
    radius(r){
        return r * this.pi * 2;
    },
    square(r){
        return r * r * this.pi;
    }

}

console.log(calculator.add(5 ,3));
console.log(calculator.subtract(2 ,7));

console.log(circleCalculator.radius(3));
console.log(circleCalculator.square(3));
