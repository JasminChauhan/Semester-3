const http = require('http');

const server = http.createServer((req , res)=>{
    res.end("hello world from node js");
});
server.listen(5000);

