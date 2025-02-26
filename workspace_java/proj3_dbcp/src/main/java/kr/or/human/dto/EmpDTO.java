package kr.or.human.dto;

import java.sql.Date;

//DTO = Data Transfer Object
// VO = value Object
public class EmpDTO {
	
	private int empno; // 사원번호
	private String ename; // 사원이름
	private String job; // 일
	private int mgr; // 
	private Date hireadte;
	private int sal; // 
	private Integer comm; // 
	private int deptno; // 
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHireadte() {
		return hireadte;
	}
	public void setHireadte(Date hireadte) {
		this.hireadte = hireadte;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
