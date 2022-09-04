import React from 'react'
import Footer from './Footer'
import Header from './Header'
import Head from 'next/head'

export default function Outlet({children}) {
  return (
    <>
    <Head>
    <title>NextJs CleanSheet</title>
    </Head>

        <Header/>
        <>{children} </>
        <Footer/>
    </>
  )
}
