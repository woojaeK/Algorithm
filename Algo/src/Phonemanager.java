import java.util.Scanner;

public class Phonemanager {

	private Phone[] phoneArray;
	public int index;

	public Phonemanager() {
		phoneArray = new Phone[100];//배열선언
		index = 0;//멤버변수초기화
	}

	public void add(Phone phone) {
		phoneArray[index++] = phone;
	}

	public Phone searchByName(String name) { // phone배열에 있는 각각 객체를 하나씩 참조하면서 파라미터로 받은 이름과 배열에 있는 배열이 같은지 확인
		int count = 0;
		boolean chk = false; //찾는 이름이 있는지 확인 있으면 true 없으면 false
		for (int i = 0; i < index; i++) {
			if (phoneArray[i].getName().equals(name)) {
				count = i; 
				chk = true;
			}
		}
		if(chk) return phoneArray[count];
		else return null;
	}
}
//5.2 public Iterator<Phone> searchBy~~