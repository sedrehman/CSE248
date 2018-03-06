package composition;

public class BookBag {
	private Queue queue;
	private int nElems;
	
	public BookBag(int maxSize) {
		queue = new Queue(maxSize);
		nElems = 0;
	}
}
