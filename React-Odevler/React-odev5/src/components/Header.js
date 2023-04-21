//Arayüz tasarımı için gerekli olan chakra ui bileşenini import edildi.
import {
  Container,
  Center,
  FormControl,
  Input,
  Button,
  Text,
  HStack,
  Box,
} from '@chakra-ui/react'

import { SearchIcon } from '@chakra-ui/icons'

//App.js dosyasından gerekli bileşenler header fonksiyon aracılığıyla alındı.
function Header({formSubmit,handleChange,searchbook}) {

 
  return (
    //gerekli tasarımlar gerçekleştirildi.
    <Box 
    width='100%'
    h='470px'
    bgImage="url('https://img1.picmix.com/output/pic/normal/9/0/0/7/9437009_b979e.gif')"  >
      <Container >
        <Center h="300px" color="red">
          <Text as='b' mt={40} fontSize="6xl">BOOK WORLD</Text>
        </Center>
        <Center>
          <form onSubmit={formSubmit}>
            <HStack >
              <FormControl >
                <Box w="600px" 
                >
                <Input 
                 size='lg'
                    bg="white"
                    value={searchbook}//
                    onChange={handleChange}
                    placeholder="Kitap ismi veya yazar ismi giriniz"
                  />
                
                </Box>
              </FormControl>
                <Button size='lg' bg='red' colorScheme="gray" type="submit">
                  <SearchIcon fontSize={25} />
                </Button>
            </HStack>
          </form>
        </Center>
      </Container>
    </Box>
  )
}

export default Header
