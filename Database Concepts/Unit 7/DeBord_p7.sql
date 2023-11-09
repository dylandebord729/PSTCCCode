select PROJ_NUM , round(sum(ASSIGN_HOURS) , 1) as SumOfASSIGN_HOURS , 
  round(sum(ASSIGN_CHARGE) , 2) as SumOfASSIGN_CHARGE
from ASSIGNMENT
group by PROJ_NUM
