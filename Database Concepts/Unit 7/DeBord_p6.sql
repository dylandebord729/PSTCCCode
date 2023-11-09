select EMP_NUM , EMP_LNAME , round(sum(ASSIGN_HOURS) , 1) as SumOfASSIGN_HOURS , 
  round(sum(ASSIGN_CHARGE) , 2) as SumOfASSIGN_CHARGE
from ASSIGNMENT natural join EMPLOYEE
group by EMP_NUM
