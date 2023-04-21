// Gerekli modüller ve bileşenler import edilir. 
import React, { useEffect, useState } from 'react'
import {
  Card,
  Stack,
  CardBody,
  Heading,
  Text,
  Container,
  Image,
  Center,
  Box,
  Button
} from '@chakra-ui/react'
import { ArrowBackIcon } from '@chakra-ui/icons'
import { useParams } from "react-router";
import { Link } from "react-router-dom";
import axios from 'axios';

function BookDetail() {

  // useparam linkt'en id bilgisine ulaşmak için kullanılır.
  let { bookId } = useParams();

  //API'den döndürülen veriler kitap state'ine aktarıldı.
  const [book, setBook] = useState()

  //Sayfaya girerken alınan id bilgilerine göre API'ye tekrar istekte bulunuldu ve bu bilgiler kitap state'ine aktarıldı.
  useEffect(() => {
    axios(`https://www.googleapis.com/books/v1/volumes/${bookId}`)
      .then((res) => setBook(res.data))
      .catch((e) => console.log(e))
  }, [bookId]);// bookId değişkeni bağımlılık listesinde yer alır ve eğer BookId değişirse bu kod tekrar çalıştırılır
 

  return (

    <Box
  w='100%' 
  h='100%'>
  <center>
    <Text as='em'  fontSize="6xl"><h1> KİTAP DETAYLARI </h1></Text>
  </center>
  <Container maxW="4xl" pt={40} pb={40}>
    {book && // Eğer 'book' değeri mevcutsa, kitap bilgileri ayrıntılı olarak gösterilir.

      <Card
        bg='red.100'
        justifyContent='center'
        direction={{ base: 'column' }}
        variant="outline"
        mt='-10'
      >
        <Stack>
          <CardBody>
            <Button>
              <Link mt={4} to={`/`}>
                <ArrowBackIcon fontSize={40}/>
              </Link>
            </Button>
            <Center><Heading size="xl">{book.volumeInfo.title}</Heading></Center>
            <Center><Text fontSize={37} py="2">{book.volumeInfo.authors?.join(', ')}</Text></Center>
            <Center><Image
              h={300}
              w={250}
              src={
                book.volumeInfo.imageLinks?.thumbnail || // Eğer kitap için resim bağlantısı mevcut değilse yerine geçici bir resim kullanılır.
                'https://www.hareketligifler.net/data/media/53/kitap-hareketli-resim-0032.gif'
              }
              alt={book.volumeInfo.title}
              borderRadius="xs"
            /></Center>
            <Text fontSize={25} color='black' py="2">
              <span dangerouslySetInnerHTML={{ __html: book.volumeInfo.description }} /> //Kitap açıklaması HTML formatında gösterilir.
            </Text>
            <Text align={'right'} py="2">{book.volumeInfo.publishedDate}</Text>
          </CardBody>
        </Stack>
      </Card>
    }
  </Container>
</Box>

  )
}

export default BookDetail
