import axios from 'axios'
import React from 'react'

export default function Post({post}) {
  return (
    <div>
        <p>SSRWP Page</p>
        <h1>{post?.title}</h1>
    </div>
  )
}


export async function getServerSideProps(context) {
    try {
        const response = await axios.get(`http://jsonplaceholder.typicode.com/posts/${context.query.id}`)
        console.log(response.data)
        return {
          props: {
            post: response.data
          }
        }
    } catch (error) {
        console.log(error)
    }
}
