class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        
        if (max.isEmpty() || num <= max.peek()){
            max.offer(num);
        } else {
            min.offer(num);
        }

        if (max.size() > min.size() + 1) {
            min.offer(max.poll());
        }

        if (min.size() > max.size()) {
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if (max.size() > min.size()) {
            return (max.peek() / 1.0);
        }

        return ((max.peek() + min.peek()) / 2.0);
    }
}
