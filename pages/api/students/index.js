import nc from 'next-connect'
import Student  from '../../../models/Student';
import connectDB from './../../../utils/connectdb';

connectDB()

const handler = nc()
.get((async (req, res) => {
    try {
        const students = await Student.find({})
        res.status(200).send(students)
    } catch (error) {
        return res.status(400).send(`Something went wrong...  ${error}`)
    }
}))

.post(async (req, res) => {
    const {id, name, age, department} = req.body
    const newStudent = new Student({id, name, age, department})
    try {
        await newStudent.save()
        res.status(201).send('Student successfully created!')
    } catch (error) {
        return res.status(500).send(`Something went wrong...   ${error }`)
    }
})

export default handler