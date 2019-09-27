package pack;

import other.OutFileInter;

public class MessageImpl implements MessageInter {
	// 생성자 주입용
	private String msg1, msg2; 
	private int year;
	private MyInfo myInfo;
	
	// 생성자로 주입 
	public MessageImpl(String msg1, String msg2, int year, MyInfo myinfo) { 
		this.msg1 = msg1;
		this.msg2 = msg2;
		this.year = year;
		this.myInfo = myinfo;
	}

	
	// property 주입용 - setter
	private String spec;
	private OutFileInter fileInter;
	
	// property 주입
	public void setSpec(String spec) { 
		this.spec = spec;
	}
	
	public void setFileInter(OutFileInter fileInter) {
		this.fileInter = fileInter;
	}
	
	// 출력 담당
	public void sayHi() { 
		String message = msg1 + " " + msg2 + " ";
		message += (year + 19) + "년" + "\n" + myInfo.myData() + " ";
		message += spec;
		System.out.println(message);
		
		// 위 메세지를 파일로 저장
		fileInter.outFile(message);
	}
}