select BRAND_ID, BRAND_NAME, round(avg(PROD_PRICE), 2) as AVGPRICE
from LGBRAND natural join LGPRODUCT
group by BRAND_ID
order by BRAND_NAME
