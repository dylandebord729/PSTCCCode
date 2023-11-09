create trigger trg_line_total before insert
on LINE
for each row set new.LINE_TOTAL = new.LINE_UNITS * new.LINE_PRICE
