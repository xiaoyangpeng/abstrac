package 抽象类;

//，这样的类就是抽象类；抽象来除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法、初始化块和构造方法和普通类一样。由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
abstract class jaja{
	int a=55;
	 public int b;//抽象类可以存在构造方法,用来初始化抽象类的属性,
	 //虽然可以用，但是不对	final int miembro=7;//抽象类不能使用final定义,
	
	abstract public int prueba1(); // 抽象办法，什么也不做，但是，在子类必须，重写这个类
	

	
}


public class 抽象类  extends jaja {
		int a=111;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	////错误，抽象类不能被实例化，也就是说不能创建对象
	//	jaja i=new jaja();
		抽象类  prueba=new 抽象类();
		System.out.println(prueba.prueba1());
		
	}
	//@Override // 重写  只要写了这个，我们重写的类在父亲类里没有那么方法就会出错，或者我们想重写父亲的方法但是写错了大小写之类的也是错的
	public int prueba1() {//重写了抽象办法prueba1
		// TODO Auto-generated method stub
		return 99;
	}
	
/*	@Override // 这里我们写了overrride 想要重写 父亲类的prueba1方法， 但是写错了大小写，所以会出错
	public int Prueba1() {//重写了抽象办法prueba1
		// TODO Auto-generated method stub
		return 0;
	}*/
	
}
