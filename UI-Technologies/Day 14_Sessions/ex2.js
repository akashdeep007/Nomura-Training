//connect to the studentsDetail database
var db = connect('127.0.0.1:27017/studentsDetail'),
    allstudentsDetail = null;

 

//SORT array descending  order
allstudentsDetail = db.students.find().sort({name:-1})

//SORT array ascending order
allstudentsDetail = db.students.find().sort({name:1})

//iterate the names collection and output each document
while (allstudentsDetail.hasNext()) {
   printjson(allstudentsDetail.next());
}