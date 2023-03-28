import axios from "axios";

 //'number' olarak tanımlanan bir parametre ile bir asenkron fonksiyon oluşturuldu.
export default async(number)=>{
 
   //kullanıcı ve post verileri bir kimlik kullanarak axios fonksiyonu ile çağrıldı.
   try {
    const {data:users} =await axios(`https://jsonplaceholder.typicode.com/users/${number}`)
    
    const {data:post} = await axios(`https://jsonplaceholder.typicode.com/posts?userId=${number}`)
    
    return {users,post}
    
   } catch (error) {
    
    console.log("hata oluştu",error)
    
   }
}
