const http = require('http');
const fs = require('fs');
const os = require('os');
const host = '127.0.0.1';
const port = 5000;

const server = http.createServer((req, res)=> {
const urlPath = req.url;
const options = {
    hostname: os.hostname(),
    platform: os.platform(),
    architecture: os.arch(),
    numberOfCPUS: os.cpus.length,
    networkInterface: os.networkInterfaces(),
    uptime: os.uptime()
}
const osData = JSON.stringify(options);

    if(urlPath == '/'){
        res.statusCode = 200;
        res.setHeader('Content-Type', 'text/html');
        fs.readFile('./pages/index.html', (err, data) => {
            res.write(data);
            res.end();
        })
    } else if (urlPath == '/about'){ 
        res.statusCode = 200;
        res.setHeader('Content-Type', 'text/html');
        fs.readFile('./pages/about.html', (err, data) => {
            res.write(data);
            res.end();
        })
    } else if(urlPath == '/sys') {
        res.statusCode = 201;
        res.setHeader('Content-Type', 'text/plain');
        fs.writeFile('./osinfo.json', osData, () => {
            res.write("Your OS info has been saved successfully!");
            res.end();
            return;
        })
    } else {
        res.statusCode = 404;
        res.setHeader('Content-Type', 'text/html');
        fs.readFile('./pages/404.html', (err, data) => {
            res.write(data);
            res.end();
        })
    }
});

server.listen(port, host, ()=>{
    console.log(`Server is running at ${host}:${port}`);
});