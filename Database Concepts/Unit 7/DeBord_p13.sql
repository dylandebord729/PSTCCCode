select CUS_CODE , CUS_BALANCE , round(sum(LINE_PRICE * LINE_UNITS) , 2)as "Total Purchases"
from CUSTOMER natural join INVOICE natural join LINE
group by CUS_CODE
