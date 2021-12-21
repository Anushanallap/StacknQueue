package StacknQueue;

import java.util.LinkedList;

public class Queue {
	
	 LinkedList<Integer> queue = new LinkedList<>();

	    public void enQueue(int data) {
	        queue.addLast(data);
	    }
	    public void deQueue() {
	        if(queue.size() != 0) {
	            queue.pop();
	        }
	        else {
	            System.out.println("queue Is empty");
	            return;
	        }
	        
	    }
	        public void display() {
	            System.out.println("---elements In queue---");
	          
	            }
	    }

	


