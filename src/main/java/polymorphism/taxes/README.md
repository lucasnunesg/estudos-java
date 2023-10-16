# Exercise description

Write a program to read information about N taxpayers (provided by the user).
Each taxpayer can be an individual or a company. Individual required information: name, annual income and health
expenses. Company required information are: name, annual income and number of employees.

## Tax calculation rules
### Individual
If the annual income is below 20,000.00 then 15% tax, else 25% tax. If the taxpayer had health expenses, deduct 50% from
these expenses from the tax amount. E.G.: annual income = 50,000.00 and 2,000.00 in health expenses:  
Tax = (50,000 * 25%) - (2,000 * 50%) = 11,500.00

### Company
Companies with over 10 employees pay 14% tax and all others pay 16% tax.

## Example I/O
### Input
Enter the number of tax payers: **3**<br>
Tax payer #1 data:<br>
Individual or company (i/c)? **i**<br>
Name: **Alex**<br>
Anual income: **50000.00**<br>
Health expenditures: **2000.00**<br>
Tax payer #2 data:<br>
Individual or company (i/c)? **c**<br>
Name: **SoftTech**<br>
Anual income: **400000.00**<br>
Number of employees: **25**<br>
Tax payer #3 data:<br>
Individual or company (i/c)? **i**<br>
Name: **Bob**<br>
Anual income: **120000.00**<br>
Health expenditures: **1000.00**<br>

### Output
TAXES PAID:<br>
Alex: $ 11500.00  
SoftTech: $ 56000.00  
Bob: $ 29500.00  
<br>
TOTAL TAXES: $ 97000.00  