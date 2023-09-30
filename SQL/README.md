
 # SQL Eğitim Patika 

<br>
 - **SQL Ödev 01 | WHERE ve Karşılaştırma & Mantıksal Operatörler  - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-01--where-ve-kar%C5%9F%C4%B1la%C5%9Ft%C4%B1rma--mant%C4%B1ksal-operat%C3%B6rler">WHERE ve Karşılaştırma & Mantıksal </a>**
 <br>
 - **SQL Ödev 02 | BETWEEN ve IN -<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-02--between-ve-in">  BETWEEN ve IN </a>**
 <br>
 - **SQL Ödev 03 |  LIKE ve ILIKE - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-03--like-ve-ilike">   LIKE ve ILIKE </a>**
 <br>
 - **SQL Ödev 04 | DISTINCT ve COUNT -<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-04--distinct-ve-count">  DISTINCT ve COUNT</a>**
 <br>
 - **SQL Ödev 05 | ORDER BY ve LIMIT/OFFSET - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-05--order-by-ve-limitoffset">  ORDER BY ve LIMIT/OFFSET </a> **
  <br>
 - **SQL Ödev 06 | Aggregate Fonksiyonlar - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-06--aggregate-fonksiyonlar"> Aggregate Fonksiyonlar </a> **
  <br>
 - **SQL Ödev 07 | GROUP BY HAVING - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-07--group-by-having"> GROUP BY HAVING </a> **
  <br>
 - **SQL Ödev 08 | UPDATE and DELETE  - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-08--update-and-delete"> UPDATE and DELETE </a> **
   <br>
 - **SQL Ödev 9 | INNER JOIN  - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-09--inner-join"> INNER JOIN </a> **
    <br>
 - **SQL Ödev 10 | LEFT/RIGHT/FULL JOIN  - <a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-%C3%B6dev-09--inner-join"> INNER JOIN </a> **
<br>


## SQL Ödev 01 | WHERE ve Karşılaştırma & Mantıksal Operatörler 

<br>
<br>
<br>

1-) film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

```

SELECT title, description FROM film;

```


<br>
<br>
<br>

2-) film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.

```

SELECT * FROM film
WHERE length > 60 AND length < 75;

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

3-)  film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.


```

SELECT * FROM film
WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;

```



<br>
<br>
<br>

4-) customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?

```

SELECT last_name FROM customer
WHERE first_name = 'Mary';

```



<br>
<br>
<br>

5-) film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.
```

SELECT * FROM film
WHERE NOT length > 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 02 | BETWEEN ve IN

<br>
<br>    
<br>

1-) film tablosunda bulunan tüm sütunlardaki verileri replacement cost değeri 12.99 dan büyük eşit ve 16.99 küçük olma koşuluyla sıralayınız ( BETWEEN - AND yapısını kullanınız.)
```

SELECT * FROM film 
WHERE replacement_cost BETWEEN 12.99 AND 16.99;

```



<br> 
<br>
<br>

2-)actor tablosunda bulunan first_name ve last_name sütunlardaki verileri first_name 'Penelope' veya 'Nick' veya 'Ed' değerleri olması koşuluyla sıralayınız. ( IN operatörünü kullanınız.)
```

SELECT first_name, last_name FROM actor 
WHERE first_name IN ('Penelope', 'Nick', 'Ed');

```


<br>
<br>
<br>

3-)film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99, 2.99, 4.99 VE replacement_cost 12.99, 15.99, 28.99 olma koşullarıyla sıralayınız. ( IN operatörünü kullanınız.)

```

SELECT *
FROM film
WHERE rental_rate IN (0.99, 2.99, 4.99)
AND replacement_cost IN (12.99, 15.99, 28.99);

```


<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 03 | LIKE ve ILIKE

<br>
<br>
<br>

1-) country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
```

SELECT country FROM country
WHERE country_name LIKE 'A%a' OR country_name ILIKE 'A%a';
 

```



<br>
<br>
<br>

2-) country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.
```

SELECT country FROM country
WHERE length(country_name) >= 6 AND (country_name LIKE '%n' OR country_name ILIKE '%n');


```


<br>
<br>
<br>

3-) film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.
```

SELECT title FROM film
WHERE title ILIKE '%T%T%T%T%';


```


<br>
<br>
<br>

4-) film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.
```

SELECT * FROM film 
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99; 

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 04 | DISTINCT ve COUNT

<br>
<br>
<br>

1-) film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
```

SELECT DISTINCT replacement_cost FROM film

```


<br>
<br>
<br>

2-) film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
```

SELECT COUNT (DISTINCT replacement_cost) FROM film

```


<br>
<br>
<br>

3-) film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
```

SELECT COUNT(*) FROM film 
WHERE title LIKE 'T%' AND rating = 'G';

```

<br>
<br>
<br>



4-) country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?

```

SELECT COUNT(*) FROM Country
WHERE country_name LIKE '_____'; 


```

<br>
<br>
<br>

5-) city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
```

SELECT COUNT(city) FROM city 
WHERE city ILIKE '%R'

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 05 | ORDER BY ve LIMIT/OFFSET

<br>
<br>
<br>

1-) film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.
```
SELLECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length DSC
LIMIT 5;

```

<br>
<br>
<br>

2-) film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız.
```
SELECT title, length
FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
OFFSET 1
LIMIT 5;

```

<br>
<br>
<br>

3-) customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.
```
SELECT last_name
FROM customer
WHERE store_id = 1 
ORDER BY last_name DSC
LIMIT 4;

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 06 | Aggregate Fonksiyonlar

<br>
<br>
<br>

1-) film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?

```
SELLECT AVG(rental_rate) FROM film;

```

<br>
<br>
<br>

2-) film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?

```
SELLECT COUNT(*)
FROM film
WHERE film LIKE 'C%'
;

```

<br>
<br>
<br>

3-) film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?

```
SELLECT MAX(length)
FROM film
WHERE rental_rate = 0.99;
;

```

<br>
<br>
<br>

4-) film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?

```
SELLECT COUNT(DISTINCT replament_cost)
FROM film
WHERE length > 150;
;

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 07 | GROUP BY HAVING

<br>
<br>
<br>

1-) film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.

```
SELLECT rating FROM film
GROUP BY rating ;

```

<br>
<br>
<br>

2-) film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.

```
SELLECT replacement_cost,COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) >50 ;

```

<br>
<br>
<br>

3-) customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir? 

```
SELLECT story_id, COUNT(*) FROM customer
GROUP BY story_id;

```

<br>
<br>
<br>

4-) 4. city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.

```
SELLECT country_id ,COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DSC
LIMIT 1;

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 08 | UPDATE and DELETE

<br>
<br>
<br>

1-) test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

```
CREATE TABLE employee (
id(INTEGER),
name VARCHAR(50),
birthday DATE,
email VARCHAR(100)
);

```

<br>
<br>
<br>

2-) Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```
insert into employee (id, first_name, birthday , email) values (1, 'Riane', '2023-01-23', 'rpetruska0@fc2.com');
insert into employee (id, first_name, birthday , email) values (2, 'Chantal', '2023-04-01', 'cmoss1@joomla.org');
insert into employee (id, first_name, birthday , email) values (3, 'Donnie', '2023-02-24', 'drandlesome2@ibm.com');
insert into employee (id, first_name, birthday , email) values (4, 'Lilla', '2023-07-07', 'lauton3@techcrunch.com');
insert into employee (id, first_name, birthday , email) values (5, 'Krista', '2023-04-25', 'kguiness4@opera.com');
insert into employee (id, first_name, birthday , email) values (6, 'Shay', '2022-12-24', null);
insert into employee (id, first_name, birthday , email) values (7, 'Putnam', '2022-10-28', 'pkremer6@bandcamp.com');
insert into employee (id, first_name, birthday , email) values (8, 'Wallis', '2023-01-03', 'wtoping7@ask.com');
insert into employee (id, first_name, birthday , email) values (9, 'Chucho', '2022-11-24', null);
insert into employee (id, first_name, birthday , email) values (10, 'Lorettalorna', '2022-11-26', 'lheditch9@tiny.cc');
insert into employee (id, first_name, birthday , email) values (11, 'Byron', '2023-08-22', 'btoffanoa@nymag.com');
insert into employee (id, first_name, birthday , email) values (12, 'Kirstyn', '2023-09-15', 'kzealanderb@friendfeed.com');
insert into employee (id, first_name, birthday , email) values (13, 'Gothart', '2023-04-23', 'gbattersbyc@cdc.gov');
insert into employee (id, first_name, birthday , email) values (14, 'Rici', '2022-12-15', null);
insert into employee (id, first_name, birthday , email) values (15, 'Prudy', '2023-08-03', 'pbartellie@answers.com');
insert into employee (id, first_name, birthday , email) values (16, 'Halette', '2023-05-13', 'hrignoldf@w3.org');
insert into employee (id, first_name, birthday , email) values (17, 'Gherardo', '2022-10-20', 'gbluschkeg@earthlink.net');
insert into employee (id, first_name, birthday , email) values (18, 'Byrann', '2022-10-24', 'bsecretth@uiuc.edu');
insert into employee (id, first_name, birthday , email) values (19, 'Darill', '2023-09-10', 'dhebbornei@macromedia.com');
insert into employee (id, first_name, birthday , email) values (20, 'Grenville', '2023-04-03', 'gbyartj@amazon.com');
insert into employee (id, first_name, birthday , email) values (21, 'Debi', '2023-05-19', 'dbeadek@pinterest.com');
insert into employee (id, first_name, birthday , email) values (22, 'Griffie', '2022-11-04', 'gbonehilll@ning.com');
insert into employee (id, first_name, birthday , email) values (23, 'Dolli', '2023-02-20', 'daizikovm@spiegel.de');
insert into employee (id, first_name, birthday , email) values (24, 'Pierre', '2022-11-30', 'pvolettn@ucoz.com');
insert into employee (id, first_name, birthday , email) values (25, 'Genevieve', '2023-09-19', 'gfeehilyo@ameblo.jp');
insert into employee (id, first_name, birthday , email) values (26, 'Lezlie', '2022-10-28', 'lcorssp@stumbleupon.com');
insert into employee (id, first_name, birthday , email) values (27, 'Valery', '2022-12-31', 'vburtwistleq@biblegateway.com');
insert into employee (id, first_name, birthday , email) values (28, 'Blakelee', '2022-10-11', 'bivanetsr@shareasale.com');
insert into employee (id, first_name, birthday , email) values (29, 'Eberhard', '2022-10-20', 'eladdss@github.com');
insert into employee (id, first_name, birthday , email) values (30, 'Gabi', '2023-02-19', 'ghartillt@wordpress.org');
insert into employee (id, first_name, birthday , email) values (31, 'Jacklyn', '2023-02-25', 'jsambiedgeu@histats.com');
insert into employee (id, first_name, birthday , email) values (32, 'Keene', '2023-04-30', 'kparrisv@acquirethisname.com');
insert into employee (id, first_name, birthday , email) values (33, 'Jarrad', '2022-12-01', 'jjuszczykw@dailymail.co.uk');
insert into employee (id, first_name, birthday , email) values (34, 'Lena', '2023-02-25', 'lprisex@mapy.cz');
insert into employee (id, first_name, birthday , email) values (35, 'Arleen', '2023-06-16', null);
insert into employee (id, first_name, birthday , email) values (36, 'Desdemona', '2022-12-26', null);
insert into employee (id, first_name, birthday , email) values (37, 'Sasha', '2023-09-23', 'sfurbank10@godaddy.com');
insert into employee (id, first_name, birthday , email) values (38, 'May', '2022-11-08', 'mmccallion11@jimdo.com');
insert into employee (id, first_name, birthday , email) values (39, 'Renato', '2023-03-03', 'rpail12@jalbum.net');
insert into employee (id, first_name, birthday , email) values (40, 'Harry', '2023-04-03', 'htregona13@seattletimes.com');
insert into employee (id, first_name, birthday , email) values (41, 'Elvyn', '2023-06-11', 'ejordon14@homestead.com');
insert into employee (id, first_name, birthday , email) values (42, 'Aridatha', '2023-03-25', null);
insert into employee (id, first_name, birthday , email) values (43, 'Barbette', '2023-01-03', 'bhoxey16@merriam-webster.com');
insert into employee (id, first_name, birthday , email) values (44, 'Ynes', '2022-12-15', 'yfrith17@stanford.edu');
insert into employee (id, first_name, birthday , email) values (45, 'Gabie', '2023-04-28', 'gdurnill18@unicef.org');
insert into employee (id, first_name, birthday , email) values (46, 'Hamilton', '2023-06-22', 'hgillfillan19@cafepress.com');
insert into employee (id, first_name, birthday , email) values (47, 'Jessie', '2023-03-26', 'jmineghelli1a@netscape.com');
insert into employee (id, first_name, birthday , email) values (48, 'Cirstoforo', '2023-08-23', 'cotter1b@chicagotribune.com');
insert into employee (id, first_name, birthday , email) values (49, 'Phoebe', '2023-02-02', 'pcocking1c@guardian.co.uk');
insert into employee (id, first_name, birthday , email) values (50, 'Alvie', '2023-06-26', 'asquibb1d@google.pl');
```

<br>
<br>
<br>

3-) Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```

UPDATE employee 
SET name = 'Rana',
    birthday = '1997-08-09',
    email = 'ranadhs@gmail.com'
WHERE id =2

UPDATE employee
set name = 'Deniz',
where first_name = Renato;

UPDATE employee
SET email = 'ahmet34@gmail.com'
WHERE id = 50;

UPDATE employee
SET  birthday = '2002-06-15',
WHERE birthday = '2023-04-28',

UPDATE employee
SET name = 'Duru',
    birthday = '1999-11-07',
    email = 'durudfh@gmail.com'
WHERE id = 36

```

<br>
<br>
<br>

4-) Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```

DELETE FROM employee
WHERE first_name IN(Barbette,Jacklyn,Lena,Griffie,Gothart)

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>


## SQL Ödev 09 | INNER JOIN

1-) city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT city , country FROM city
INNER JOIN country ON city.country_id = country.country_id;

```

<br>
<br>
<br>

2-) customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT payment_id, first_name, last_name FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

```

<br>
<br>
<br>

3-)customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT rental_id, first_name, last_name FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id;

```

<br>
<br>
<br>

<a href="https://github.com/tasarC/Frontend-Web-Patikalar-odevler/blob/main/SQL/README.md#sql-e%C4%9Fitim-patika">Ana menü</a>

## SQL Ödev 10 | LEFT/RIGHT/FULL JOIN 

1-) city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
```
SELECT city,country
FROM city
LEFT JOIN country ON city.country_id = country.country_id;

```

<br>
<br>
<br>

2-) customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

```
SELECT payment_id,first_name, last_name
FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

```

<br>
<br>
<br>

3-) customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

```
SELECT  rental_id,first_name, last_name
FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id;

```

<br>
<br>
<br>
