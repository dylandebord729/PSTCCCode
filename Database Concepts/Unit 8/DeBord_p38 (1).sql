create procedure UPD_CHARTER as 
begin
update CHARTER set CHAR_WAIT_CHG = MOD_WAIT_CHG 
where MOD_CODE = 'C-90A';
end
