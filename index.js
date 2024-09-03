import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const Logo = ()=>{
  return(<h3>Logo here</h3>);
}

const MenuBar = ()=>{
  return(<h2>MenuBar here</h2>);
}

const Footer = ()=>{
  return(<h4>Footer here</h4>);
}

const Seperator = (props)=>{
  let temp = "";
  for (let i = 0; i < props.count; i++) {
    temp += props.by;
  }
  return(temp);
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>  
    <Logo/>
    <Seperator count="50" by="="/>
    <MenuBar/>
    <Seperator count="30" by="#"/>
    <Footer/>

  </>
  // <React.StrictMode>
  //   <App />
  // </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
