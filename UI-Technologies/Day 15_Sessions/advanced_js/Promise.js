// Pretend that this response is coming from the server
const students = [{
        name: "STD1",
        subject: "JavaScript"
    },
    {
        name: "STD2",
        subject: "Machine Learning"
    }
]


function enrollStudent(student) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            students.push(student);
            console.log("Student has been enrolled");
            const error = false;
            if (!error) {
                resolve();
            } else {
                reject();
            }
        }, 1000);
    })
}

function getStudents() {
    /// return new Promise(function (resolve, reject) {
    setTimeout(function () {
        let str = "";
        students.forEach(function (student) {
            str += `<li> ${student.name}</li>`
        });
        console.log(str)
        document.getElementById('students').innerHTML = str;
        console.log("Students have been fetched");
        /* const error = false;
         if (!error) {
             resolve();
         } else {
             reject();
         }*/
    }, 5000);
    /// })
}

function getdata() {
    console.log('Get data')
}
let newStudent = {
    name: "STD3",
    subject: "Python"
}

enrollStudent(newStudent)
    .then(getStudents)
    .then(getdata)
    .catch(function () {
        console.log("Some error occured");
    });