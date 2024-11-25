SELECT * from emp;
desc emp;
select * from dept;
desc dept;
select * from salgrade;
desc salgrade;
select empno,ename,deptno
from emp;

select job
from emp;


select 
    distinct deptno
from emp;


select 
    distinct job 
from emp;

/* 범위주석
*/ 
-- 한굴주석

select 
    distinct job, deptno
from emp;

select 
    ename, 
    sal, 
    sal*12+comm, 
    comm
from emp;

select 
    ename, 
    sal, 
    sal*12+comm as 연봉, 
    comm
from emp;

select 
    ename, 
    sal, 
    sal*12+comm  "올해 연봉", 
    comm
from emp;

SELECT * from emp
order by sal asc; // 높은순올림


SELECT * from emp
order by sal desc; //높은순내림

SELECT * from emp
order by 
    ename;

SELECT * 
from emp
order by 
    empno desc ,job, sal asc;
    
-- Q2    
SELECT 
    DISTINCT job
from emp;

--Q3
SELECT 
    empno as employee_no,
    ename as employee_name,
    mgr as manager,
    sal as salary,
    comm as commission,
    deptno as department_no 
from emp
    order by department_no desc, employee_name asc;
    
select *
from emp
    where deptno >= 20;
    
select *
from emp
    where empno = 7782;

select *
from emp
    where deptno = 30 
    AND job = 'SALESMAN' ;

select *
from emp
    where deptno = 30 
    OR job = 'CLERK' ; 
    
SELECT *
FROM EMP
WHERE EMPNO = 7499
AND DEPTNO = 30;

SELECT *
FROM EMP
WHERE DEPTNO = 20
OR JOB = 'SALESMAN';

SELECT *
FROM EMP
WHERE DEPTNO = 20;

SELECT * FROM EMP
WHERE 
    ENAME = 'WARD'
    OR JOB = 'CLERK'
    OR DEPTNO = 20;
    
SELECT * FROM EMP
WHERE 
    ENAME = 'WARD'
    or JOB = 'CLERK'
    and DEPTNO = 20;

SELECT * FROM EMP
WHERE not 0 = 1;
    
select * from emp
where sal <= 2000;

select * from emp
where sal >= 2500
and job = 'ANALYST';


select * from emp
where 
    sal != 3000;

select * from emp
where
     sal <> 3000;

select * from emp
where
    sal ^= 3000;
    
--문제1.부서번호가 20이 아닌 목록
select * from emp
where
    deptno != 20;

--문제2.부서번호가 20도 아니고 10도 아닌 목록
select * from emp
where
    deptno != 20 and deptno != 10;

--문제3.부서번호가 30이면서 봉급 2000 이하

select * from emp
where
    deptno = 30 and sal <= 2000;

select * from emp
where
    not sal = 3000;
 
 select * from emp
where
     sal < 2000 or sal >=3000 ;
     
 select * from emp
where
    not (sal >= 2000 and sal < 3000) ;     
    
select * from emp
where 
    job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where 
    job not IN ('MANAGER','SALESMAN','CLERK');

select * from emp
where 
    not (job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK');

select * from emp
where 
    sal >= 2000 and sal <= 3000;
    
select * from emp
where 
    deptno IN (10,20);
    
 select * from emp
where 
    deptno not IN (10,20);
    
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000
order by sal desc;

select * from emp
where ename like '%ER%';

select * from emp
where ename like '_L%';

select * from emp
where HIREDATE like '__/1%'
AND SAL >= 2000
OR JOB = 'CLERK';

select * from emp
where HIREDATE like '__/02%';

select * from emp
where
    ename not like '%AM%';

select * from SEOM
where
    ename not like '%AM%';
    
select * from emp
    where comm <= 400;

select * from emp
    where comm is null
        order by comm desc;
        
select comm, comm + 10 from emp
    where comm is not null
        order by comm desc;
        
select * from emp
where mgr is null;


 select * from emp
where 
    deptno = 10
union
 select * from emp
where 
    deptno = 20;
    
--
select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal
from emp
where deptno = 20;

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 20;

--타입이 달라서 오류
select ename, empno, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 20;

--타입만 맞으면 오료가 뜨지않는다
select empno, ename, sal, deptno
from emp
where deptno = 10
union
select sal, ename, sal, deptno
from emp
where deptno = 20;

--유니온을 사용하면 중복된 값을 제거 
select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 10;

--유니온올 은 중복에 관계없이 모든줄 표시 
select empno, ename, sal, deptno
from emp
where deptno = 10
union all
select empno, ename, sal, deptno
from emp
where deptno = 10;

--Q1 
select * from emp
where 
    ename like '%S';

--Q2    
select empno, ename, job, sal, deptno from emp
where
    deptno = 30 and job = 'SALESMAN';

--Q3   
select empno, ename, job, sal, deptno
from emp
where
    deptno between 20 and 30 and sal > 2000 ; 
--deptno in (20,30) and sal > 2000; 방식 두번째 선호
--Q3: union all
select empno, ename, job, sal, deptno
from emp
where
    sal > 2000
    and deptno = 20
union all
select empno, ename, job, sal, deptno
from emp
where
    sal > 2000
    and deptno = 30;

--Q4
select * from emp
where 
    not (sal >= 2000 and sal <= 3000);
-- 정답은 똑같음 not (2000 <= sal and 3000 >= sal)
-- 또는 2000 > sal or 3000 < sal 

--Q5
select ename, empno, sal, deptno from emp
where 
    ename like '%E%' and deptno = 30
    and sal not between 1000 and 2000;  
   
--Q6
select * from emp
where 
    comm is  null 
--and mgr is not null 공부필요
    and mgr is not null
    and job in ('MANAGER','CLERK') 
    and ename  not like '_L%';

select * from dual;

select lower('ascDSASD') 
from dual;

select lower(ename) from emp;
select upper(ename) from emp;

select upper ( lower(ename) ) from emp;

--대소문자 구분없이 검색
select * from emp
where 
    ename like '%A%' or ename like '%a%';

--ename 컬럼에 모든글자를 소문자로바꾸고 그중에 a만 찾아라 
select * from emp
where
    lower(ename) like '%a%';
-- ename 컬럼에 모든 글자를 소문자로바꾸고 입력되는 글자도 소문자로바꾸고 찾아라 
--  lower(ename) like lower('%a%');     

--length : 문자개수
select ename, length(ename) from emp;

select length('abc'), length('한글') from dual;

--여기 렝스 네임 이름바꾸면 어떻게해야되는지 확인
select ename, length(ename) from emp
where length(ename) >= 5;

select length('한'), lengthb('한') from dual;
--zzzz

--substr
--substr(글씨, 시작 위치, 몇개)
--substr(글씨, 시작 위치) : 시작 위치부터 끝까지
select substr(123456,2,3) from dual;

select 
    job,hiredate 
    substr(job,4), 
    length(substr(job,4)),
    substr(job,-3,2),
    substr(job,-3),
    substr(hiredate,1), --적용안됨
    substr(job,1,2),
from emp;

select '010-1234-5678',
    replace('010-1234-5678', '-', ' '), --글씨에서 두번째 값을 모두 찾아서 세번째로 바꿔준다 
    replace('010-1234-5678', '-') -- 세번째가 생략된 경우 값을 모두 찾아서 공간이없어진다
from dual;

select
    replace('ename','A','*')
    from emp;


select * from emp;
--문제1
--ename 앞에 두글자만 출력 
select  ename, substr(ename,0,2)
from emp;
--문제2
select ename,
    replace(ename,substr(ename,1,2),'**')
from emp; 
--문제3
select ename, lengthb(ename)/2 반절,
    substr(ename,0,length(ename)/2) 반절
from emp; 
--문제3-1 3-2
select 
    ename,
    lengthb(ename) 전체길이,
    substr(ename,1,length(ename)/2),
    replace(ename,substr(ename,1,length(ename) /2 ),'**'),
    --설명 replace (ename컬럼,첫번째기준으로절반까지,*로채운다
    replace(ename,substr(ename,(length(ename) / 2)+1),'**') 반절별표
    --설명 replace (ename컬럼에서,절반기준으로,*채운다
from emp; 


--순서
    --1.중간값 구하기 length(ename)/2
        --2.중간값 부터 글자표기 substr(ename,(length(ename)/2)+1)
                --3.모든값 표기후 중간값 부터 별표표시 replace(ename,substr(ename,(length(ename)/2)+1),'*')
select ename,
replace(ename,substr(ename,(length(ename)/2)+1),'*')
from emp;

select 'oracle',
    lpad ('oracle',9,'#'),
    rpad ('oracle',8,'*'),
    lpad ('oracle',6),
    rpad ('oracle',7)
    from dual;
    
select 
    rpad('971225-', 14, '*'),
    rpad('010-2046-', 13, '*')
from dual;

--이름을 6자리로 만들고 빈 공간의 오른쪽을 *로 채운다
select
    lpad(ename,6,'*'),
    lpad(ename,length(ename)*2,'*'),
    rpad(ename,length(ename)+3,'*')
from emp;

--1.전체 자리수 파악,4개를 제외한 글씨 파악, 조합해서 문제 해결
select '010-2215-6095',
    length('010-2215-6095') as 자리수,
    substr('010-2215-6095',1,length('010-2215-6095')-4) as "잘린 글씨",
    rpad(
        substr('010-2215-6095',1,length('010-2215-6095')-4),length('010-2215-6095'),'*')
from dual;

--사원의 이름을 앞에 두글자만 보이게하고 나머지는 *보기
--1.사원의 이름 계산,뒤에 두글자만 확인하고, 나머지느 *표시 사원이름 앞글자만 *
select ename,
length(ename),
substr(ename,2),
--1번째부터2번째까지는 표시하고,나머지 전체길이까지,별표로 표시하겠다 오른쪽으로 
rpad(substr(ename,1,2),length(ename),'*'),
--2사원 이름의 앞글자 하나만 *로 표시. 단 replace 쓰지말고뮤
--2번쨰자리부터 나머지는표시하고,나머지 전체길이까지 별표를 표시하겠다 왼쪽으로
lpad(substr(ename,2),length(ename),'*') 
from emp;

--심화1. job을 대상으로 20자 크기의 공간에서 가운데 정렬
/*1.가운데 정렬 : 앞과 뒤에 동일한 공간이 있는거  
********************
********ward******** 이런느낌으로 
20-6=14/2= 7
********ward########
*/
select job,
lpad(job,((20-length(job))/2) + length(job), '*'),
rpad(job,((20-length(job))/2) + length(job), '*'),
rpad(lpad(job,((20-length(job))/2) + length(job), '*'),20,'*')
from emp;

select empno || ' : ' || ename 
from emp;

select
    '   a  b  vv ddd      ',
    trim('   a  b  vv ddd      ')
from dual;

--ename 에 2번째 글자만 *처리

select 
    round(14.46),   --두번째 값이 없는 경우 소수점 첫번째 자리 반올림
    round(14.46,1), --첫번째 자리 기준으로 두번째자리에서 반올림 처리를하여 첫번째지라 표시
    round(14.46,-1) --두번째 값이 음수인 경우 정수로 거슬러 올라감 4를 반올림
from dual;

select 
    trunc(14.46),   --두번째 값이 없는 경우 소수점 첫번째 자리 버림
    trunc(14.46,1), --첫번째 자리 기준으로 두번째자리에서 반올림 처리를하여 첫번째지라 표시
    trunc(14.46,-1), --두번째 값이 음수인 경우 정수로 거슬러 올라감 4를 반올림
    trunc(-14.46)
from dual;

select 
    ceil(3.14),--가장 가까운 큰수를 찾는다
    floor(3.14),--가장 가까운 작은수를 찾는다 
    ceil(-3.14),--가장 가까운 큰수를 찾는다
    floor(-3.14),--가장 가까운 작은수를 찾는다
    mod(3500,5)--특저 숫자를 나누고 그 나머지를 출력하는 함수
from dual;


--강사 pc의 오라칼은 9시간 차이 남 
select 
    sysdate + 1,
    sysdate - 1
from dual;

select hiredate,
    add_months(hiredate, 120)
from emp;

--컬럼에 +를 적으면 모두 숫자로 변경에서 적용한다 
select empno, empno + '500' from emp;
--||를 적으면 모두 문자로 변경해서 적용
select empno, empno || '500' from emp;

select to_char(sysdate, 'mon ddd am yyyy-mm-dd hh24:mi:ss') from dual;
select to_char(sysdate, 'yyyy"년 "mm"월" dd"일" hh24"시" mi"분" ss"초"' ) from dual;
select to_char(sysdate, 'yy/mm/dd') from dual;
select to_date('2035-11-14', 'yyyy-mm-dd hh24:mi:ss') from dual;
select to_char(
    to_date('2035-11-14 15:15', 'yyyy-mm-dd hh24:mi:ss'), 'mon ddd am yyyy-mm-dd hh24:mi:ss') 
    from dual;

select
    to_date('2025-05-02', 'yyyy-mm-dd') - to_date('2024-11-15', 'yyyy-mm-dd')
    from dual;

select * 
from emp
where hiredate > to_date('1980/06/01' , 'yyyy/mm/dd');--19810601일 이후부터 입사한 사원찾기

select 
    hiredate,sysdate, (hiredate  - sysdate 
from emp;

select 
    comm,sal,
    comm+sal,
    nvl(comm, -1 ),
    nvl(comm, 0 ) + sal
    from emp;

select 
    empno, ename,comm,
    nvl2(comm,'0','x'),
    nvl2(comm,sal*12+comm, sal*12)
from emp;

select *
from emp;


select job,sal,comm,
    decode(job, --기준이되는 데이터를 먼저저장후 해당 데이터값에 따라 다른 결과값을 내보낸다
        'MANAGER', sal * 1.1,
        'SALESMAN', sal * 1.05,
        'ANALYST', sal,
        'CLERK' , sal * 1.2,
        sal * 1.03) 인상값
from emp;

--이름, 봉급, 추가수당, 봉급+성과금(decode)로

--확인필요

select 
    ename, sal, comm,
    sal+comm,
    sal + nvl(comm, 0),
    sal + decode(comm, null, 0, comm) "봉급+성과급" 
from emp; 


select sal,
    case job
        when 'MANAGER' then sal * 1.1
        when 'SALESMAN' then sal * 1.05
        when 'ANALYST' then sal
        else sal * 1.03 
    end upsal
from emp;

select 
    case 
    when comm is null then '해당 없음'
    when comm = 0 then '수당 없음'
    when comm > 0 then '수당 : '||comm
    end 해당여부
from emp;

--comm이 null인경우 n/a 출ㄺ
--null이 아닌 경우 comm출력
select 
    case
        when comm is null then 'N/A'
        when comm is not null then ''||comm
        --null이 아닐경우 comm표시 
        else '' || comm 
        --나머지는 comm 표시
    end aa
from emp;

--2번문제
select empno,ename,sal,
    trunc((sal / 21.5),2) DAY_PAY,
    round(((sal/21.5)/8),1) TIME_PAY
from emp;

--4번문제
select empno,ename,mgr,
    case
    when mgr is null then '0000'
    when substr(mgr,1,2) = '75' then '5555'
    when substr(mgr,1,2) = '76' then '6666'
    when substr(mgr,1,2) = '77' then '7777'
    when substr(mgr,1,2) = '78' then '8888'
    else to_char(mgr)
    end CHG_MGR1,

--like 

    case
    when mgr is null then '0000'
    else
        case
            when substr(mgr,1,2) = '78' then '8888'
            when substr(mgr,1,2) = '78' then '8888'
            when substr(mgr,1,2) = '78' then '8888'
            when substr(mgr,1,2) = '78' then '8888'
            else to_char(mgr)
       end
    end chg_mgr2,
 

    case 
    when mgr is null then '0000'
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    when mgr like '77%' then '7777'
    when mgr like '78%' then '8888'
    else '' || mgr
    end chg_mgr3,

    case substr(mgr, 1 ,2)
        when '75' then '5555'
        when '76' then '6666'
        when '77' then '7777'
        when '78' then '8888'
        else nvl(to_char(mgr), '0000')
    end chg_mgr4

from emp;

select empno,ename,mgr,
    /* in을 사용해서 간단하게 코딩 */
    /* 두번째 mgr이 5,6,7,8 일때 처리 */
    case
        when mgr is null then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
--            then trim(lpad(' ', 5, substr(mgr, 2, 1)))
            then lpad(substr(mgr, 2, 1), 4, substr(mgr, 2, 1))
            --then lpad(substr(mgr, 2, 1), length(mgr), substr(mgr, 2, 1))
        else '' || mgr
    end chg_mgr5
from emp;

select  sum(comm) from emp;
select  sum(sal) from emp;
select  sum(sal+nvl(comm, 0)) from emp;--comm이 null인 값은 빠짐

--count도 sum처럼 unll을 제외함
--count에는 *를 많이 씀
select count(*),count(sal),count(comm) from emp;

--다중행 함수는 다중행 함수끼리만 출력한다.
select count(*), sum(sal)/*sal*/  from emp;

--count 함수를 통해 deptno 30이 되는 계수 찾는다 
select count(*) from emp
where deptno = 30
and comm is not null;

select max(sal), max(ename),min(sal),min(hiredate),min(comm) from emp;

select count(*) from emp
where ename like '%A%';

select count(*), max(sal) from emp
where ename like '%A%';

--최대 연봉 받는 사람 모든 정보 표시
--where에서 다중행 함수 (집계 함수)를 사용할 수 없음.
/*select * from emp 
where sal = max(sal);*/

select trunc(avg(sal),2), avg(sal) from emp;

select '10', sum(sal), avg(sal) from emp where deptno = 10
union all
select '20', sum(sal), avg(sal) from emp where deptno = 20
union all
select '30', sum(sal), avg(sal) from emp where deptno = 30;


--group by에 포홤된 것만 select에 적용된다
select  deptno,job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job  --group by 분류해서 보기위한 함수 
order by deptno;

/*
--count(*)등 집계 함수는 whwere 에서 사용할수 없다
select max(sal)
from emp
where count(*) > 2
group by deptno;

select *
from emp
where sal > avg(sal);
*/
select  deptno,job, avg(sal), sum(sal), count(*)
from emp
group by deptno,job 
order by deptno;

select deptno, job, avg(sal), count(*)
from emp
group by deptno, job
    having avg(sal) >= 2000
order by deptno, job;
/*having : group by 에서만 사용가능
where에서 표현할수 있는건 가급적 where에서 사용하는게 좋다
집계함수를 조건으로 주고 싶을때 사용한다
*/

select job, count(*) --5번   실행순서
from emp             --1번
where sal > 1000     --2번
group by job         --3번
having count(*) >= 3 --4번
order by job;        --6번

--1번문제
select deptno, job, avg(sal)
from emp
group by deptno,job
having avg(sal) >= 500
order by deptno, job;

--Q1
select deptno, floor(avg(sal)) AVG_SAL, max(sal) MAX_SAL,min(sal) MIN_SAL, count(*)
from emp
group by deptno;

--Q2
select job, count(*)
from emp
group by job
    having count(*) >= 3
order by count(*) desc;

/*이렇게해도 동작은되지만 어순을 지키는것이 좋다
select job, count(*)
from emp
having count(*) >=3
group by job;
*/

--1981년에 입사한 사원중에 급여가 가장 낮은 사원의 정보를 모두 조회하세요
select ename,sal,hiredate from emp;
/*select ename, hiredate,sal, min(sal) from emp
where substr(hiredate,2) = 1
group by ename,hiredate,sal
    having min(sal) >= sal
order by sal;*/

/*select min(sal) from emp
where hiredate like '81%' */
select min(sal) from emp --오류 확인
where
    hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
    and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd')
    
    or to_char(hiredate, 'yyyy') = '1981'
    
    or hiredate like '%81%';

/*group by ename,hiredate;*/
--1981년에 입사한 사원중에서 급여가 1981년 평균 급여보다 좋은 사원의 수를 조회하세요
--입사날자가 81년 인 사람들의 모든 급여를 더한다 



--각 부서별로 급여가 가장 높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요 
select deptno from emp;
select deptno,max(sal),min(sal),max(sal)-min(sal) from emp
group by deptno 
order by deptno desc; --서로의 

select * from dept;

select *
from emp e,dept d  --테이블 별칭 설정
where e.deptno = d.deptno 
order by empno;

select ename, e.deptno
from emp e,dept d  
where e.deptno = d.deptno 
order by empno;

select ename, e.deptno, e.*,d.*
from emp e,dept d  
where e.deptno = d.deptno 
order by empno;

select * from salgrade;
select * from emp;

select e.ename,e.sal,s.grade
from emp e, salgrade s
where  
    e.sal >= s.losal 
    and e.sal <= s.hisal; --테이블에 관련된거 먼저 거르고 다음으로 원하는 정보확인
    
select mgr from emp;

select e1.ename 소, e1.mgr 번호, e2.ename 중, e2.empno 상사번호,e2.mgr 번호,e3.ename 상, e3.empno 상사번호
from emp e1,emp e2,emp e3
where e1.mgr = e2.empno
and e2.mgr = e3.empno;

select e1.ename, e1.mgr, e2.ename, e2.empno,e2.mgr 
from emp e1,emp e2
where e1.mgr = e2.empno(+);

select e1.ename, e1.mgr, e2.ename, e2.empno,e2.mgr 
from emp e1,emp e2
where e1.mgr(+) = e2.empno;

--using 둘다 같은 컬럼명을 사용하고 등가 조인일 경우에만 쓸수있다.
select deptno, emp.ename
from emp join dept using(deptno);


--테이블 조인 조건을 on으로 분리시킨다
select *
from emp e join dept d on(e.deptno = d.deptno)
where sal <= 3000;

select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);
select *-- from 에서 핵심데이터는 왼쪽으로 몰아서쓴다
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);

--q1 emp=deptno,emp,ename,sal dept=dnaem
select *
from dept,emp ;

select e.empno, d.dname, e.empno, e.ename, e.sal
from dept d, emp e
where d.deptno = e.deptno 
and sal >= 2000
order by d.deptno;

--q2
select deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*)
from emp e join dept d using(deptno)
group by deptno, d.dname;

--q3
select deptno,d.dname,e.empno,e.ename,e.job, e.sal
from dept d left outer join emp e on (d.deptno = e.deptno)
order by deptno;

select *
from emp;
--추가문제 1
--사원번호 이름 부서명 급여등급 출력 :14줄
select e.empno,e.ename,e.deptno,s.grade
from emp e ,salgrade s
where 
    e.sal >= s.losal and e.sal <= s.hisal ; 

select --확인
    e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s.losal and s.hisal;

--추가문제 2
--상사 보다 월급이 높은 사원의 이름,급여,상사이름,상사급여 name sal name2 sal2

select e1.ename,e1.sal,e2.ename,e2.sal
from emp e1 
left outer join emp e2 on(e1.mgr = e2.empno)
where e1.sal > e2.sal;

select *--d에 모든테이블 조회 and e에 
from dept d left join emp e on (d.deptno = e.deptno)
where 1=1
and e.deptno is null;


--blake보다 높은 연봉을 받는 사람들
select *
from emp
where sal > 
            (select 
                sal 
            from 
                emp 
            where 
                ename = 'BLAKE'); 


--jones랑 같은 job을 가진 사람들
select *
from emp
where job  = (select job from emp where ename = 'JONES'); 



--서브쿼리
select ename,sal
from emp
where sal > 
        (select sal from emp where ename = 'JONES');

select max(sal) from emp
group by deptno;

select * from emp
where sal in (
                select max(sal) from emp
                group by deptno
                );

select * --where 문보다 select 문을 빨리 돌리고싶을때 사용
from(
select empno,deptno,ename from emp
where deptno = 10
);

select rownum, emp.* 
from emp
where rownum = 1;

select job, count(*) cnt from emp
group by job 
having count(*) >= 3;

select *
from (
        select job, count(*) cnt from emp
        group by job 
    )
where cnt >= 3;

with e10 as(
    select * from emp where deptno=10
)
select * from e10;

--Q1
select job, empno, ename, sal, deptno, dname
from emp join dept using (deptno)
where job = (
                select job from emp
                where ename = 'ALLEN')
order by sal desc, ename asc;


--Q2
--1.전체 사원의 평균 급여 확보 
--2.그것보다 높은(초과) 사람들 출력
select empno, ename, dname,hiredate,loc,sal,grade
from emp e, dept d,salgrade s
where 
    e.deptno = d.deptno
    and e.sal >= s.losal and e.sal <= s.hisal
    and e.sal > (select avg(sal) from emp)
order by sal desc, empno;

select empno,ename,sal,s.grade
from emp e left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
where 
e.sal > (select max(sal) from emp where job = 'SALESMAN')
order by empno;
--Q3
--10번 부서 사람 중에서~ 30번 부서에 없는 직책
--30번 부서의 job들이 not in으로 10번 부서에 적용하면?
select * from emp where deptno = 10
union all
select * from emp where deptno = 30;

select empno,ename,job,e.deptno,dname,loc
from emp e left outer join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and job not in (select job from emp where deptno = 30);

select empno,ename,job,deptno,dname,loc
from emp join dept using (deptno)
where deptno = 10 
and job not in      
                    (select job 
                    from emp
                    where deptno=30) ;

--Q4
select empno, ename, sal, grade
from emp e
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where e.sal > (
    select max(sal) from emp where job = 'SALESMAN'
);




--추가문제1 1981년에 입사한 사원 중에 급여가 가장 낮은 사원의 정보를 모두 조회하세요

--추가문제2 1981년에 입사한 사원 중에서 급여가 1981년 평균 급여보다 높은 사원의 수를 조회하세요.

--추가문제3 각 부서별로 급여가 가장 높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요. 


create table emp_ddl(
empno number(4),            --숫자 4자리로 제한
ename varchar2(10),         --가변형 글씨 10바이트로 제한
job varchar2(9),            --제한보다 적은 글씨일때 글씨만큼의 공간으로 줄인다
mgr number(4),
hiredate date,              --날짜
sal number(7,2),            --소수점 둘쨰 자리까지 기록 
comm number(7,2),
deptno number(2)
);

desc emp_ddl;
select * from emp_ddl;

create table dept_ddl as select * from dept;
select * from dept_ddl;

create table emp_ddl_30
as select * from emp where deptno =30;
select * from emp_ddl_30;

create table empdetp_ddl
as select empno, ename, job, mgr, hiredate, sal, comm, d.deptno
from emp e, dept d
where 1 <> 1;

select * from empdetp_ddl;

--테이블생성 and emp테이블에서 모든객체를 가져온다
create table emp_alter
as select * from emp;

select * from emp_alter;
--emp_alter 테이블에서 hp라는 컬럼 생성 
alter table emp_alter
    add hp varchar2(20);
    
select * from emp_alter;

alter table emp_alter
rename column hp to tel;
select * from emp_alter;

alter table emp_alter
modify empno number(4);

desc emp_alter;

alter table emp_alter
drop column tel;

alter table emp_alter
modify mgr varchar2(4);

rename emp_alter to emp_rename;

select * from emp_rename;
truncate table emp_rename;

drop table emp_rename;

--10장
create table dept_temp
as select * from dept;

select * from dept_temp;

--테이블에 데이터 추가 insert문
insert into dept_temp ( deptno, dname, loc)
values (50,'DATABASE','SEOUL');

--제한된 바이트보다 더큰게 들어가서 오류
insert into dept_temp ( deptno, dname, loc)
values (123,'DATABASE','SEOUL');

insert into dept_temp
values (60, 'NETWORK','BUSAN');
select * from dept_temp;

insert into dept_temp (deptno,dname,loc)
values (70, 'WEB',NULL);
select * from dept_temp;

insert into dept_temp (deptno,loc)
values (90,'INCHEON');
select * from dept_temp;


--껍
create table emp_temp
as select * from emp where 1 <> 1;
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr,hiredate,sal,comm,deptno)
values (2111,'이순신', 'MANAGER',9999,to_date('07/01/2001','DD/MM/YYYY'),4000,NULL,20);
select * from emp_temp;
insert into emp_temp (empno, ename, job, mgr,hiredate,sal,comm,deptno)
values (3111,'심청이', 'MANAGER',9999,sysdate,4000,NULL,20);

insert into emp_temp
select * from emp where deptno = 10;

create table dept_temp2
as select * from dept;
select * from detp_tmep2;

update dept_temp2
set loc = 'seoul';
select * from dept_temp2;

select * from dept_temp2 where deptno = 40;
update dept_temp2
set dname = 'DATABASE',
    loc= 'SEOUL'
    where  deptno = 40;
    
select * from emp_temp;

select * from emp_temp 
where sal <= 2500;

update emp_temp
set sal = sal + 50
where sal <= 2500;

--emp 테이블을 복사한 emp_temp2에서 
--연봉이 1000천 이하인 사원 연봉을 1.3% 인상

create table emp_temp2
as select * from emp ;
select * from emp_temp2;

select * from emp where sal <= 1500 ;

update emp_temp2
set sal = sal *1.013
where sal <= 1500;
select * from emp_temp2;


delete from emp_temp2
where job = 'MANAGER';
select * from emp_temp2;

commit;

select * from emp_temp2;
delete from emp_temp2;

rollback;

create table emp_temp3
as select * from emp ;
rollback;
select * from emp_temp2;

select * from user_tables;

select * from user_indexes;

create index idx_emp_sal
on emp(sal asc);

select * from emp
order by sal asc;

select /*+ index(idx_emp_sal) */
    *
from emp
order by sal asc; 

select /*+ index(e) */ --강제 힌트 주는방법 플랜으로 보면됨
    *
from emp e
where sal = 3000
order by sal asc; 


select max(empno) from emp_temp2;

select empno,ename 
from emp_temp2
where empno = 
    (select max(empno) from emp_temp2);

insert into emp_temp2 (empno,ename)
values ((select max(empno)+1 from emp_temp2),'신입이');

select * from emp_temp2;

--시퀀스
create sequence seq_empno --시퀀스 생성
start with 8000           --시작 숫자 지정(기본값:1)
increment by 10           --양수=증감숫자 증가/음수=감소 양 
;

select seq_empno.nextval from dual; --다음 시퀀스 값 가져오기
select seq_empno.currval from dual; --현재 시퀀스 값 보기
--nextval을 한번도 사용하지 않는 경우 currval를 사용하지 못함
insert into emp_temp2 (empno,ename) 
values(seq_empno.nextval, '신입3'); --다음 시퀀스 값 가져오기
select * from emp_temp2;

drop sequence seq_empno; --시퀸스 삭제 


--not null 설정
create table table_notnull (
    login_id varchar2(20) not null,
    login_pwd varchar(20) not null,
    tel varchar2(20)
    );

insert into table_notnull (login_id, login_pwd, tel)
values ('test_id_01', null, '010-2046-7051'); --not null 설정을 했기때문에 에러

select * from user_constraints; --제약조건들이 모여있음 조회명령어

insert into table_notnull (login_id, login_pwd, tel)
values ('test_id_01', 1234, null);
select * from table_notnull;

alter table table_notnull
modify (tel not null);
--constraint를 통해서 삭제를 할수도있지만
--modify로 해결할 수 있다.
update table_notnull
set tel = '0'
where tel is null;

desc table_notnull;

create table table_pk (
    login_id varchar2(20) primary key, --not null + unique조건(중복) 인덱스생성
    login_pwd varchar(20) not null, -- 널불가
    tel varchar2(20)
);
select * from user_constraints;
select * from user_indexes;
--primary key, pk, 주요키,중요키, 기본키
--not null + unique 조건
--생성과 동시에 index도 생성해줌
--create table에서 컬럼을 정의하면서 primary key를 지정하는 방식으로는
--      딱하나만 지정가능
--만약 두개 이상을 PK로 지정(복합키)하는 경우 
--alter나 primary key 방식을 이용

insert into table_pk(login_id, login_pwd, tel)
values('test','pw', '010');
insert into table_pk(login_id, login_pwd, tel)
values('test','pw', '010');
select * from table_pk;
insert into table_pk(login_id, login_pwd, tel)
values(null,null, null);

insert into table_pk(login_id, login_pwd, tel)
values('test','pw', '010');

drop table table_name;
create table table_name (
    col1 varchar2 (20),
    col2 varchar2 (20),
    col3 varchar2 (20),
    primary key (col1,col2)
    --unique (col1)
    );
    
insert into table_name
values ('id1','pw1',null);
commit;

select * from table_name;
INSERT INTO TABLE_NAME VALUES ('ID1','PW1','');

commit;

create table dept_fk (
    deptno number(2) primary key,
    dname varchar2(14),
    loc varchar2(13)
    );

create table emp_fk (
    empno number(4),
    ename varchar2(10),
    deptno number(2) references dept_fk(deptno)  --폴링키 지정방법
);
--프라이머리키 and references로 묶여있는 테이블은 메인 테이블에 겹치는 데이터가 있고  서브 테이블에는
--겹치는 테이블 데이터가 없으면 메인테이블에서 수정이 가능하다.
--서브 테이블에 겹치는 데이터가 있으면 수정이 불가능 
insert into emp_fk
values (1,'a',1);

insert into dept_fk (deptno,dname,loc)
values (1,'aaaa','AAAA');

insert into emp_fk (deptno,dname,loc)
values (10,'이름',1);

update dept_fk
set deptno = 3
where deptno = 1;

select * from emp_fk;
select * from dept_fk;
--dept_fk 에 deptno를 프라이머리 키로 지정을하였기 때문에 dept_fk에 있는 값은 emp_fk에 deptno에서 사용할수있다.