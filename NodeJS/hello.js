var http = require('http'); // adding "http" module to our program

var date = require('./datemodule');

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});//add header parameters
	res.write('Hello World! ' + date.getDate());
	res.write(" And time is " + date.getTime());
    res.end();
}).listen(8050);