import java.util.*;
public class Solution {
	static Scanner sc=new Scanner(System.in);
	public static int Magiclibrary1() {
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
		sc.close();
		return res;
	}
	
	public static int knowledgeEnhancement3() {
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter reading times of books:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter total available reading hours:");
        int N = sc.nextInt();
		Arrays.sort(arr);
		int sum=0,count=0;
		for(int num:arr) {
			sum=sum+num;
			if(sum<N) {
				count++;
			}
			else {
				break;
			}
		}
		
		return count;
	}
	
	//4th
	public static int distance4() {
		String s=sc.next();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return Math.max(j-i, i);
			}
			else {
				i++;
			}
		}
		return j-i;
		
		
	}
	
	
	public static int countChocolate5(int n) {
	    long MOD = 1_000_000_007L;
	    long res = (long) n * (n + 1) / 2; 
	    res += 4L * (n / 5);               
	    return (int) (res % MOD);
	}

	public static void main(String[] args) {
		//call the function to which ever code you want to execute
		

	}

}
