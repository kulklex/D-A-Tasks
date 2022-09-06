import axios from 'axios'
import React from 'react'

export default function User({user}) {
  return (
    <div className='m-5'>
        <h2>{user.name}</h2>
        <hr/>

        <p>Name: <b>{user.name}</b></p>
        <p>Email: <b>{user.email}</b></p>
        <p>Username: <b>{user.username}</b></p>
        <p>Mobile: <b>{user.phone}</b></p>
        <p>Company: <b>{user.company.name}</b></p>
    </div>


  )
}


export async function getServerSideProps(context){
    try {
        const response = await axios.get(`https://jsonplaceholder.typicode.com/users/${context.query.id}`)
        return {
            props : {
                user: response.data
            }
        }
    } catch (error) {
        console.error(error)
    }
}

