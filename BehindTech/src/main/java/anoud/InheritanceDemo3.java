package anoud;

public class InheritanceDemo3 {
public static void main(String[] args) {
	
	AmericanPlug americanPlug=new LenovaPlug();
	ShakthiSocket indianSocket=new ShakthiSocket();
	IndianAdapter adapter =new IndianAdapter(americanPlug);
	indianSocket.roundPinHole(adapter);
}
}
abstract class IndianPlug{
	public abstract void roundPin();
}
abstract class IndianSocket{
	public abstract void roundPinHole(IndianPlug ip);
}
abstract class AmericanPlug{
	public abstract void slabPin();
}
abstract class AmericanSocket{
	public abstract void slabPinHole(AmericanPlug ap);
}
class ShakthiPlug extends IndianPlug{
	@Override
	public void roundPin() {
	
		System.out.println("Shakthi Plug is Working...");
	}
}

class ShakthiSocket extends IndianSocket{
	@Override
	public void roundPinHole(IndianPlug ip) {		
		
		ip.roundPin();
	}
}
class IndianAdapter extends IndianPlug{
	AmericanPlug ap;
	public IndianAdapter() {
		
	}
	public IndianAdapter(AmericanPlug ap) {
		this.ap=ap;
	}
	@Override
	public void roundPin() {
		
		ap.slabPin();
	}

}
class LenovaPlug extends AmericanPlug{
	@Override
	public void slabPin() {
		System.out.println("American Slab Pin Plug is Working...");
	}
}
