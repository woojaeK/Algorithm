import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class Solution {
    static int[][] graph;
    static String[] stream;
    static Stack<Integer> stack;
    static int N;
    public static void main(String[] args) throws Exception {
    	System.setIn(new FileInputStream("res/input_D4_1232.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;
        for(int tc = 1; tc<=T; tc++) {
            N = Integer.parseInt(br.readLine());
            stack = new Stack<>();
            stream = new String[N+1];
            graph = new int[N+1][N+1]; // from - > to
            for(int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int nodeNum = Integer.parseInt(st.nextToken());
                stream[nodeNum] = st.nextToken();
                if(match(stream[nodeNum])){
                    graph[nodeNum][Integer.parseInt(st.nextToken())]=1;
                    graph[nodeNum][Integer.parseInt(st.nextToken())]=1;
                }
            }
            dfs();
            System.out.println("#" + tc + " " + stream[1]);
        }
    }
    public static boolean match(String s) {
        if("+-*/".contains(s)) return true;
        else return false;
    }
    public static void dfs() {
        stack.push(1);
        stack.push(1);
        while(!stack.isEmpty()) {
            int[] calc = new int[2];
            int count = 0;
            int cur = stack.pop();
            int size = stack.size();
            if(match(stream[cur])) {//꺼낸게 연산자면 좌우 확인해봐야함
                for(int i = N; i>=1;i--) {
                    if(match(stream[i])&&graph[cur][i] == 1) {
                        stack.push(i);
                        stack.push(i);
                    }
                }
                if(size == stack.size()) {
                    for(int i = N; i >= 1; i--) {
                        if(graph[cur][i] == 1) {
                            calc[count++] = Integer.parseInt(stream[i]);
                        }
                    }
                    stream[cur] = String.valueOf(calculate(calc,stream[cur]));
                }
            }
        }
    }
    public static int calculate(int[] calc, String s) {
        int result;
        switch(s) {
        case "+":
            result = calc[0] + calc[1];
            return result;
        case "-":
            result = calc[1] - calc[0];
            return result;
        case "/":
            result = calc[1] / calc[0];
            return result;
        case "*":
            result = calc[0] * calc[1];
            return result;
        default:
            return 0;
        }
    }
}