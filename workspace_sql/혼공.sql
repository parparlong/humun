select sal, nvl(comm,0) from emp;

select job from emp

select ename from emp
where 
    lower(ename) like lower('a%');
    
select substr('ASCDEFG',1,4) from dual;

select instr('ASCDEFG','C') from dual;

select rpad(job,15, '_'), lpad(job,15, '*') from emp;