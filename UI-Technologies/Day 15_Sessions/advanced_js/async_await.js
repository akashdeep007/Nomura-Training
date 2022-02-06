async function myFunc() {
    console.log('Inside myFunc function');
    const response = await fetch('https://api.github.com/users');
    console.log('before response');
    const users = await response.json();
    console.log('users resolved')
    return users;


}

console.log("Before calling myFunc")

let a = myFunc();

console.log("After calling myFunc")


console.log(a);

a.then(data => console.log(data)).catch(err => console.log('My code breaks...'))
console.log("Last line of this js file")