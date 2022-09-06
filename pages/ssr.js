import axios from "axios";
import React from "react";

export default function ssr({users}) {
  return (
    <div>
      <h1>SSR Page</h1>
      {users.map(user => (<h1 key={user.id}>{user.title}</h1>))}
    </div>
  );
}

export async function getStaticProps() {
  try {
   const response = await axios.get(
      "http://jsonplaceholder.typicode.com/posts"
    );
    return {
      props: {
        users: response.data
      },
    };
  } catch (error) {
    console.log(error)
  }
}
