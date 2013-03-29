class ReversePair
{
        static class Node
        {
                int data;
                Node next;
				
                Node(int data)
                {
                        this.data = data;
                        next =null;
                }
        }
		
		
        public static Node head = null;


public void reversePairRecursive(Node n)
{
         int temp;
         if(n==null || n.next ==null)
           return; //base case for empty or 1 element list
         else 
         {
		 
		 // its just swapping
		//Reverse first pair
		temp = n.data;
		n.data = n.next.data;
		n.next.data = temp;

		//Call the method recursively for the rest of the list
		reversePairRecursive(n.next.next);
	}

}


/**
* Reverse the linkedlist in pairs -Iterative version
* @param n
*/
public void reversePairIterative()
{
	Node current = head;
	int temp;

	while(current != null && current.next != null)
	{
		//Swap the pair
		temp = current.data;
		current.data = current.next.data;
		current.next.data= temp;

		//Advance the current pointer twice
		current = current.next.next;
	}
}




private void push(int data)
        {
                Node newnode= new Node(data);
                newnode.next = head;
                head = newnode;

        }
		
        public void printList(Node node)
        {	
                while (node != null)
                {
                        System.out.println(node.data);
                        node = node.next;
                }
        }
		
		
        public static void main(String args[])
        {
               ReversePair kll = new ReversePair();
               kll.push(8);
               kll.push(7);
               kll.push(6);
               kll.push(5);
               kll.push(4);
               kll.push(3);
               kll.push(2);
               kll.push(1);

               kll.printList(kll.head); 
			   
               kll.reversePairRecursive(kll.head);  
               System.out.println("===========================");
               kll.printList(head);
			   
			   /*  for iterative case.........
               kll.printList(kll.head); 
               kll.reversePairIterative();  
               System.out.println("===========================");
               kll.printList(head); */
			   


        }
}

