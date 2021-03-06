package controller;

import java.util.ArrayList;

import model.Member;
import model.MemberAll;
import model.MemberDAO;

public class MemberManagementService {

	// 데이터베이스에 직접 접근하는 객체 >- Data Access Object
	private MemberDAO dao = new MemberDAO();

	public boolean memberJoin(Member member) {
		int rows = dao.insert(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}

	}

	public Member memberLogin(Member m) {
		Member loginUser = dao.selectOne(m);
		return loginUser;
	}

	public MemberAll VacationUpdate(MemberAll m) {
		MemberAll UpdateVacation = dao.UpdateVacation(m);
		return UpdateVacation;
	}

	public int Update(MemberAll m) {
		int Update = dao.Update(m);
		return Update;
	}

	public boolean memberEnroll(MemberAll member) {
		int rows = dao.insert(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}

	}

	public boolean memberVacationEnroll(MemberAll member) {
		int rows = dao.insertVacation(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}

	}

	public boolean memberVacationEnroll2(MemberAll member) {
		int rows = dao.insertVacation2(member);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}

	}

//   public ArrayList<Member> memberLookup(String id) {
//      
//      
//      
//      return dao.selectAll(id);
//   }

	public ArrayList<MemberAll> MemberAllLookup() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	public ArrayList<MemberAll> MemberAllVacation() {
		// TODO Auto-generated method stub
		return dao.selectVacation();
	}

	public ArrayList<MemberAll> MemberAllVacation2() {
		// TODO Auto-generated method stub
		return dao.selectVacation2();
	}

	public ArrayList<MemberAll> MemberAllVacation3() {
		// TODO Auto-generated method stub
		return dao.selectVacation3();
	}

}