import React from 'react'
import Link from "next/link"

export default function services() {
  return (
    <div>
      <h1>Services Page</h1>
      <Link href="/users">Users</Link>
      <br/>
      <Link href="/">Index</Link>
    </div>
  )
}
