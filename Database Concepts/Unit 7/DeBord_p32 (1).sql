select CUST_FNAME, CUST_LNAME, CUST_STREET, CUST_CITY, CUST_STATE, 
  CUST_ZIP
from LGCUSTOMER natural join LGINVOICE natural join LGLINE
where INV_DATE >= "2017-07-15" and INV_DATE <= "2017-07-31"
  and PROD_SKU in (select PROD_SKU from LGPRODUCT natural join LGBRAND where BRAND_NAME = "Foresters Best" and PROD_CATEGORY = "top coat")
/*group by CUST_STATE, CUST_LNAME, CUST_FNAME*/
order by CUST_STATE, CUST_LNAME, CUST_FNAME
