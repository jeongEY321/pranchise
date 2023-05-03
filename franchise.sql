
-- hdofc ���� ���� ���� �ý��� ���̺�
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

-- ���� ���� ���� �ý��� ������ ����
CREATE SEQUENCE hdofc_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 1000000
    NOCYCLE
    NOCACHE;

SELECT * FROM hdofc;    

COMMIT;
DROP TABLE hdofc;
DROP SEQUENCE hdofc_seq;

INSERT INTO hdofc
VALUES (1, '������', '970207-1547855', '��⵵ ���ֽ�', 20210819, '������', '�븮', 310, 1.5);

INSERT INTO hdofc
VALUES (2, '������', '920512-1958421', '��⵵ ������', 20230216, '������', '���', 210, 0.7);

INSERT INTO hdofc
VALUES (3, '��â��', '891224-1347859', '����Ư���� ���α�', 20180308, 'ȫ����', '����', 450, 1.2);

INSERT INTO hdofc
VALUES (4, '�������', '201212-1725385', '����Ư���� ����� ', 20141012, 'ȸ����', '����', 650, 1.6);

INSERT INTO hdofc
VALUES (5, '������', '950428-2458745', '��õ������ �߱�', 20230216, 'ȫ����', '���', 170, 0.6);

INSERT INTO hdofc
VALUES (6, '�̿���', '970729-1255489', '����Ư���� ������', 20180514, '������', '��ȣ��', 700, 1.8);

INSERT INTO hdofc
VALUES (7, '�����', '960601-2254876', '��⵵ �ϻ굿��', 20210428, '�濵��', '�븮', 280, 0.5);

INSERT INTO hdofc
VALUES (8, '������', '030102-4562147', '����Ư���� ���ʱ�', 20230430, '������', '���', 200, 1.3);







