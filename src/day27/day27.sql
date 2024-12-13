/*
여러줄 주석
*/
# 한줄 주석
-- 한줄 주석

# 모든 테이블 확인
show databases;

# ctrl + enter - 명령어 단위 실행
# ctrl + shift + enter - 현재 모든 sql실행

# 로컬 경로 확인
show variables like 'datadir';

# 데이터베이스 삭제
-- drop database db1;
# 데이터베이스가 존재한다면 삭제
drop database if exists db1;

# 데이터베이스 생성
create database db1;

# 사용할 데이터베이스 선택
use db1;

# 실습
drop database if exists test1;
create database test1;
show databases;
show variables like 'datadir';
use test1;

create database db1120;
use db1120;

# 테이블 생성
create table member(아이디 text, 패스워드 text, 이름 text);

# 활성화된 DB 내 테이블 목록 보기
show tables;

# 테이블 삭제
-- drop table member;
drop table if exists member;

/*
1. 테이블: 표, 릴레이션, 엔티티
2. 레코드: 튜플, 행, 가로줄
3. 필드: 속성, 열, 세로줄

	[정수]
	TINYINT	  1바이트  -128~127
    SMALLINT  2바이트 +-32768
    MEDIUMINT 3바이트 +-800만정도
    INT		  4바이트 +-21억정도
    BIGINT	  8바이트 +-21억이상
    
    [실수]
    FLOAT	  4바이트
    DOUBLE	  8바이트
    
    [문자타입으로 저장되는 숫자]
    DECIMAL
    
    [날짜/시간]
    DATE 	 날짜표현 0000-00-00
    DATETIME 날짜와 시간 표현 0000-00-00 00:00:00
    TIME	 시간 표현 00:00:00
    
    [문자열]
    CHAR(길이)   : 고정길이 최대 255글자
	VARCHAR(길이): 가변길이 최대 255글자 - 남은칸은 사용하지 않고 지움
    TEXT	    : 최대길이 65536 글자
    LONGTEXT	: 최대길이 42억 글자
    
    [논리]
    BOOL		: true/false 표현, 실제로는 0/1
*/
# 테이블 예제1 
use db1120;
create table board(content longtext, writer varchar(30), pwd varchar(30));
# 테이블의 내용물(레코드) 확인
select * from board;
drop table if exists member;
create table member(
	field1 tinyint, field2 smallint, field3 mediumint, field4 int, field5 bigint,
    field6 float, field7 double, field8 decimal,
    fleld9 date, field10 datetime, field11 time,
    field12 char(100), field13 varchar(100), field14 text, field15 longtext,
    field16 bool
);
show tables;
select * from member;

/*
제약 조건
1. not null: 해당 필드에 null을 포함하지 않음. 데이터가 누락되면 안될때
2. default 초기값: 해당 필드에 값 삽입시 비어있으면 초기값을 지정
3. unique: 중복 허용 안함
4. auto_increment: 해당 필드에 레코드 삽입 시 번호가 자동 삽입
5. primary key: 테이블의 식별 필드, 기본키-PK, 참조 당하는 키
6. foreign key: 테이블의 참조필드, 참조키-FK, 참조하는 키
7. unsigned: 부호 없음. 양수만
관례적으로 모든 테이블은 1개 이상의 PK필드를 갖는다
*/