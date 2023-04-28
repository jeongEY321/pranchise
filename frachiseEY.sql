
CREATE TABLE shop(
    shop_id NUMBER NOT NULL PRIMARY KEY,
    owner_name VARCHAR2(3000) NOT NULL,
    shop_number VARCHAR2(3000) NOT NULL,
    owner_number VARCHAR2(3000) NOT NULL,
    shop_address VARCHAR2(3000) NOT NULL,
    shop_open_date VARCHAR2(3000)
);

CREATE SEQUENCE shop_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

    
CREATE TABLE sales21 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

CREATE TABLE sales22 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

CREATE TABLE sales23 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '홍길동', '02-123-4567', '010-1234-5678', '서울시 은평구 갈현동 452-68 ', '2021-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김철수', '02-465-6165', '010-7824-6231', '서울시 관악구 봉천동 622-43 ', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김영희', '02-609-4537', '010-9621-9132', '경기도 안양시 비전3동 658-65 ', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '옥동자', '02-650-6048', '010-6541-4653', '서울시 ', '2023-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '이길순', '02-304-9778', '010-9632-2146', '서울시 ', '2023-01-01');



SELECT * FROM shop;

CREATE TABLE shop(
    shop_id NUMBER NOT NULL PRIMARY KEY,
    owner_name VARCHAR2(3000) NOT NULL,
    shop_number VARCHAR2(3000) NOT NULL,
    owner_number VARCHAR2(3000) NOT NULL,
    shop_address VARCHAR2(3000) NOT NULL,
    shop_open_date VARCHAR2(3000)
);

CREATE SEQUENCE shop_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

    
CREATE TABLE sales21 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

CREATE TABLE sales22 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

CREATE TABLE sales23 (
    shop_id NUMBER PRIMARY KEY,
    january  NUMBER DEFAULT 0,
    february NUMBER DEFAULT 0,
    march NUMBER DEFAULT 0,
    april NUMBER DEFAULT 0,
    may NUMBER DEFAULT 0,
    june NUMBER DEFAULT 0,
    july NUMBER DEFAULT 0,
    august NUMBER DEFAULT 0,
    september NUMBER DEFAULT 0,
    october NUMBER DEFAULT 0,
    november NUMBER DEFAULT 0,
    december NUMBER DEFAULT 0
);

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '홍길동', '02-123-4567', '010-1234-5678', '서울시 은평구 갈현동 452-68', '2021-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김철수', '02-465-6165', '010-7824-6231', '서울시 관악구 봉천동 622-43', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김영희', '02-609-4537', '010-9621-9132', '경기도 안양시 비전3동 658-65', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '옥동자', '02-650-6048', '010-6541-4653', '경기도 고양시 덕양구 지축동 987-21', '2023-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '이길순', '02-304-9778', '010-9632-2146', '서울시 ', '2023-01-01');



SELECT * FROM shop WHERE shop_address LIKE '%서울%';



INSERT INTO sales21
VALUES (1, 5000, 6000, 8000, 5000, 9000, 10000, 5600, 6700, 8000, 9000, 1000, 6000);

SELECT * FROM sales21 WHERE shop_id = 1;
