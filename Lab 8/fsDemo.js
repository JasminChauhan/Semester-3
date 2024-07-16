const fs = require('fs');

const a = fs.exists('pathDemo.js', (data) =>{
    console.log("file pathdemo exist: ",data);
});

const b = fs.stat('pathDemo.js', (err,data)=>{
    console.log("pathdemo file's stats are as follows :",data);
});

const c = fs.readFile('pathDemo.js',(err,data)=>{
    console.log("data from pathdemo file is : ",data.toString());
});

const d = fs.writeFile('dataFile.txt','written from fs.write() method\n' ,(err,data)=>{
    console.log("data written to data file");
});

const e = fs.appendFile('dataFile.txt','written from fs.append() method',(err,data)=>{
    console.log("data appended to data file");
});