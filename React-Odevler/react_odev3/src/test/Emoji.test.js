//Gerekli bağımlılıkların eklenmesi
import {render,screen,fireEvent } from '@testing-library/react'
import '@testing-library/jest-dom'
import userEvent from '@testing-library/user-event'
import App from '../App'
import EmojiList from '../emojiList.json'

// testlerimizi gruplamak ve fonksiyon,modül vb.yapıların davranışını açıklamak için describe fonksiyonu kullanıldı.
describe("Emoji proje testleri",()=>{

    let header , emojiList ,copyEmoji

    // testlerimizden önce çalşmasını istedigimiz yapıları beforeEach fonsiyonuna eklenir.
    beforeEach(()=>{
        render(<App/>)
    })
    
    // Başlığın başarıyla oluşturulup oluşturulmadığını kontrol edecek test kodu 
    test("header render edildi",()=>{
        header =screen.getByText(/Emoji Search/i)
        expect(header).toBeInTheDocument()//header test kontrolü
       

    })
    
    //Uygulama ilk açıldığında emoji listesinin başarılı bir şekilde oluşturulup oluşturulmadığını kontrol edecek test kodu 
    test("Emoji listesi render edildi",()=>{

        emojiList = EmojiList.slice(0,20)
        
        // listedeki ilk 20 eleman ekranda gosterilmişmi kontrolü
        
        emojiList.map((list)=>{
            expect(screen.getByText(list.title)).toBeInTheDocument()

        })

    })
    
    // Bir filtre yapıldığında emoji listesinin o filtreye göre yeniden oluşturulduğunu kontrol edecek test kodu 
    test('Emoji listesinin bu filtreye uygun şekilde yeniden render edildi.', () => {

        const input = screen.getByRole('textbox'); //input değerlerine ulaşılır.

        fireEvent.change(input, { target: { value: 'snow' } });

        expect(screen.getAllByText(/snow/i)).toHaveLength(6);
    });

    // Listedeki herhangi bir emojiye tıklandığında, test kodu ilgili emojinin kopyalanıp kopyalanmadığını kontrol edecektir.
    test("İlgili emojinin kopyalanmadigini kontrol edilmesi",()=>{

        copyEmoji = screen.getByText("Blush") // sadece bir öğe tanımladık.

        userEvent.click(copyEmoji) //öğe ye tıklanmasyı simüle ediyoruz

        expect(copyEmoji.parentElement.getAttribute("data-clipboard-text")).toMatch("😊")//pano içeriğinin tıklanan emojinin simgesiyle onaylıyoruz.
    })

})
