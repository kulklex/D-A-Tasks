import React from 'react'
import Footer from './Footer'
import Header from './Header'

export default function Outlet({children}) {
  return (<>
  
    <Header/>
    <div className='children'>
        {children}
    </div>
    <Footer/>
  </>
  )
}
