// Gerekli modülleri ve bileşenleri import edilir. 
import { Box, Center, Text ,Link} from '@chakra-ui/react'
import React from 'react'
import { SiLinkedin } from 'react-icons/si';
import { EmailIcon } from '@chakra-ui/icons'

function Footer() {


  return (
    //Footer arayüzü için gerekli veriler elde edilerek tasarım oluşturuldu.
        <Box mt='16%'>
            <Center>
                <Text fontSize={50} color='black'>
                    BOOK SEARCH APP
                </Text>
            </Center>
            <Center>
                <EmailIcon color='red' fontSize={50} mr={4} /><Link color='teal.900' href='https://www.google.com/intl/tr/gmail/about/' isExternal>cnntt70@gmail.com</Link>
            </Center>
            <Center >
                <SiLinkedin  color='blue' fontSize={50}/><Link ml={5} color='teal.900' href='https://tr.linkedin.com/in/cennet-ta%C5%9Far?trk=people-guest_people_search-card' isExternal> LinkedIn</Link>
            </Center>
        </Box>
        
    )
}

export default Footer
