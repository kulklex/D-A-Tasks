import React, { useState, useEffect } from "react"
import axios from "axios"


export default function Posts() {
 const [users, setUsers] = useState("")

 useEffect( () => {
 try { async() => {
  axios.get('https://jsonplaceholder.typicode.com/posts')
  .then((res) => {
    console.log(res)
    setUsers(res.data)
  })
 }
 } catch (error) {
  console.error(error)
 }
 }, [])
 
  return (
    <div>
      <h1>Index Page</h1>
      
     
    </div>
  )
}
