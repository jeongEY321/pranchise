DROP TABLE shop;
DROP SEQUENCE shop_seq;
DROP TABLE sales21;
DROP TABLE sales22;
DROP TABLE sales23;
DROP SEQUENCE sales21_seq;
DROP SEQUENCE sales22_seq;
DROP SEQUENCE sales23_seq;
DROP TABLE hdofc;
DROP SEQUENCE hdofc_seq;
DROP TABLE menu;
DROP TABLE side_menu;

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

CREATE SEQUENCE sales21_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

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

CREATE SEQUENCE sales22_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

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

CREATE SEQUENCE sales23_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '홍길동', '02-123-4567', '010-1234-5678', '서울시 은평구 갈현동 452-68', '2021-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김철수', '02-465-6165', '010-7824-6231', '서울시 관악구 봉천동 622-43', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '김영희', '02-609-4537', '010-9621-9132', '경기도 안양시 비전3동 658-65', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '옥동자', '02-650-6048', '010-6541-4653', '경기도 고양시 덕양구 지축동 987-21', '2023-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '이길순', '02-304-9778', '010-9632-2146', '대전광역시 서구 둔산동 651-72', '2023-01-01');

INSERT INTO sales21
VALUES (sales21_seq.NEXTVAL, 7000, 6000, 5000, 5500, 6500, 6000, 5500, 6000, 7500, 6000, 5500, 7000);

INSERT INTO sales22
VALUES (sales22_seq.NEXTVAL, 7500, 6000, 5500, 6000, 7000, 6500, 7000, 7500, 8000, 8500, 85000, 8000);

INSERT INTO sales22
VALUES (sales22_seq.NEXTVAL, 0, 6000, 6800, 7000, 6500, 7500, 6000, 6500, 5000, 7000, 6500, 7000);

INSERT INTO sales22
VALUES (sales22_seq.NEXTVAL, 0, 0, 0, 0, 0, 0, 0, 7000, 8000, 6000, 6500, 7500);

INSERT INTO sales23
VALUES (sales23_seq.NEXTVAL, 5500, 6000, 6500, 7000, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO sales23
VALUES (sales23_seq.NEXTVAL, 5000, 6000, 8000, 5000, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO sales23
VALUES (sales23_seq.NEXTVAL, 5500, 6000, 6500, 7000, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO sales23
VALUES (sales23_seq.NEXTVAL, 0, 5500, 6000, 6100, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO sales23
VALUES (sales23_seq.NEXTVAL, 0, 0, 0, 5000, 0, 0, 0, 0, 0, 0, 0, 0);

CREATE TABLE hdofc (
    hdofc_id VARCHAR2(15) PRIMARY KEY,
    hdofc_name VARCHAR2(20)NOT NULL,
    hdofc_rrnum VARCHAR2(30)NOT NULL,
    hdofc_address VARCHAR2(30)NOT NULL,
    hdofc_hire_date NUMBER(20) NOT NULL,
    hdofc_team VARCHAR2(10)NOT NULL,
    hdofc_position VARCHAR2(10)NOT NULL,
    hdofc_salary NUMBER(10) NOT NULL,
    hdofc_bonus NUMBER(10,2) DEFAULT 0
);


CREATE SEQUENCE hdofc_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 1000000
    NOCYCLE
    NOCACHE;


INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '봉경준', '970207-1547855', '경기도 파주시', 20210819, '개발팀', '대리', 310, 1.5);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '신현욱', '920512-1958421', '경기도 구리시', 20230216, '개발팀', '사원', 210, 0.7);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '하창재', '891224-1347859', '서울특별시 구로구', 20180308, '홍보팀', '팀장', 450, 1.2);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '사공선웅', '201212-1725385', '서울특별시 노원구 ', 20141012, '회계팀', '부장', 650, 1.6);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '한은샘', '950428-2458745', '인천광역시 중구', 20230216, '홍보팀', '사원', 170, 0.6);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '이영석', '970729-1255489', '서울특별시 도봉구', 20180514, '법무팀', '변호사', 700, 1.8);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '정라온', '960601-2254876', '경기도 일산동구', 20210428, '경영팀', '대리', 280, 0.5);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '조믿음', '030102-4562147', '서울특별시 서초구', 20230430, '제조팀', '사원', 200, 1.3);

CREATE TABLE menu (
    menu_name VARCHAR2(50) PRIMARY KEY,
    menu_price NUMBER(20) NOT NULL,
    menu_explanation VARCHAR2(3000) NOT NULL,
    menu_release_date VARCHAR2(50) NOT NULL,
    menu_impst VARCHAR2(300)
);

INSERT INTO menu 
VALUES ('간장치킨',13000, '간장과 치킨에 만남..', '2021/01/01', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('양념치킨',13000, '양념과 치킨에 만남..', '2021/01/01', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('민트초코 하와이안 치킨',18000, '민트의 치약맛과 파인애플에 달달한 치킨에..', '2022/03/23', '판매 종료');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('후라이드 치킨',12000, '치킨에 바삭함..', '2021/01/01', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('벌꿀 치킨',16000, '달달한 꿀과 치킨에 만남..', '2022/12/19', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('신호등 치킨',25000, '이무진과 치킨의 콜라보..', '2022/01/01', '한정 판매');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('아이스 치킨',13000, '얼음에 시원함과 치킨에 만남..', '2040/01/01', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('꼬막치킨',19000, '벌교 꼬막과 치킨에 만남..', '2023/05/03', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('왕치킨 닭다리',13000, '닭다리를 위해 만들어진 치킨..', '2022/08/23', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('고추치킨',17000, '고추와 치킨에 만남..', '2022/12/11', '판매 중');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('갓성비 치킨',9000, '누구나 부담없는 가격으로..', '2021/07/07', '판매 중');


CREATE TABLE side_menu (
    sidemenu_name VARCHAR2(50) PRIMARY KEY,
    sidemenu_price NUMBER(20) NOT NULL,
    sidemenu_explanation VARCHAR2(3000) NOT NULL,
    sidemenu_release_date VARCHAR2(50) NOT NULL,
    sidemenu_impst VARCHAR2(300)
);

INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('호박고구마',3000, '호구마에 달콤함..', '2021/12/25', '한정 판매');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('아이스 크림',2500, '달콤함과 쫀득함..', '2021/08/01', '판매 중');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('닭껍질 튀김',3400, '닭껍질의 바삭함..', '2021/01/01', '판매 중');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('소주',5000, '참이슬.진로.처음처럼..', '2021/01/01', '판매 중');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('감자튀김',2500, '아이들이 좋아하는 감자..', '2021/01/01', '판매 중');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('불닭 소스',500, '불닭소스를 기반으로 만든 매콤한 양념..', '2021/01/01', '판매 중');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('특제소스',500, '치킨과 환상적인...', '2021/01/01', '판매 중');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('콜라',2500, '탄산이 가득한...', '2021/01/01', '판매 중');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('사이다',2500, '탄산이 가득한...', '2021/01/01', '판매 중');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('ZERO콜라',2800, 'ZERO 콜라...', '2021/03/03', '판매 중');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('ZERO사이다',2800, 'ZERO 사이다...', '2021/03/03', '판매 중');





