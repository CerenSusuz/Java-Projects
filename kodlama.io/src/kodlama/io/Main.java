package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setClaim("admin");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@engin.com");
		instructor.setAboutMe("Yazýlým geliþtirmeye lisede \"yazýlým\" bölümünde okurken baþladým.\r\n"
				+ "\r\n"
				+ "Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým. Sýrasýyla Baþkent ve ODTÜ'de Yönetim Biliþim Sistemleri (Lisans-Burslu) ve Týp Biliþimi(Yüksek Lisans) okudum. Profesyonel iþ hayatýma ise henüz üniversite birinci sýnýftayken baþladým.\r\n"
				+ "\r\n"
				+ "Aðýrlýklý olarak Savunma Sanayisi, Bankacýlýk sektörlerine kurumsal yazýlým geliþtirme süreçleri konusunda danýþmanlýk veriyorum.\r\n"
				+ "\r\n"
				+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim.\r\n"
				+ "\r\n"
				+ "\"Engin Demiroð\" YouTube kanalýmda ücretsiz eðitim videolarý ve içerikleri paylaþmaktayým.\r\n"
				+ "\r\n"
				+ "Danýþmanlýk yaptýðým kurumlarýn bazýlarý : Merkez Bankasý,TAI, Birleþmiþ Milletler,NATO,Ýþ Bankasý, Akbank, Halkbank, Vakýfbank, Yapý Kredi Bankasý, Ziraat Bankasý, Emniyet, Baþbakanlýk, Cumhurbaþkanlýðý, Hazine Müsteþarlýðý, Maliye Bakanlýðý, Tarým Bakanlýðý, Tübitak.\r\n"
				+ "\r\n"
				+ "Danýþmanlýk veya eðitim verdiðim kurum sayýsý son 10 yýlda 300'ü geçmiþtir.\r\n"
				+ "\r\n"
				+ "DevFramework ismiyle geliþtirdiðim altyapý projem birçok kurum ve firmada yazýlým geliþtirme altyapýsý olarak kullanýlmaktadýr.");
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
