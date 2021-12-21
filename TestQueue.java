package StacknQueue;

public class TestQueue {
	
	public static void main(String[] args) {
		
        TestQueue queue = new TestQueue();  
    }

	private void EnQueue(int i) {

        TestQueue queue = null;
		queue.EnQueue(56);
        queue.EnQueue(30);
        queue.EnQueue(70);
		
	}
	private void DeQueue() {
        TestQueue queue = null;
		queue.DeQueue();
        queue.DeQueue();
        queue.DeQueue();
		
	}

	private void display() {
        
		TestQueue queue = null;
        queue.display();
        queue.display();
        queue.display();
		
	}

	}


