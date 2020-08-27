package apiTest;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SerializationImplement si=new SerializationImplement();
//Restassured will look at the java object 'si' and map its associated POJO class & it will map the object's setters to the POJO class &
//will create JSON at rutime & send the JSON to the endpoint.
si.setName("test1");
si.setAge("23");
si.setSalary("123");

//deserialization:
//Opposite of serialization.We can get the values:

System.out.println(si.getName());
System.out.println(si.getSalary());
System.out.println(si.getAge());

	}

}
