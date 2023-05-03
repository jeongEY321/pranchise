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

select * from menu;

SELECT * FROM menu;

DROP TABLE menu;



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
VALUES ('ZERO사이다',2800, 'ZERO 콜라...', '2021/03/03', '판매 중');


SELECT * FROM side_menu;


COMMIT;