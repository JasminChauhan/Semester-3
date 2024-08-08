const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded());

students = [
    {
        id: 1,
        name: "Jasmin"
    },
    {
        id: 2,
        name: "Harshil"
    },
    {
        id: 3,
        name: "Viraj"
    },
    {
        id: 4,
        name: "Pruthviraj"
    }
];


// getAll
app.get('/students', (req, res) => {
    res.send(students);
});


// getById
app.get('/students/:id', (req, res) => {
    res.send(students[req.params.id]);
});


//create 
app.post('/students', (req, res) => {
    obj = {
        id: students.length + 1,
        name: req.body.name
    }
    students.push(obj);
    res.send("Added sucessfully..");
});


//delete
app.delete('/students/:id', (req, res) => {
    students.splice(req.params.id, 1);
    res.send("Deleted sucessfully..");
});


//update 
app.patch('/students/:id', (req, res) => {
    students[req.params.id].name = req.body.name;
    res.send("Updated sucessfully..");
});

//search
app.get('/students/search/:name',(req,res)=>{
    res.send(students.filter((student)=>student.name.includes(req.params.name)));
});


app.listen(5000, () => {
    console.log("server is running @ 5000");
});
