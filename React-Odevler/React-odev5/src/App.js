// Gerekli kütüphaneler ve dosyalar import edilir. 
import Header from './components/Header';
import BookSearch from './components/BookSearch'
import React, { useState } from 'react'
import axios from 'axios'
import Footer from './components/Footer';


function App() {

  const [books, setBooks] = useState([])
  //İnput edilen veriler arama defteri durumunda tutulur.
  const [searchbook, setSearchBook] = useState('')
  //İnput işlendiğinde, değer bilgisi arama defterine aktarılır.
  function handleChange(event) {
    setSearchBook(event.target.value)
  }

  // Form gönderildiğinde, inputa girilen verilere göre API'ye istek yapılır.
  function formSubmit(event) {
    event.preventDefault()
    axios(`https://www.googleapis.com/books/v1/volumes?q=${searchbook}`)
      .then((res) => setBooks(res.data.items))//Dönen bu veriler kitaplara aktarılır.
    setSearchBook("")
  }

  return (
   <>
  {/* Başlık bileşenine form gönderme ve değişiklik işlevlerini ve arama kitabı değerini props olarak iletiyoruz */}
  <Header formSubmit={formSubmit} handleChange={handleChange} searchbook={searchbook} />
  {/* Kitap arama sonuçlarını görüntülemek için Kitap Arama bileşenini kullanıyoruz ve kitaplar değerini props olarak geçiriyoruz */}
  <BookSearch books={books} />
  {/* Altbilgi bileşenini görüntülemek için kullanıyoruz */}
  <Footer />
</>

  )
}

export default App;
