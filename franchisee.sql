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
VALUES ('ZERO���̴�',2800, 'ZERO �ݶ�...', '2021/03/03', '�Ǹ� ��');


SELECT * FROM side_menu;


COMMIT;