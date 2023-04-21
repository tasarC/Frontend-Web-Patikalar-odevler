// Gerekli modüllerini import ediyoruz
import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import './index.css';
import App from './App';
import { ChakraProvider } from '@chakra-ui/react'
import BookDetail from './components/BookDetail';

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />, // '/' yolu için App bileşenini kullanılacak
  },
  {
    path: "/book/:bookId",
    element: <BookDetail />, // '/book/:bookId' yolu için BookDetail bileşenini kullanılacak
  },
]);

// React uygulamamızın root elemanını belirledik
const root = ReactDOM.createRoot(document.getElementById('root'));

// React uygulamamızı render ediyoruz
root.render(
  <ChakraProvider>
    <RouterProvider router={router} /> {/* RouterProvider bileşenini kullanarak router yapımızı uygulamaya aktarıyoruz */}
  </ChakraProvider>
);
