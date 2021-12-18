package OCP.Ex2;

public class Main {

	public static void main(String[] args) {
		
		Resource r ;
		ResourceAllocator ra;
		
		r= new TimeResource();
		ra = new ResourceAllocator(r);
		ra.free(ra.allocate());

		
		
		r= new SpaceResource();
		ra = new ResourceAllocator(r);
		ra.free(ra.allocate());
		
		
	}

}
