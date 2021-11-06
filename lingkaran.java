public class lingkaran extends bangundatar{
	int r;
	
	public l ingkaran (int r){
		this.r = r;
	}
	
	@Override
	public float luas(){
		return (float) (Math.PI * r * r);
	}
	
}