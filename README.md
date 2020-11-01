# Java2
java课程作业仓库
实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2.掌握面向对象的类设计方法（属性、方法）；
3.掌握类的继承用法，通过构造方法实例化对象；
4.学会使用super()，用于实例化子类；
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

实验要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

实验过程
1.编辑学生、老师、课程信息
2.创建学生类将信息用变量输入并赋值
3.分别创建老师和课程信息类输入并赋值
4.输出结果
5.检查代码，运行并输出

核心方法
................

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
 ................         
 
实验结果
![image](https://github.com/Dark-less/Java2/blob/main/images/1604241055(1).jpg}

编程感想
这次的实验不仅让我编出一个简单的程序，还使我提高了逻辑运算，使以后所编的代码更有逻辑性，更加清楚直白。掌握子类继承父类的用法，学会使用super去（）实化子类，一些不明白的知识点通过网络和询问同学也都已经解决，是我受益匪浅。
