[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

root=7 olsun

5<7               olduğundan root'un solunda 5 bulunur.                                          
1<7 && 1<5                 olduğundan root'un solunda 1 bulunur.                                
8 > 7                      olduğundan root'un sağında 8 bulunur.                            
3<7 && 3<5 && 3>1          olduğundan root'un solunda 3 bulunur.      
6<7 && 6>5                 olduğundan root'un solunda 6 bulunur.  
0<7 && 0<5 && 0<1          olduğundan root'un solunda 0 bulunur.  
9>7 && 9>8                 olduğundan root'un sağında 9 bulunur.
4<7 && 4<5 && 4>1 && 4>3   olduğundan root'un solunda 4 bulunur.
2<7 && 2<5 && 2>1 && 2<3   olduğundan root'un solunda 2 bulunur.  


             7
          /   \     
         5      8   
       /  \      \
      1    6      9
    /  \
   0    3
       /  \
      2    4  
                    
                         
                         
                                                                       
