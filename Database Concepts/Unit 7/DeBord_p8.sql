select round(sum(ASSIGN_HOURS) , 1) as SumOfSumOfASSIGN_HOURS , 
  round(sum(ASSIGN_CHARGE) , 2) as SumOfSumOfASSIGN_CHARGE
from ASSIGNMENT
