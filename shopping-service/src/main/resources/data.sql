INSERT INTO tbl_invoices (id, number_invoice, description, customer_id, create_at, state) 
VALUES(1, '0001', 'invoice office items', 1, NOW(),'Created')
ON DUPLICATE KEY UPDATE state='Created';

INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price ) 
VALUES(1, 1 , 1, 178.89)
ON DUPLICATE KEY UPDATE quantity=1, price=178.89;
INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price)  
VALUES(1, 2 , 2, 12.5)
ON DUPLICATE KEY UPDATE quantity=2, price=12.5;
INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price)  
VALUES(1, 3 , 1, 40.06)
ON DUPLICATE KEY UPDATE quantity=1, price=40.06;