//inicializa/importa o express
const express = require('express')
//cria um app pelo express
const app = express 
//ouve a porta e inicializa uma função lambda
app.listen(3000, () => console.log('servidor rodando na porta 3000'))
//declara o que deve ser feito na rota GET
// declararequest e response
app.get('/', (req, res) => res.send('Servidor rodando, tudo ok'))

app.get('/atendimentos', (req,res) => res.send('Você está na rota de atendimento'))