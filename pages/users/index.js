import axios from 'axios'
import React from 'react'
import Link from 'next/link'
import { useRouter } from 'next/router'


export default function indexPage({users}) {
    const router = useRouter()
  return (
    <div className='m-5'>
        <h2>Users List</h2>
        <table className='table table-dark table-striped  table-bordered'>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Username</th>
                    <th>Web Address</th>
                    <th>Phone NO</th>
                    <th>Company</th>
                </tr>
            </thead>
            <tbody style={{cursor: 'pointer'}} >
                {users.map(user => (<tr key={user.id} onClick={() => {router.push(`/users/${user.id}`)}}>
                    <td>{user.id}</td>
                    <td>{user.name}</td>
                    <td>{user.email}</td>
                    <td>{user.username}</td>
                    <td>{user.website}</td>
                    <td>{user.phone}</td>
                    <td>{user.company.name}</td>
                </tr>))}
            </tbody>
        </table>
    </div>
  )
}


export async function getStaticProps(){
try {
    const res = await axios.get('https://jsonplaceholder.typicode.com/users/')
    return {
        props: {
            users: res.data
        }
    }
} catch (error) {
    console.error(error)
}
}