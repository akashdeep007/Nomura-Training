let myBtn = document.getElementById("myBtn");

// div with id content 
let content = document.getElementById("content");



function getData() {
    console.log("Started getData")
    url = "https://reqres.in/api/users";
    fetch(url).then((response) => {
        console.log("Inside first then")
        return response.json();
    }).then((data) => {
        console.log("Inside second then")
        console.log(data);

    });
    completed();
}


function postData() {
    url = "https://reqres.in/api/users";
    data = '{"name":"ABC","job":"leader"}'
    params = {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: data
    }
    fetch(url, params).then(response => response.json())
        .then(data => console.log(data))
}

function completed() {
    console.log('Completed func call..')
}
console.log("Before running getData")
//getData()
console.log("After running getData")
postData()