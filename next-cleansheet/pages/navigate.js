import styles from '../styles/Home.module.css'
import Link from "next/link"
import { useRouter } from 'next/router';


export default function navigateTest() {
  const router = useRouter()
  const handleUsers = () => {
    router.push("/users")
  }
  const handleServices = () => {
    router.push("/services")
  }

  const userId = 8
  const username = "dan"
  return (
    <div className={styles.container}>
      <h1 className='testCss'>Navigate Page</h1>
      
      <Link href="/users">Users</Link>
      <br/>
      <Link href="/services">Services</Link>
      <br/>
      <button onClick={handleUsers}>navigate to users</button>
      <br/>
      <button onClick={handleServices}>navigate to services</button>
      <br/>
      <button onClick={() => {router.push(`/services/${userId}/${username}`)}}>navigate to 8/dan</button>
    </div>
  )
}
