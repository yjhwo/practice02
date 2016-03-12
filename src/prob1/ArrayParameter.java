package prob1;

public class ArrayParameter {
	/*static char[] replaceSpace(char a[]){
		char tmp;
		
		for(int i=0;i<a.length/2;i++){	// 17
			tmp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = tmp;
		}
		
		return a;
	}*/
	static void replaceSpace(char a[]){
		// 32
		for(int i=0; i<a.length; i++){
			if(a[i]==32){
				a[i]=',';
			}
		}
	}
	
	static void printCharArray(char a[]){
		for (char c : a) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		 char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
	     printCharArray(c);  // 원래 배열 원소 출력
	     replaceSpace(c);    // 공백 문자 바꾸기
	     printCharArray(c);  // 수정된 배열 원소 출력

	}

}