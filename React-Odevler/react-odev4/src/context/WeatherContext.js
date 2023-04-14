// Gerekli kütüphanelerin ve bağımlılıkların import edilmesi
import axios from "axios";
import { createContext, useState, useEffect } from "react";

const WeatherContext = createContext();

export const WeatherProvider = ({ children }) => {
  const [city, setcity] = useState("Ankara");
  const [current, setCurrent] = useState([]);
  const [weather, setWeather] = useState([]);



  useEffect(() => {

    // API'ye gönderilen istek için bir anahtar (key) gerekmekte
    const key = "1267cb9050fc373669749d1313b6c5b7"
    //axios ile bir API çağrısı yaparak hava durumu verilerini çeker
   
    axios(`https://api.openweathermap.org/data/2.5/forecast?q=${city}&appid=${key}&units=metric&lang=tr&cnt=7`)
      .then((res) => {
        setWeather(res.data.list)

        //her saat için alınan hava durumu bilgilerindeki main değerleri setCurrent fonksiyonuyla ayarlanır.
        res.data.list.map((item) => setCurrent(item.main))

      }
      )
  }, [city]) //city değişkeni bağımlılık listesinde yer alarak, eğer city değişirse bu kod tekrar çalıştırılır

 //context, "weather", "setWeather", "city", "setcity" ve "current" adlı değişkenleri içerir.
  const values = { weather, setWeather, city, setcity, current }

  //"WeatherContext" adlı bir context oluşturlur.
  return <WeatherContext.Provider value={values}>{children}</WeatherContext.Provider>
}
export default WeatherContext;