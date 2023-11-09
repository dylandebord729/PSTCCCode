select CUS_CODE , INV_NUMBER , P_DESCRIPT , LINE_UNITS as "Units Bought" , LINE_PRICE as "Unit Price" , round (LINE_UNITS * LINE_PRICE, 2) as "Subtotal"
from INVOICE natural join LINE natural join PRODUCT
order by CUS_CODE , INV_NUMBER , P_DESCRIPT
