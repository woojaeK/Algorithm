import java.util.*;

public class PhoneManagerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원수 >>:");
		int count = scanner.nextInt();

		// Phone[] phoneArray = new Phone[count];

		Phonemanager pmgr = new Phonemanager();
		Phone p;

		for (int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
			p = new Phone(scanner.next(), scanner.next());
			pmgr.add(p); // 이름 전화번호 추가 
		}

		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름 >>");
			String name = scanner.next();

			if (name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			p = pmgr.searchByName(name);//이름으로 검색
			if (p != null) System.out.println(p.getName() + "의 번호는 " + p.getTel() + "입니다.");
			else System.out.println(name + "이 없습니다.");
		}
	}
}
