const http = require('http');

const server = http.createServer((req, res) => {

    res.setHeader('Content-Type', 'text/html');
    if (req.url == '/home') {
        res.end(`<div class="card" style="width: 18rem;">
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top img-fluid" style="width: 18rem;"alt="...">
        <div class="card-body">
          <h5 class="card-title">My HomePage</h5>
          <p class="card-text">Hello this is my home page thanks for visiting...</p>
        </div>
      </div>`);
    }
    if (req.url == '/about') {
        res.end(`<div class="card" style="width: 18rem;">
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top img-fluid" style="width: 18rem;"alt="...">
        <div class="card-body">
          <h5 class="card-title">My AboutPage</h5>
          <p class="card-text">Hello this is my about page thanks for visiting...</p>
        </div>
      </div>`);
    }
    if (req.url == '/contact') {
        res.end(`<div class="card" style="width: 18rem;">
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top img-fluid" style="width: 18rem;"alt="...">
        <div class="card-body">
          <h5 class="card-title">My ContactPage</h5>
          <p class="card-text">Hello this is my Contact page thanks for visiting...</p>
        </div>
      </div>`);
    }
    if (req.url == '/') {
        res.end(`<div class="card" style="width: 18rem;">
        <img src="https://gratisography.com/wp-content/uploads/2024/01/gratisography-cyber-kitty-800x525.jpg" class="card-img-top img-fluid" style="width: 18rem;"alt="...">
        <div class="card-body">
          <h5 class="card-title">My WebPage</h5>
          <p class="card-text">Hello this is my weB page thanks for visiting...</p>
        </div>
      </div>`);
    }
});
server.listen(5050);



