/* Getting OS utilities
const os = require('os');

console.log("Platform: " + os.platform());
console.log("Architecture: " + os.arch());
*/


// include node fs module
const fs = require('fs');
/*
// writeFile function with filename, content and callback function
fs.writeFile('newfile.txt', 'Learn Node FS module', (err) => {
  if (err) throw err;
  console.log('File is created successfully.');
});



fs.appendFile('newfile.txt', ' Add something more.', (err) => {
  if (err) throw err;
  console.log('Updated!');
});

fs.rename('newfile.txt', 'oldfile.txt', function (err) {
  if (err) throw err;
  console.log('File Renamed!');
});

if (fs.existsSync('oldfile.txt')) {
  fs.unlink('oldfile.txt', function (err) {
    if (err) throw err;
    console.log('File deleted!');
  });
}
else{
  console.log('File not found.')
}
*/
/*
fs.readFile("customer.json", function (err, data) {

  // Check for errors
  if (err) throw err;

  // Converting to JSON
  const customer = JSON.parse(data);

  //console.log(customer); // Print users 
});*/

/*
let user = {
  name: "New User",
  age: 30,
  language: ["PHP", "Go", "JavaScript"]
};
const users = require("./customer");

//console.log('Line no:58 ' + JSON.stringify(users))

users.unshift(user);

//console.log(users)

fs.writeFile("customer.json", JSON.stringify(users), err => {

  // Checking for errors
  if (err) throw err;

  console.log("Done writing"); // Success
});
*/

const http = require('http');


const requestListener = function (req, res) {
  
  res.writeHead(200);
  res.end('Hi All!');
}

const server = http.createServer(requestListener);
server.listen(8080);

console.log('Server Started:8000')