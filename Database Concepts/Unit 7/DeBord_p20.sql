select CUS_CODE , CUS_BALANCE
from CUSTOMER natural join INVOICE
group by CUS_CODE
