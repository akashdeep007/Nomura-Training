//create the studentsDetail database and connect to it
const db = connect('127.0.0.1:27017/studentsDetail'),
    allstudentsDetail = null;

//create the names collection and add one document to it
db.names.insert({'name' : 'Kaumarjya Banerjee'});

//set a reference to all documents in the database
//allstudentsDetail = db.names.find();

//iterate the names collection and output each document
/*while (allstudentsDetail.hasNext()) {
   printjson(allstudentsDetail.next());
};

*/
