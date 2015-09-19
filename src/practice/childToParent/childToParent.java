package practice.childToParent;

public class childToParent {
//子类的对象的引用赋值给父类的对象
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.canSpeak();
		child1.canMakeMoney();
		//child2是上转型对象，该对象就变成父类对象，不能有子类的新方法，新变量。
//		上转型的好处与坏处：
//
//		好处：父类可以操作子类覆盖的方法。
//
//		坏处：父类丧失了对子类新增成员变量和成员方法的操作。
		Parent child2 = new Child();
		child2.canMakeMoney();
		//强制转换为原来的子类对象
		Child child3 = (Child)child2;
		
		

	}
    
}
