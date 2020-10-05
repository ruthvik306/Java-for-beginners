public class Queue {

	int SIZE = 5;
	int items[] = new int[SIZE];
	int front, rear;

	Queue() {
		front = -1;
		rear = -1;
	}

	// check if the queue is full
	boolean isFull() {
		if (front == 0 && rear == SIZE - 1)
			return true;
		return false;
	}

	// check if the queue is empty
	boolean isEmpty() {
		if (front == -1)
			return true;
		return false;
	}

	// insert elements to the queue
	void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if (front == -1) {
				front = 0;
			}
			rear++;
			items[rear] = element;
			System.out.println("Insert " + element);
		}
	}

  // delete element from the queue
  	int deQueue() {
		int element;
		// if queue is empty
		if (isEmpty()) {
	  		System.out.println("Queue is empty");
		}
		else {
			element = items[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}
			System.out.println( element + " Deleted");
			return (element);
		}
  	}

	// display element of the queue
	void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		}
		else {
			System.out.println("\nFront index-> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(items[i] + "  ");
			System.out.println("\nRear index-> " + rear);
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.deQueue();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(6);
		q.display();
		q.deQueue();
		q.display();
	}
}