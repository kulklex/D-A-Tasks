import nc from 'next-connect'
import Student from '../../../models/Student'
import connectDB from '../../../utils/connectdb'

export const handler = nc()
.delete(async(req, res) => {
    try {
        await Student.findByIdAndDelete({_id: req.query.id})
        res.send("User Deleted Successfully!")
    } catch (error) {
        console.log(error)
    }
})  
.put(async (req, res) => {
    try {
        const student = Student.findOne({_id: req.query.id})
        student.name = req.body.name 
        student.age = req.body.age 
        student.department = req.body.department
        await student.save()
        res.send("User Updated Successfully")
    } catch (error) {
        res.statusCode(500).send(`Something went wrong... Could not update    ${error}`  )
    }
})
.get(async(req, res) => {
    try {
        const student = await Student.findById(req.query.id)
        res.send(student)
    } catch (error) {
        res.send(`Student does not exist...     ${error}`)
    }
})