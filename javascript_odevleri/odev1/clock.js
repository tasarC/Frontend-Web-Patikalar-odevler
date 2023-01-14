let clock = document.querySelector('#myName')
let clock1 = prompt("lütfen isminizi giriniz")
if(clock1==""){
  alert('kullanıcı bilgisi girilmemiştir.')
  window.location.reload()
}

clock.innerHTML = clock1;


var aylar = ["Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"];
var gunler = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"];
    	 

(function showTime() {
    const now = new Date();
    let d = now.getDate();
    let a = now.getMonth();
    let y = now.getFullYear();
    let g = now.getDay();
    let h = now.getHours();
    let m = now.getMinutes();
    let s = now.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.querySelector('#myClock').innerHTML =d + " " + aylar[a] + " " + y + " " + gunler[g] + " "+ "saat "+ "  " + h + ":" + m + ":" + s ;
    setTimeout(showTime, 1000);
  })()
  
  function checkTime(i) {
    if (i < 10) {i = "0" + i};
    return i;
  }
 