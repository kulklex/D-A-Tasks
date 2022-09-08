import axios from "axios";
import React from "react";

export default function Home({users}) {
  return (
    <div>
      <h1>Index Page</h1>
      <hr/>


      {users.map(user => (<div key={user.id}>
        <h4>Name: {user.name} </h4>
        <h6>Age: {user.age}</h6>
        <hr/>
      </div>))}




    </div>
  );
}


export async function getStaticProps(){
  try {
    const proxy = 'http://localhost:3000/api'
    const res = await axios.get(`${proxy}/users`)
    return {
      props: {
        users: res.data
      }
    }
  } catch (error) {
    console.error(error)
  }
}

