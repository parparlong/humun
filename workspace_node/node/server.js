const express = require('express');
const app = express()

const port = 3000;
app.listen(3000, function(){
    console.log('server 켜짐 :',port)
})

function hello(req,resp){
    console.log('hello 함수 실행')
}


app.get('/hello', hello)


app.get('/world',function(req,resp){
    console.log('req.query.age',req.query.age)
})

app.get('/echo',function(req,resp){
    const id = req.query.id;
    resp.send(id)
})


app.get('/json',function(req,resp){
    const json = {
        name: 'kim',
        age: 20
    }
    resp.send(json)
})