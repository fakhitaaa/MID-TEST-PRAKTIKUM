public class main {
	public static void main(String[] args){
		
		bangundatar bdt = new bangundatar();
		persegi persegi = new persegi (9);
		lingkaran lingkaran = new lingkaran (19);
		
		bdt.luas();
		
		System.out.println("Luas persegi: " + persegi.luas());
		System.out.println("Luas lingkaran: " + lingkaran.luas());
	}
}