select EMP_FNAME, EMP_LNAME, EMP_EMAIL
from LGEMPLOYEE
where EMP_HIREDATE >= "2005-01-01" and EMP_HIREDATE <= "2014-12-31"
order by EMP_LNAME, EMP_FNAME
