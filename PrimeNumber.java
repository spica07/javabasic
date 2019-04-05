/*
 * [실습] 소수 확인 (Prime Number)
 * 
 * 소수(Prime Number)란?
 *   1과 자기 자신을 제외한 숫자로 나누어 떨어지지 않는 숫자를 말한다.
 *      ex) x = 23 이라면, 23은 1과 23으로만 나누어 떨어지므로, 소수이다.
 * 
 * 주어진 숫자가 소수인지 확인한다.
 * 소수이면 “소수입니다.”를, 소수가 아니면 “소수가 아닙니다.”를 출력한다.
 * 
 * 
 * [실행 결과]
 * 
 * 23 : 소수입니다.
 * 26 : 소수가 아닙니다.
 * 
 */
public class PrimeNumber {
    
    public static void main( String[] args ) {
        
        int number = 23;        // 소수 여부를 확인할 숫자 (숫자를 바꿔 가며 테스트)
        
        // 위에 주어진 숫자가 소수인지 확인하고, 요구사항에 맞춰 출력한다.        
        boolean checkPrime = true;
        for(int i = 2 ; i <= number/2; i++){
        	if(number%i == 0){
        		checkPrime = false;
        		break;
        	}
        }
        
        if(checkPrime){
        	System.out.println("소수입니다.");
        } else {
        	System.out.println("소수가 아닙니다.");
        }
    }
}
