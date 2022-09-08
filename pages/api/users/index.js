import nc from "next-connect";


const users = [
    {id: 1, name: "Dan", age: 20},
    {id: 2, name: "Fan", age: 230},
    {id: 3, name: "Can", age: 200},
    {id: 4, name: "Ban", age: 19},
    {id: 5, name: "Pan", age: 6}
]

const handler = nc()
.get((req, res) => {
    res.send(users)
})
.post((req, res) => {
    const {age} = req.body
    if(age > 20) return res.send('Adult!')
    res.send('This is users post request')
})


export default handler