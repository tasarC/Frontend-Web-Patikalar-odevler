import Containerr from './component/Container.js'
import Header from './component/Header.js'
import { Container } from '@mui/material';
import { WeatherProvider } from './context/WeatherContext.js';
import Footer from './component/Footer';


function App() {
  return (
    <>
    
      <Container>
        <WeatherProvider>
          <Header />
          <Containerr />
        </WeatherProvider>
      </Container>
      <Footer />
    </>


  );
}

export default App;