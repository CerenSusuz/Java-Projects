package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setClaim("admin");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setEmail("engin@engin.com");
		instructor.setAboutMe("Yaz�l�m geli�tirmeye lisede \"yaz�l�m\" b�l�m�nde okurken ba�lad�m.\r\n"
				+ "\r\n"
				+ "�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m. S�ras�yla Ba�kent ve ODT�'de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum. Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m.\r\n"
				+ "\r\n"
				+ "A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum.\r\n"
				+ "\r\n"
				+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahibim.\r\n"
				+ "\r\n"
				+ "\"Engin Demiro�\" YouTube kanal�mda �cretsiz e�itim videolar� ve i�erikleri payla�maktay�m.\r\n"
				+ "\r\n"
				+ "Dan��manl�k yapt���m kurumlar�n baz�lar� : Merkez Bankas�,TAI, Birle�mi� Milletler,NATO,�� Bankas�, Akbank, Halkbank, Vak�fbank, Yap� Kredi Bankas�, Ziraat Bankas�, Emniyet, Ba�bakanl�k, Cumhurba�kanl���, Hazine M�ste�arl���, Maliye Bakanl���, Tar�m Bakanl���, T�bitak.\r\n"
				+ "\r\n"
				+ "Dan��manl�k veya e�itim verdi�im kurum say�s� son 10 y�lda 300'� ge�mi�tir.\r\n"
				+ "\r\n"
				+ "DevFramework ismiyle geli�tirdi�im altyap� projem bir�ok kurum ve firmada yaz�l�m geli�tirme altyap�s� olarak kullan�lmaktad�r.");
		instructor.setId(1);
		instructor.setPassword("123456");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.login();
		instructorManager.logout();
		
		System.out.println("---------------");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ceren");
		student.setLastName("Susuz");
		student.setEmail("ceren@ceren.com");
		student.setPassword("123");
		student.setClaim("user");
		student.setAttendanceLevel(0);
		student.setComment(null);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.login();
		studentManager.login();
		
		System.out.println("---------------");
		
		User[] users = {instructor,student};
		instructorManager.getUserList(users);
		
		
		System.out.println("---------------");
		
		int attendanceLevel = 20;
		String comment = "perfect course";
		studentManager.addComment(attendanceLevel, comment);
		
	}

}
