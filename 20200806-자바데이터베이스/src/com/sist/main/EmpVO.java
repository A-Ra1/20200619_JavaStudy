package com.sist.main;

// 데이터를 모아주는 클래스
import java.util.*;
/*
 *	empno NUMBER	사번
 *	ename VARCHAR2	이름
 *	job	  VARCHAR2	직위
 * 	mgr	  NUMBER	사수의 사번
 *  hiredate  DATE	입사일
 *  sal   NUMBER 	급여
 *  comm  NUMBER	성과급
 *  deptno  NUMBER	부서번호
 *  
 *  => 데이터베이스 매칭 => ~VO, ~DTO
 *  
 */
// 사원 정보 => 캡슐화

public class EmpVO{

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hireDate;
	private int sal;
	private int comm;
	private int deptno;
	
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
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
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
