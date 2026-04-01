package jp.co.diworks.action;

public class Robot {

	public static void main(String[] args) {
		
		Person taro = new Person();
		
			taro.name = "山田太郎";
			
				System.out.println(taro.name);
			
				taro.talk();
			
				taro.walk();
			
				taro.run();	
	}
}
