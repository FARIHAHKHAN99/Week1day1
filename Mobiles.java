package week1.day1;

public class Mobiles {
	
	public void makeCall() {
		
    String mobileModel= "samsung galaxy";
	float mobileWeight=150f;
				
		System.out.println("this is fariha's mobile");
	}
public void sendMsg() {
	
	boolean FullyCharged= true ;
    int mobileCost= 15000;
	
    System.out.println("its expensive");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobiles mob= new Mobiles();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("this is fariha's samsung galaxy a30");
	}
}
