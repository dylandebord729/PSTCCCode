select CUS_CODE , CUS_BALANCE , round(sum(LINE_PRICE * LINE_UNITS) , 2)as "Total Purchases" , count(LINE_NUMBER) as "Number of Purchases"
from CUSTOMER natural join INVOICE natural join LINE
group by CUS_CODE
