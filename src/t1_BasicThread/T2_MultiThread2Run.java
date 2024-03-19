package t1_BasicThread;

//스레드를 만드는 2번째 방법: Runnable 인터페이스를 구현객체를 만든 후 
//스레드 생성시 매개변수로 처리해준다.
public class T2_MultiThread2Run {
	public static void main(String[] args) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("main(1).현재 클래스명 : T2_MultiThread1Run");
		System.out.println("main(1).현재 실행중인 스레드 이름? " + Thread.currentThread().getName());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		T2_MultiThread2 t2 = new T2_MultiThread2();
		Thread thread = new Thread(t2, "atom");
		//t1.run();  // 스레드를 실행할때는 run()메소드가 아닌 start()메소드로 실행한다.
		thread.start();
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
		System.out.println("main(2).현재 클래스명 : T2_MultiThread1Run");
		System.out.println("main(2).현재 실행중인 스레드 이름? " + Thread.currentThread().getName());
		System.out.println("main(2). "+Thread.currentThread().getName()+" 스레드가 종료되었습니다.");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
