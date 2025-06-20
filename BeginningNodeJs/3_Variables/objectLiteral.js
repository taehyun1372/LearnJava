foo = []
foo.push(1)
foo.push(2)
console.log(foo)

foo.pop()
foo.unshift(10)
console.log(foo)

var customer = {}
customer.Id = 3
customer.Name = "Mike"

console.log(customer.Id)
console.log(customer.Name)

var customer1 = customer;


customer1.Id = 20
customer.Name = "Roy"

console.log(customer1)
console.log(customer)

