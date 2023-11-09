CREATE PROCEDURE PRC_INV_AMOUNTS (W_INV_NUM IN NUMBER) AS
  W_INV_TOTAL NUMBER :=0;
BEGIN
  SELECT SUM(LINE_TOTAL) INTO W_INV_TOTAL 
  FROM LINE where INV_NUMBER = INV_NUM;
  UPDATE INVOICE SET INV_SUBTOTAL = W_INV_TOTAL, INV_TAX = W_INV_TOTAL * 0.8, INV_TOTAL = W_INV_TOTAL * 1.08
  where INV_NUMBER = W_INV_NUM;
END