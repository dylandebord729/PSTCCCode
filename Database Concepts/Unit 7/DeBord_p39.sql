select DEPT_NUM, max(EMP_HIREDATE)as MOSTRECENT
from LGEMPLOYEE
group by DEPT_NUM
order by DEPT_NUM
