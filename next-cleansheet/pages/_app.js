import Outlet from '../components/Outlet'
import '../styles/globals.css'

function MyApp({ Component, pageProps }) {
  return <Outlet>
    <Component {...pageProps} />
  </Outlet>
}

export default MyApp
