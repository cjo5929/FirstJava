package ch17;
// 직렬화 Serializable 인터페이스
//transient : 직렬화 하지 않으려는 멤버 변수에 사용함 (Socket등 직렬화 할 수 없는 객체)
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	String job;
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personAhn = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos =new ObjectOutputStream(fos)) {
			
			oos.writeObject(personKim);
			oos.writeObject(personAhn);
					
				}catch (IOException e) {
					// TODO: handle exception
				}
			try(FileInputStream fis =new FileInputStream("serial.out");
					ObjectInputStream ois = new ObjectInputStream(fis)){
				
				Person p1 = (Person)ois.readObject();
				Person p2 = (Person) ois.readObject();
				
				System.out.println(p1);
				System.out.println(p2);
			}catch (IOException e) {
				// TODO: handle exception
			}catch (ClassNotFoundException e) {
				// TODO: handle exception
			}
		

	}

}
