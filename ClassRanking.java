import java.util.Scanner;

public class ClassRanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 學生的個數
		int students[][] = new int[n][2];// 每個學生有學號和成績
		int number;
		int grade;
		int head;
		for (int i = 0; i < n; i++) {
			number = sc.nextInt(); //輸入學號
			grade = sc.nextInt();	//輸入成績
			students[i][0] = number; 
			students[i][1] = grade;
			classRanking(students, number - 1);
		}
		printResult(students);//印出來
	}

	private static void printResult(int[][] students) {
		for(int i =0;i<students.length;i++) {
			System.out.println(students[i][0]+"."+students[i][1]);
		}
	}
	
	private static void classRanking(int[][] students, int wall) {
		int temp = students[wall][0];//學號
		int temp1 = students[wall][1];//成績
		int i;
		for ( i = wall - 1; i >= 0; i--) {
			if(temp1>students[i][1]) {
				students[i+1][1] = students[i][1];
				students[i+1][0] = students[i][0];        
			}else {
				break;
			}
		}
		students[i+1][0] = temp;
		students[i+1][1] = temp1;                    	//InsertionSort
	}
	

}
