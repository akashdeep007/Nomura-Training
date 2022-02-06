const students = [{
        name: "STD1",
        subject: "JavaScript"
    },
    {
        name: "STD2",
        subject: "Machine Learning"
    }
]



function enrollStudent(student, c) {
    setTimeout(function () {
        students.push(student);
        console.log("Student has been enrolled");
        c(getdata);
    }, 3000);
}

function getStudents(d) {
    setTimeout(function () {
        let str = "";
        students.forEach(function (student) {
            str += `<li> ${student.name}</li>`
        });
        console.log(str)
        document.getElementById('students').innerHTML = str;
        console.log("Students have been fetched");
        d()
    }, 1000);
}

function getdata() {
    console.log('Get data')
}
let newStudent = {
    name: "STD3",
    subject: "Python"
}
enrollStudent(newStudent, getStudents);
//getdata()