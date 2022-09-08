import connectDB from './../../utils/connectdb';


connectDB()

export default (req,res) => {
    res.status(200).send("Hello Page")
}