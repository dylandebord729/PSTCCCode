select CUS_CODE , INV_NUMBER , round(sum(LINE_UNITS * LINE_PRICE) , 2)as "Invoice Total"
from  CUSTOMER natural join INVOICE natural join LINE
group by INV_NUMBER
order by CUS_CODE , INV_NUMBER
