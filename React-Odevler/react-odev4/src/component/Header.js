// Gerekli kütüphanelerin ve bağımlılıkların import edilmesi
import { useContext } from 'react'
import WeatherContext from '../context/WeatherContext.js'
import cities from '../cities.json' //kullanılacak olan şehir veri setimiz


function Header() {
    // WeatherContext api den bileşen çekiyoruz.
    const { setcity } = useContext(WeatherContext);

    //aldığımız setsity bileşeninin kullanıcı tarafından girilen veriye göre işlenilmesi
    const handleChange = ((citySelect) => {
        setcity(citySelect.target.value)
    })


    return (

        <div className='header'>
            <h1 style={{ color: 'white' }} >HAVA DURUMU </h1>

            <div className='cities'>
                <select onChange={handleChange}> 
                    {
                        // cities adlı veri seti map edilerek veriler listelenir 
                        cities.map((city) =>
                            < option key={city.id} > {city.name}</option>
                        )
                    }
                </select>

            </div>


        </div >


    )
}

export default Header
