const child_process = require('child_process');

child_process.exec('mkdir jc',(err,stdout,stdin)=>{
    console.log(stdout);
});

child_process.exec('javac childProcess.java',(err,stdout,stdin)=>{
    console.log(stdout);
});

child_process.exec('java childProcess',(err,stdout,stdin)=>{
    console.log(stdout);
})