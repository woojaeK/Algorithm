
package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_정올_2000_동전교환_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int coin[] = new int[N];

		String line[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(line[i]);
		}

		int M = Integer.parseInt(br.readLine());
		int m[] = new int[M + 1];

		for (int i = 1; i <= M; i++) {
			int min = 987654321;
			for (int j = 0; j < coin.length; j++) {
				if (i - coin[j] >= 0) {
					if (min > m[i - coin[j]])
						min = m[i - coin[j]];
				}
			}
			m[i] = min + 1;
		}

		if (m[M] == 987654322)
			System.out.println("impossible");
		else
			System.out.println(m[M]);
	}

}