import React from 'react'
import {useRouter} from "next/router"

export default function id() {
    const router = useRouter()
  return (
    <div> 
        <h1>user details</h1>
        <br/>
        <p>user id is {router.query.id}</p>
    </div>
  )
}
