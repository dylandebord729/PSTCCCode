select INV_NUMBER , round(sum(LINE_UNITS * LINE_PRICE) , 2)as "Invoice Total"
from  INVOICE natural join LINE
group by INV_NUMBER
