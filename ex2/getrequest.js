var express = require ('express');
var http = require ('help');

var app = express(); 
var server = http.createServer(app);
// Se digitarmos no navegador localhost:3333, faremos uma requesição GET 
app.get('/', function (req, res){
    //Servidor manda a resposta da requisição de volta para cliente 
    res.send("<h1> Você se conectou com sucesso </h1>");
});
//esperando a porta 3333
server.listen(3333, function(){
    console.log("Swerver listenig on port: 3333");
});