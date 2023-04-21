// Gerekli modülleri ve bileşenler import edilir. 
import {
  Container,
  Center,
  Button,
  Text,
  Box,
  GridItem,
  Grid,
  Card,
  CardBody,
  Image,
  Stack,
  Heading,
} from '@chakra-ui/react'
import { Link } from "react-router-dom";
function BookSearch({books}) {

  return (
      <Box mt={5}>
        <Container maxW='8xl' >
          <Grid templateColumns="repeat(4, 1fr)" gap={6} >
            {books && //"books" adlı  değişkenin varlığına bağlı olarak her kitap için bir "map" işlemi gerçekleştirir ve her kitap için bir "GridItem" bileşeni oluşturuyoruz.

              books.map((book) => (
                <GridItem w="100%" key={book.id}>
                  <Card 
                    bgImage="url('https://kapidaodemeduvarkagidi.com/pembe-bulutlu-duvar-kagidi-6983-P-ORG.jpeg')"
   
                  bgColor='red.100'
                  _hover={{
                    transform: 'translate(-2px)',
                    boxShadow: 'lg',
                  }} h={500}  >
                    <CardBody  >
                      <Center>
                        <Image
                          h={250}
                          w={160}
                          src={
                            book.volumeInfo.imageLinks?.thumbnail ||// Eğer kitap için resim bağlantısı mevcut değilse yerine geçici bir resim kullanılır.
                            'https://www.hareketligifler.net/data/media/53/kitap-hareketli-resim-0032.gif'
                          }
                          alt={book.volumeInfo.title}
                          borderRadius="md"
                        />
                      </Center>
                      <Stack mt="7" spacing="3">
                        <Center>

                          <Heading size="s">{book.volumeInfo.title}</Heading>
                        </Center >
                        <Center mt="5">
                          <Text fontSize="s">
                            {book.volumeInfo.authors?.join(', ')}
                          </Text>
                        </Center>
                      </Stack>
                    </CardBody>
                    <Center>
                      <Button bg='blue.200' size='lg' mb={3}>
                        <Link to={`book/${book.id}`} variant="linkBox" fontSize="md">{/* Link bileşeni, book.id değişkenine bağlı olarak bir kitap detay sayfasına yönlendirir  */}
                          Detail  
                        </Link>
                      </Button>
                    </Center>
                  </Card>
                </GridItem>
              ))}
              
          </Grid>
        </Container>
      </Box>
  )
}

export default BookSearch
