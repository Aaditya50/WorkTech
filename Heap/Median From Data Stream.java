class MedianCalculator {
    /** initialize your data structure here. */
	PriorityQueue<Integer> left ;
	PriorityQueue<Integer> right;
    public MedianCalculator() {
		left = new PriorityQueue<>(Collections.reverseOrder());
		right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
		left.add(num);
		right.add(left.remove());
		if(left.size()<right.size()){
			left.add(right.remove());
		}
    }
    
    public float getMedian() {
		if(left.size() == right.size()){
			int i=left.peek();
			int j=right.peek();
			return (float)(i+j)/2;
		}
		return (float)left.peek();
    }
}

/**
 * Your MedianCalculator object will be instantiated and called as such:
 * MedianCalculator obj = new MedianCalculator();
 * obj.addNum(num);
 * float median = obj.getMedian();
 */
