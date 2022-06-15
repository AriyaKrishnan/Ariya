package jdk5above;

public class GrenericDemo1 {

	public static void main(String[] args) {
		//GoodPaintBrushVer3<Air>gp3=new GoodPaintBrushVer3<>();
		GoodPaintBrushVer3<Water>gp3=new GoodPaintBrushVer3<>();
		Water water=new Water();
		Air dryair=new Air();
		//gp3.setObj(dryair);
		//dryair=(Air)gp3.getObj();
		//dryair.dusting();
		gp3.setObj(water);
		water=(Water)gp3.getObj();
		water.sprinkle();
		

	}

}
class Water{
	public void sprinkle() {
		System.out.println("Water is Sprinkled..");
	}
}
class Air{
	public void dusting() {
		System.out.println("Dusting is Done..");
	}
	
}
class GoodPaintBrushVer3<T>{
	private T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}