import React from 'react'
import { useRouter } from 'next/router';

export default function servicesId() {
    const router = useRouter()
  return (
    <div>service id is {router.query.servicesid}</div>
  )
}
