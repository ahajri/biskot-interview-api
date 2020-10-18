CREATE TABLE IF NOT EXISTS ITEM( ID BIGINT PRIMARY KEY,
                                 ID_CART INT,
                                 PRODUCT_LABEL VARCHAR(255),
                                 QUANTITY DOUBLE,
                                 UNIT_PRICE DOUBLE,
                                 LINE_PRICE DOUBLE
                               );

CREATE TABLE IF NOT EXISTS CART( ID BIGINT PRIMARY KEY,
                                TOTAL_PRICE DOUBLE
                              );

ALTER TABLE ITEM ADD CONSTRAINT OWNER_CART_FK
FOREIGN KEY (ID_CART)
REFERENCES CART (ID);