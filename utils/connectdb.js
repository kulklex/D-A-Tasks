const mongoose = require('mongoose')


async function connectDB(){
        await mongoose.connect('mongodb+srv://kulklex:Adekunle08118082878@cluster0.4kiujfr.mongodb.net/?retryWrites=true&w=majority', )
        .then(() => console.log("Connected to MongoDB"))
        .catch((err) => console.error(`Failed to connect.... ${err}`))  
}


export default connectDB;