import java.util.*;

//난수발생, 사용자입력, 힌트, 종료

public class 야구게임_메소드 {

	static int[] getLand() {
		int[] com=new int[3];
		int su=0; // 난수를 저장하는 변수
		boolean bCheck=false; // 중복여부 확인 (중복 = true / 중복(X) = false)
		for(int i=0; i<3; i++) {
			bCheck=true;
			while(bCheck) {
				// 난수 발생
				su=(int)(Math.random()*9)+1; //1~9
				bCheck=false;
				// while 종료조건
				// 체크
				for(int j=0; j<i; j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su; // 중복이 안되면 com[i]에 저장
		//	System.out.print(com[i]+"\t");		
	}
		return com;
	}
	static int[] userInput() {
		int[] user=new int[3];
		
		// 입력
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수를 입력:");
			int input=scan.nextInt();
			
			// 오류 처리 => 세자리 정수가 입력되지 않을 경우
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다");
				// 다시 처음으로 이동
				continue;
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 두번째 오류
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 정수는 사용할 수 없습니다");
				continue;
			}
			// 세번째 오류
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			break;
	}
		return user;
	}
	static void hint(int[] com,int[] user) {
		int s=0, b=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(com[i]==user[j]) {
					if(i==j)
						s++;
					else 
						b++;					
				}
			}
		}
		// 힌트
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
		
		if(isEnd(s)) {
			System.out.println("Game Over");
			System.exit(0);
			//break => 일반 if문 내 사용금지
		}
		
	}
	static boolean isEnd(int s) {
		if(s==3) {
			return true;
		}
		else 
			return false;
	}
	
	static void process() {
		int[] com=getLand();
		while(true) {
			int[] user=userInput();
			hint(com, user);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
	}

}
