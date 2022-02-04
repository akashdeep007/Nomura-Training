//create the studentsDetail database and connect to it
const db = connect('127.0.0.1:27017/studentsDetail');
  let  allstudentsDetail = null;

//create the students collection and add one document to it
/*db.students.insert(
   
 

{'name' : 'ABCD','subject':'MBA','PL':["PM","IM"]}


);
*/
const obj=[
   {'name' : 'XYZ','subject':'MBA','PL':["PM","IM"]},
   {'name' : 'ABC','subject':'MBA','PL':["PM","IM"]},
   {'name' : 'MNO','subject':'MBA','PL':["PM","IM"]},
   {'name' : 'EF','subject':'MBA','PL':["PM","IM"]}
]
db.students.insertMany(
   obj

);

//set a reference to all documents in the database
allstudentsDetail = db.students.find();

//iterate the students collection and output each document

while (allstudentsDetail.hasNext()) {
  
   printjson(allstudentsDetail.next());
};


