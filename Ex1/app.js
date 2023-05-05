const http = require ('http')

const hostname = '127.0.0.1'; //localhost
const port = 3000; //Porta da aplicação 

const server = http.createServer((req, res) => {
    res.statusCode = 200; // status retornando indicado sucesso
    res.setHeader('Content-Type', 'text/html' );
    res.end ('<h1> Hello Worlf </h1>');
})
server.listen(port, hostname,() => {
    console.log(`server running at http: //${hostname} : ${port}/`);
})
