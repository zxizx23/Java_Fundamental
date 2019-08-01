package java_20190731;

public class ThrowDemo {
	public static double withdraw(String account, int amount)
			throws IncorrectAccountException, InsufficientBalanceException {
		double mybalance = 10000;
		String myAccount = "123-12-123123";
		if (myAccount.equals(account)) {
			if (mybalance - amount >= 0) {
				mybalance -= amount;
			} else {
				throw new InsufficientBalanceException("잔고가 부조크");
			}
		} else {
			throw new IncorrectAccountException("잘못된 계정입니다");
		}
		return mybalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 0;
		try {
			balance = withdraw("123-12-123123", 100000);
		} catch (IncorrectAccountException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalanceException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
