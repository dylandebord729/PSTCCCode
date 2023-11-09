select count(distinct INV_NUMBER) as "Total Invoices" , round(sum(LINE_UNITS * LINE_PRICE) , 2)as "Total Sales" , round(min(LINE_UNITS * LINE_PRICE) , 2) as "Minimum Customer Purchases" , round(max(LINE_UNITS * LINE_PRICE) , 2) as "Largest Customer Purchases" , round(avg(LINE_UNITS * LINE_PRICE) , 2) as "Average Customer Purchases"
from LINE

