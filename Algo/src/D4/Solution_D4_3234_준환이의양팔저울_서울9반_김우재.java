package D4;
import java.util.Scanner;

public class Solution_D4_3234_준환이의양팔저울_서울9반_김우재{
    public static int result;
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1;tc<=T;tc++){
            int N = sc.nextInt();
            int[]nc = new int[N];
            boolean[] V = new boolean[N];
            result = 0;
            for(int i = 0 ; i<N;i++) nc[i] = sc.nextInt();
            dfs(nc,new boolean[N],0,0,0);
            System.out.println("#"+tc+" "+result);
        }
  
        sc.close();
  
    }
    public static void dfs(int[] nc,boolean[] check,int left,int right,int depth){
        if(left<right) return;
        if(nc.length ==depth){
            result++;
            return;
        }
        for(int i = 0 ; i <nc.length;i++){
            if(check[i]) continue;
            check[i] = true;
            dfs(nc,check,left+nc[i],right, depth+1);
            dfs(nc,check,left,right+nc[i], depth+1);
            check[i] = false;
        }
    }
}