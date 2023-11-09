select BRAND_ID, sum(PROD_QOH) as TOTALINVENTORY
from LGPRODUCT
group by BRAND_ID
order by BRAND_ID desc
