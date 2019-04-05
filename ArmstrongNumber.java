/*
 * [실습] Armstrong Number
 * 
 * Armstrong Number란, 임의의 어떤 수(x)와 그 수의 각 자리 수의 세제곱의 합이 같은 수를 말한다.
 *   예) x = 153 이라면, ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) = 153 으로 같으므로, 153은 Armstrong Number 이다.
 * 
 * 100부터 999까지의 숫자 중, Armstrong Number를 구한다.
 * 
 * 
 * [실행 결과]
 * 
 * 153
 * 370
 * 371
 * 407
 * 
 */
public class ArmstrongNumber {    
    public static void main( String[] args ) {
        
        //구현시작
    	for(int i = 100; i < 1000 ; i++){
    		int temp = i;
    		long armNum = 0;
    		while(temp > 0){
    			armNum += Math.pow(temp%10, 3);
    			temp = temp/10;
    		}
    		
    		if(i == armNum){
    			System.out.println(i);
    		}
    		
    	}
    	//구현종료
    }
}
