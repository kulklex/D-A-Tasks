import React from 'react'
import { useRouter } from 'next/router';

export default function uname() {
    const router = useRouter()
  return (
    <div>
      <p>service id is {router.query.servicesid}</p>
      <p>service username is {router.query.uname}</p>
    </div>
  )
}
