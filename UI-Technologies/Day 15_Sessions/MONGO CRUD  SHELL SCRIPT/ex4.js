//connect to the studentsDetail database
const db = connect('127.0.0.1:27017/studentsDetail');
  let  allstudentsDetail = null;


//search for the document
db.students.find().forEach( function(thisDoc) {
  if(thisDoc.name === 'ABCD'){
    //remove the record that contains "Dick Whitman"
  //  db.students.remove({ "_id" : thisDoc._id });
  db.students.update( { "_id" : thisDoc._id }, { $unset: { "subject": "" } } );
  }; 
});

//set a reference to all documents in the database
allstudentsDetail = db.students.find();

//iterate the names collection and output each document
while (allstudentsDetail.hasNext()) {
   printjson(allstudentsDetail.next());
}