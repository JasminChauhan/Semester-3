 // const path = require('./index.js');

// path();
const path = require('path');

const a = path.normalize('/abc/xyz/..')
console.log("normalize method:- ",a);

const b = path.join('/abc','xyz');
console.log("join method:- ",b);

const c = path.resolve('D:\Jasmin','D:\Jasmin\Lab 8');
console.log("Resolve method:- ",c);

const d = path.relative('/abc/xyz/','/abc/def');
console.log("Relative method:- ",d);

const e = path.dirname('D:\Jasmin\Lab 8\pathDemo.js');
console.log("DirName = ",e);

const f = path.basename('D:\\Jasmin\\Lab 8\\pathDemo.js');
console.log("BaseName = ",f);

const g = path.extname('D:\\Jasmin\\Lab 8\\pathDemo.js');
console.log("ExtName = ",g);