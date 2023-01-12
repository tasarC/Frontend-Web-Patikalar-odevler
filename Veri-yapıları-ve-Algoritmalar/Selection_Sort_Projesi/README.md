[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Başlangıç:[ 22, 27, 16, 2, 18, 6 ]
key:27
1.aşama:[ 22, 27, 16, 2, 18, 6 ] // 22 < 27 
key:16
2.aşama:[ 16, 22, 27, 2, 18, 6 ] // 16 < 27 ve 16 < 22
key:2
3.aşama:[ 2, 16, 22, 27, 18, 6 ] // 2 < 27 ve 2 < 22 ve 2 < 16 
key:18
4.aşama:[ 2, 16, 18, 22, 27, 6 ] // 18 < 27 ve 18 < 22
key:6
5.aşama:[ 2, 6, 16, 18, 22, 27 ] // 6 < 27 ve 6 < 22 ve 6 < 18 ve 6 < 16 

sonuç:[ 2, 6, 16, 18, 22, 27 ]

Big-O gösterimini yazınız.

Best Case : O(n) Worst Case : O(n²) Average Case : O(n²) 

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

    Average case: Aradığımız sayının ortada olması
    Worst case: Aradığımız sayının sonda olması
    Best case: Aradığımız sayının dizinin en başında olması.
 
Aradığımız 18 değeri  dizinin sonunda olması nedeniyle worst case kapsamına girmektedir.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

0.adım:[ 7, 3, 5, 8, 2, 9, 4, 15, 6]
1.adım:[ 2, 3, 5, 8, 7, 9, 4, 15, 6]
2.adım:[ 2, 3, 5, 8, 7, 9, 4, 15, 6]
3.adım:[ 2, 3, 4, 8, 7, 9, 5, 15, 6]
4.adım:[ 2, 3, 4, 5, 7, 9, 8, 15, 6]
