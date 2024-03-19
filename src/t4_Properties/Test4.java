package t4_Properties;

//메인스레드가 끝나도 일반스레드의 작업이 끝나지 않으면 JVM은 작업을 끝내지 않는다.(기본)
//일반 스레드를 메인스레드에 종속되도록 처리하려면 데몬 스레드를 이용한다.
//일반스레드 setDaemon(false) ,데몬스레드 setDaemon(true)

class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬스레드" : "일반스레드"));
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class Test4 {
	public static void main(String[] args) {
		// 일반스레드
		Thread thread = new MyThread3();
		thread.setDaemon(true); // 데몬스레드
		thread.setName("thread");
		thread.start();

		// 메인스레드를 3초간 지연 처리 후 종료 시켜준다.
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		System.out.println("main 스레드 종료");
	}
}
