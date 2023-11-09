update PRODUCT set P_QOH=26 where P_CODE = '13-Q2/P2';
drop trigger trg_line_prod;
create trigger trg_line_prod before insert
on LINE for each row
update PRODUCT SET P_QOH = P_QOH - NEW.LINE_UNITS
where P_CODE = NEW.P_CODE;
