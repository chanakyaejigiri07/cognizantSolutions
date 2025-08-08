import java.util.*;
public class MagicalLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		int res=0;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
				if(mat[i][j]%2!=0) {
					sum+=mat[i][j];
				}
			}
			if(sum%2==0) {
				res++;
			}
		}
		System.out.println(res);

	}

}
