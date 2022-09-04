import React from 'react'
import Link from "next/link"
import styles from "../../styles/Home.module.css"

export default function Users() {
  return (
    <div className={styles.container}>
      <h1>Users Page</h1>
      <Link href="/">Index</Link>
      <br/>
      <Link href="/services">Services</Link>
    </div>
  )
}
``