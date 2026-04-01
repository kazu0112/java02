package jp.co.diworks.action;

public class Test {
	
	public static void main(String[] args) {
		
		Person taro = new Person();
		
			taro.name = "山田太郎";
					
			taro.age = 20;
			
			taro.phoneNumber = "090-1234-5678";
					
			taro.address = "taro@gmail.com";
			
				System.out.println(taro.name);
				
				System.out.println(taro.age);
				
				System.out.println(taro.phoneNumber);
				
				System.out.println(taro.address);
				
				taro.talk();
				
				taro.walk();
				
				taro.run();
				
		Person jiro = new Person();
		
			jiro.name = "木村次郎";
			
			jiro.age = 18;
			
			jiro.phoneNumber = "080-1234-5678";
			
			jiro.address = "jiro@gmail.com";
			
				System.out.println(jiro.name);
				
				System.out.println(jiro.age);
				
				System.out.println(jiro.phoneNumber);
				
				System.out.println(jiro.address);
				
				jiro.talk();
				
				jiro.walk();
				
				jiro.run();
				
		Person hanako = new Person();
		
			hanako.name = "鈴木花子";
			
			hanako.age = 16;
			
			hanako.phoneNumber = "070-1234-5678";
			
			hanako.address = "hanako@gmail.com";
			
				System.out.println(hanako.name);
				
				System.out.println(hanako.age);
				
				System.out.println(hanako.phoneNumber);
				
				System.out.println(hanako.address);
				
				hanako.talk();
				
				hanako.walk();
				
				hanako.run();
				
		Person kazuma = new Person();
		
			kazuma.name = "加藤一真";
			
			kazuma.age = 26;
			
			kazuma.phoneNumber = "090-0000-0000";
			
			kazuma.address = "kazuma@gmail.com";
			
				System.out.println(kazuma.name);
				
				System.out.println(kazuma.age);
				
				System.out.println(kazuma.phoneNumber);
				
				System.out.println(kazuma.address);
				
				kazuma.talk();
				
				kazuma.walk();
				
				kazuma.run();
				
	}

}
