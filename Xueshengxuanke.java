package system;

public class Xueshengxuanke {
	    public static void main(String[] args) {
	        System.out.println("******************ѧ����Ϣ*********************");
	        Student xm = new Student();
	        xm.setName("������");
	        xm.setAge(20);
	        xm.setNumber(201938250);
	        xm.setSex("Ů");
	        System.out.println("ѧ������:" + xm.getName());
	        System.out.println("ѧ������:" + xm.getAge());
	        System.out.println("ѧ�����:" + xm.getNumber());
	        System.out.println("ѧ���Ա�:" + xm.getSex());

	        System.out.println("******************��ʦ��Ϣ*********************");
	        Teacher cdm = new Teacher();
	        cdm.setName("���ʦ̫");
	        cdm.setAge(18);
	        cdm.setNumber(200000000);
	        cdm.setSex("Ů");
	        cdm.setLesson_1("����");
	        System.out.println("�ڿν�ʦ:" + cdm.getName());
	        System.out.println("��ʦ����:" + cdm.getAge());
	        System.out.println("��ʦ���:" + cdm.getNumber());
	        System.out.println("��ʦ�Ա�:" + cdm.getSex());

	        System.out.println("******************�γ���Ϣ*********************");
	        Lesson_1 xxds = new Lesson_1();
	        xxds.setName("����");
	        xxds.setTime("ÿ���� ����7:00-9:40");
	        xxds.setNumber(12138);
	        xxds.setPlace("������");
	        System.out.println(xxds.toString());

	        System.out.println("******************�γ�����*********************");
	        System.out.println("ѡ�γɹ�");

	    }

	}


	class People{
	    public People(){

	    }
	    public People(String name,int age,int number,String sex){
	        this.name = name;
	        this.age = age;
	        this.number = number;
	        this.sex = sex;
	    }

	    private String name;
	    private int age;
	    private int number;
	    private String sex;

	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getSex() {
	        return sex;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	            this.age = age;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setSex(String sex) {
	        this.sex = sex;
	    }

	}

	class Student extends People{
	    public Student(){

	    }
	    public Student(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	}

	class Teacher extends People{
	    public Teacher(){

	    }
	    public Teacher(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	    String lesson_1;
	    public String getLesson_1() {
	        return lesson_1;
	    }
	    public void setLesson_1(String lesson_1) {
	        this.lesson_1 = lesson_1;
	    }


	}


	class Lesson{
	    public Lesson(){

	    }
	    public Lesson(String name,String time,int number,String place){
	        this.name = name;
	        this.time = time;
	        this.number = number;
	        this.place = place;
	    }

	    private String name;
	    private String time;
	    private int number;
	    private String place;


	    public String getName() {
	        return name;
	    }
	    public String getTime() {
	        return time;
	    }

	    public String getPlace() {
	        return place;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setTime(String time) {
	        this.time = time;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setPlace(String place) {
	        this.place = place;
	    }

	}


	class Lesson_1 extends Lesson{
	    public Lesson_1(){

	    }
	    public Lesson_1(String name,String time,int number,String place){
	        super(name, time, number, place);
	    }
	    public String toString() {
	        return "�γ����ƣ�" + getName()+ "\n" + "�Ͽ�ʱ�䣺" + getTime() + "\n" + "�γ̱�ţ�" + getNumber()+ "\n" + "�ڿεص㣺" + getPlace()+ "\n";
	    }
	}

