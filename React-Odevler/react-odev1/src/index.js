import axios from "axios";

export default async(number)=>{
   try {
    const {data:users} =await axios(`https://jsonplaceholder.typicode.com/users/${number}`)
    const {data:post} = await axios(`https://jsonplaceholder.typicode.com/posts?userId=${number}`)
    return {users,post}
   } catch (error) {
    console.log("hata oluştu",error)
   }
}
