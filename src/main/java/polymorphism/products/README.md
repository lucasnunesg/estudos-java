# Products Exercise

Write a program to read data from "N" (provided by the user) products, and at the end show the price tag for
each product registered.

Every product has name and a price. Imported products have customs fee and used products have a manufacture date.
This specific information should be added to the price tag. For imported product, the customs fee must be added to the
final price.

## Example I/O

#### Input:
Enter the number of products: **3** <br>
Product #1 data:<br>
Common, used or imported (c/u/i)? **i** <br>
Name: **Tablet** <br>
Price: **260.00** <br>
Customs fee: 20.00 <br>
Product #2 data:<br>
Common, used or imported (c/u/i)? **c** <br>
Name: **Notebook** <br>
Price: **1100.00** <br>
Product #3 data:<br>
Common, used or imported (c/u/i)? **u** <br>
Name: **iPhone** <br>
Price: **400.00** <br>
Manufacture date (DD/MM/YYYY): 15/03/2017 <br>

#### Output:
PRICE TAGS:<br>
Tablet $ 280.00 (Customs fee $20.00)<br>
Notebook $ 1100.00<br>
iPhone (used) $ 400.00 (Manufacture date: 15/03/2017)<br>
