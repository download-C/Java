package chapter10_dao;

public class OracleDao implements DataAccessObject {
	String n = "oracle";
	@Override
	public void select() {
		System.out.println(n+"DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(n+"DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println(n+"DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(n+"DB에서 삭제");
	}
	
}
