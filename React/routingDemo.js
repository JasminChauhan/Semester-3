import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { BrowserRouter, Route, Routes, Outlet, Link } from 'react-router-dom';

function Home() {
  return (
    <>
      <div class="card" style={{ width: "18rem" }}>
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top" alt="..." />
        <div class="card-body">
          <p class="card-text">Welcome to Home page</p>
        </div>
      </div>
    </>
  )
}
function About() {
  return (
    <>
      <div class="card" style={{ width: "18rem" }}>
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top" alt="..." />
        <div class="card-body">
          <p class="card-text">Welcome to About page</p>
        </div>
      </div>
    </>
  )
}
function Contact() {
  return (
    <>
      <div class="card" style={{ width: "18rem" }}>
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top" alt="..." />
        <div class="card-body">
          <p class="card-text">Welcome to Contact page</p>
        </div>
      </div>
    </>
  )
}

function Layout() {
  return (
    <>
      <div className='container'>
        <div className='row'>
          <div className='col-2 border border-dark m-3'>
            <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" style={{ width: "200px" }} />
          </div>
          <div className='col border border-primary m-3'>

            <ul class="nav nav-underline">
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/home">Home</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to="/about">About</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to="/contact">Contact</Link>
              </li>
            </ul>
          </div>
        </div>
        <div className='row'>
          <div className='col-4 border border-danger m-3'>
            <>
              <ol class="list-group list-group-numbered">
                <li class="list-group-item d-flex justify-content-between align-items-start">
                  <div class="ms-2 me-auto">
                    <div class="fw-bold">Subheading</div>
                    Content for list item
                  </div>
                  <span class="badge text-bg-primary rounded-pill">14</span>
                </li>
                <li class="list-group-item d-flex justify-content-between align-items-start">
                  <div class="ms-2 me-auto">
                    <div class="fw-bold">Subheading</div>
                    Content for list item
                  </div>
                  <span class="badge text-bg-primary rounded-pill">14</span>
                </li>
                <li class="list-group-item d-flex justify-content-between align-items-start">
                  <div class="ms-2 me-auto">
                    <div class="fw-bold">Subheading</div>
                    Content for list item
                  </div>
                  <span class="badge text-bg-primary rounded-pill">14</span>
                </li>
              </ol>
            </>
          </div>
          <div className='col border border-success m-3'>
            <Outlet></Outlet>
          </div>

        </div>
        <div className='row'>
          <div className='col border border-warning m-3 text-center text-primary'>
            This  is made By Jasmin Chauhan 
          </div>
        </div>
      </div>
    </>
  );
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>

        <Route path="/home" element={<Home />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/about" element={<About />} />

      </Route>
    </Routes>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals

