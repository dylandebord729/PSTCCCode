select PROD_CATEGORY, count(*) as NUMPRODUCTS
from LGPRODUCT
where PROD_BASE = "Water"
group by PROD_CATEGORY
order by PROD_CATEGORY
