//connect to the studentsDetail database
const db = connect('127.0.0.1:27017/studentsDetail');
  let    allstudentsDetail = null;


//search for the document whose name property
db.students.find().forEach( function(thisDoc) {
  if(thisDoc.name === 'ABC'){
    db.students.updateOne(
      { _id: thisDoc._id, "PL.lang":"C++" },
      { $set: { "PL.$.lang" : "Python" } }
   )
    //update the record that for name and remove other value from index
    //db.students.update( { "_id" : thisDoc._id }, { "name": "XYZ" } );
 //update the record that only name and retain other value from index
   // db.students.update( { "_id" : thisDoc._id }, { $push:{PL:{$each:["Geo","Hist"],$position:-2 }}} );
  }; 
});
 
//set a reference to all documents in the database
allstudentsDetail = db.students.find();

//iterate the names collection and output each document
while (allstudentsDetail.hasNext()) {
   printjson(allstudentsDetail.next());
}