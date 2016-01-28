package design;

import java.util.Iterator;

public class _284_PeekingIterator {
private Iterator<Integer> iterator;
	
	private Integer peek;
	
	private boolean hasPeek;

	public _284_PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		this.iterator = iterator;
		this.peek = null;
		this.hasPeek = false;
	    
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (hasPeek) {
			return this.peek;
		}else{
			this.peek = iterator.next();
			this.hasPeek = true;
			return this.peek;
		}
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	public Integer next() {
	    if (hasPeek) {
			this.hasPeek = false;
			Integer tmp = this.peek;
			this.peek = null;
			return tmp;
		}else{
			return iterator.next();
		}
	}

	public boolean hasNext() {
	    return (hasPeek || iterator.hasNext());
	}

}
