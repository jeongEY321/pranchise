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
VALUES (shop_seq.NEXTVAL, 'ȫ�浿', '02-123-4567', '010-1234-5678', '����� ���� ������ 452-68', '2021-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '��ö��', '02-465-6165', '010-7824-6231', '����� ���Ǳ� ��õ�� 622-43', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '�迵��', '02-609-4537', '010-9621-9132', '��⵵ �Ⱦ�� ����3�� 658-65', '2022-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '������', '02-650-6048', '010-6541-4653', '��⵵ ���� ���籸 ���ൿ 987-21', '2023-01-01');

INSERT INTO shop
VALUES (shop_seq.NEXTVAL, '�̱��', '02-304-9778', '010-9632-2146', '���������� ���� �л굿 651-72', '2023-01-01');

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
VALUES (hdofc_seq.NEXTVAL, '������', '970207-1547855', '��⵵ ���ֽ�', 20210819, '������', '�븮', 310, 1.5);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '������', '920512-1958421', '��⵵ ������', 20230216, '������', '���', 210, 0.7);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '��â��', '891224-1347859', '����Ư���� ���α�', 20180308, 'ȫ����', '����', 450, 1.2);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '�������', '201212-1725385', '����Ư���� ����� ', 20141012, 'ȸ����', '����', 650, 1.6);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '������', '950428-2458745', '��õ������ �߱�', 20230216, 'ȫ����', '���', 170, 0.6);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '�̿���', '970729-1255489', '����Ư���� ������', 20180514, '������', '��ȣ��', 700, 1.8);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '�����', '960601-2254876', '��⵵ �ϻ굿��', 20210428, '�濵��', '�븮', 280, 0.5);

INSERT INTO hdofc
VALUES (hdofc_seq.NEXTVAL, '������', '030102-4562147', '����Ư���� ���ʱ�', 20230430, '������', '���', 200, 1.3);

CREATE TABLE menu (
    menu_name VARCHAR2(50) PRIMARY KEY,
    menu_price NUMBER(20) NOT NULL,
    menu_explanation VARCHAR2(3000) NOT NULL,
    menu_release_date VARCHAR2(50) NOT NULL,
    menu_impst VARCHAR2(300)
);

INSERT INTO menu 
VALUES ('����ġŲ',13000, '����� ġŲ�� ����..', '2021/01/01', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('���ġŲ',13000, '���� ġŲ�� ����..', '2021/01/01', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('��Ʈ���� �Ͽ��̾� ġŲ',18000, '��Ʈ�� ġ����� ���ξ��ÿ� �޴��� ġŲ��..', '2022/03/23', '�Ǹ� ����');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('�Ķ��̵� ġŲ',12000, 'ġŲ�� �ٻ���..', '2021/01/01', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('���� ġŲ',16000, '�޴��� �ܰ� ġŲ�� ����..', '2022/12/19', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('��ȣ�� ġŲ',25000, '�̹����� ġŲ�� �ݶ�..', '2022/01/01', '���� �Ǹ�');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('���̽� ġŲ',13000, '������ �ÿ��԰� ġŲ�� ����..', '2040/01/01', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('����ġŲ',19000, '���� ������ ġŲ�� ����..', '2023/05/03', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('��ġŲ �ߴٸ�',13000, '�ߴٸ��� ���� ������� ġŲ..', '2022/08/23', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('����ġŲ',17000, '���߿� ġŲ�� ����..', '2022/12/11', '�Ǹ� ��');
INSERT INTO menu (menu_name, menu_price, menu_explanation, menu_release_date,  menu_impst)
VALUES ('������ ġŲ',9000, '������ �δ���� ��������..', '2021/07/07', '�Ǹ� ��');


CREATE TABLE side_menu (
    sidemenu_name VARCHAR2(50) PRIMARY KEY,
    sidemenu_price NUMBER(20) NOT NULL,
    sidemenu_explanation VARCHAR2(3000) NOT NULL,
    sidemenu_release_date VARCHAR2(50) NOT NULL,
    sidemenu_impst VARCHAR2(300)
);

INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('ȣ�ڰ���',3000, 'ȣ������ ������..', '2021/12/25', '���� �Ǹ�');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('���̽� ũ��',2500, '�����԰� �˵���..', '2021/08/01', '�Ǹ� ��');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('�߲��� Ƣ��',3400, '�߲����� �ٻ���..', '2021/01/01', '�Ǹ� ��');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('����',5000, '���̽�.����.ó��ó��..', '2021/01/01', '�Ǹ� ��');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('����Ƣ��',2500, '���̵��� �����ϴ� ����..', '2021/01/01', '�Ǹ� ��');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('�Ҵ� �ҽ�',500, '�Ҵ߼ҽ��� ������� ���� ������ ���..', '2021/01/01', '�Ǹ� ��');
INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('Ư���ҽ�',500, 'ġŲ�� ȯ������...', '2021/01/01', '�Ǹ� ��');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('�ݶ�',2500, 'ź���� ������...', '2021/01/01', '�Ǹ� ��');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('���̴�',2500, 'ź���� ������...', '2021/01/01', '�Ǹ� ��');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('ZERO�ݶ�',2800, 'ZERO �ݶ�...', '2021/03/03', '�Ǹ� ��');
SELECT * FROM side_menu;INSERT INTO side_menu (sidemenu_name, sidemenu_price, sidemenu_explanation, sidemenu_release_date,  sidemenu_impst)
VALUES ('ZERO���̴�',2800, 'ZERO ���̴�...', '2021/03/03', '�Ǹ� ��');





