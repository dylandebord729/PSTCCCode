select CUS_CODE , count(distinct INV_NUMBER) as "Number of Invoices" , round(sum(LINE_UNITS * LINE_PRICE) , 2)as "Total Customer Purchases"
from INVOICE natural join LINE
group by CUS_CODE
order by CUS_CODE
