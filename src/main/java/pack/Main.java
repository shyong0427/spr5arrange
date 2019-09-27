package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init.xml"); // 원래 " "의 명칭
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/init.xml"); // 경로 지정

		GenericApplicationContext context = new GenericXmlApplicationContext("classpath:init.xml"); // 위 문구의 개량종 
		
		/*
		MessageImpl impl1 = (MessageImpl)context.getBean("mimpl");
		impl1.sayHi();
		
		MessageImpl impl2 = (MessageImpl)context.getBean("mimpl");
		impl2.sayHi();
		System.out.println(impl1 + " " + impl2.toString());
		*/
		
		// 다형성 구현
//		MessageInter inter = (MessageImpl)context.getBean("mimpl");
//		MessageInter inter = (MessageInter)context.getBean("mimpl");
		MessageInter inter = context.getBean("mimpl", MessageInter.class);
		inter.sayHi();
		
		context.close();
	}
}