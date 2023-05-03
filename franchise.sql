
-- hdofc 본사 직원 관리 시스템 테이블
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

-- 본사 직언 관리 시스템 시퀀스 생성
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
VALUES (1, '봉경준', '970207-1547855', '경기도 파주시', 20210819, '개발팀', '대리', 310, 1.5);

INSERT INTO hdofc
VALUES (2, '신현욱', '920512-1958421', '경기도 구리시', 20230216, '개발팀', '사원', 210, 0.7);

INSERT INTO hdofc
VALUES (3, '하창재', '891224-1347859', '서울특별시 구로구', 20180308, '홍보팀', '팀장', 450, 1.2);

INSERT INTO hdofc
VALUES (4, '사공선웅', '201212-1725385', '서울특별시 노원구 ', 20141012, '회계팀', '부장', 650, 1.6);

INSERT INTO hdofc
VALUES (5, '한은샘', '950428-2458745', '인천광역시 중구', 20230216, '홍보팀', '사원', 170, 0.6);

INSERT INTO hdofc
VALUES (6, '이영석', '970729-1255489', '서울특별시 도봉구', 20180514, '법무팀', '변호사', 700, 1.8);

INSERT INTO hdofc
VALUES (7, '정라온', '960601-2254876', '경기도 일산동구', 20210428, '경영팀', '대리', 280, 0.5);

INSERT INTO hdofc
VALUES (8, '조믿음', '030102-4562147', '서울특별시 서초구', 20230430, '제조팀', '사원', 200, 1.3);







