package Controller;

import student.StudentDAO;
import subject.SubjectDAO;
import utiis.Utills;

public class Controller {
	private StudentDAO stuDAO;
	private SubjectDAO subDAO;

	public void init() {
		stuDAO = new StudentDAO();
		stuDAO.initstu();
		subDAO = new SubjectDAO();
		subDAO.init();
	}

	public void mainMenu() {
		System.out.println("[1]학생 추가"); // 학번 (1001) 자동 증가: 학생 아읻 중복 저장 불가
		System.out.println("[2]학생 삭제"); // 학생 id 입력후 삭제, 과목도 같이 삭제
		System.out.println("[3]학생 과목 추가"); // 학번 입력후 점수 랜덤 50~100: 과목이름 중복 불가
		System.out.println("[4]학생 과목 삭제");// 학번 입력후 과목 이름 받아서 과목에서 학생 1명 삭제
		System.out.println("[5]전체 학생 목록");// 점수로(내림 차순) 출력
		System.out.println("[6]한 과목 학생 목록");// 과목이름 입력 받아서 해당 과목학생 이름과 과목점수 출력(이름 차순으로 저장)

		System.out.println("[7]파일 저장");
		System.out.println("[8]파일 로드");
		System.out.println("[0]종 료");

		// 추가>목록>
	}

	public void run() {
		init();
		while (true) {
			mainMenu();
			System.out.println("선택");
			int num = Utills.getValue("메뉴선택1~5", 0, 6);

			if (num == 1) {
				stuDAO.addStudnt();

			} else if (num == 2) {
				subDAO.deletSubjectBystudentNo(stuDAO);
			} else if (num == 3) {
				subDAO.addSubjectToAStudnt(stuDAO);
			} else if (num == 4) {

			} else if (num == 5) {
				stuDAO.printAllStdentByscore(subDAO);
			} else if (num == 6) {

			} else if (num == 7) {
//				Utills.filedata("student.txt",stuDAO.);
			} else if (num == 8) {

			} else if (num == 0) {
				break;
			}

		}

	}
}
