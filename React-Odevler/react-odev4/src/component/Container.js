// Gerekli kütüphanelerin ve bağımlılıkların import edilmesi
import React, { useContext, useEffect, useState } from 'react';
import WeatherContext from '../context/WeatherContext.js'
import { Card } from 'react-bootstrap'

function Container() {
    // WeatherContext api den bileşen çekiyoruz
    const { weather } = useContext(WeatherContext)
    const [day, setDay] = useState("numeric")
    const days = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"]
    const today = new Date().getDay(); // haftanın günlerini getiren bir bileşen
    
    //weather state değişkeninde bir değişiklik olduğunda setDay fonksiyonu çağrılarak days değeri, day state değişkenine atanır.
    useEffect(() => {
        setDay(days)
    }, [weather]);

    //weather değişkeninin değerine bağlı olarak bir şeylerin render edilmesini sağlar.
    if (!weather) {
        return <div><p>Yükleniyor...</p></div>
    }
    
    // hava durumunda kullanılacak olan icon linki bir bileşene atandı.
    const icon_src = `http://openweathermap.org/img/wn/`

    return (
        <div className='Card'>
            {
             //weather değişkeninin değerinin undefined, null veya false olup olmadığını kontrol eder
             weather && weather.map((item, id) =>
            //weather değişkeni bir dizi (array) olup, dizinin elemanlarını .map() fonksiyonu ile döndürülür.
                item.weather.map((weather) =>

                //güncel gün bilgisini alarak oluşrulan Card etiketine özellik ekleme
                    <Card key={weather.id}  style={{ border: "3px solid #0D2877", backgroundColor: day[id] === days[today] ? "#2f4f4f" : "" }} >
                        <h1> {day[id]}</h1>
                        <img src={`${icon_src}${item.weather[0].icon}@2x.png`} alt={icon_src} />
                        <br></br>
                        <h3 style={{ textAlign: 'center' }}>{weather.description}</h3>
                        <div className='hava'>
                            <span >nem: %{item.main.humidity}</span>
                            <span >rüzgar: {item.wind.speed}m/s</span>
                        </div>
                        <h3>{item.main.temp.toFixed(1)}°{" "} ---  {item.main.feels_like.toFixed(1)}°</h3>
                    </Card>
                ))
            }
        </div>
    )
}

export default Container
