package com.question2.doublylinkedlist;

//Java Program to create a doublylinked and to rotate the doubly linked list by N node
public class DoublyLinkedList {
	
	//Node  class will create the doubly linked list
	class Node
	{
 		 int info;   //info is a value type which will store the element 
		 Node next;  // next will store the reference of next node
		 Node prev;  //prev will store the reference of prev node as 
		 Node(int info) //constructor which will initialize the info element with value
		 {
			 this.info=info;
		 }
    }

	Node head=null;       //head is the refernce which will refer to the begining of doubly linked list
	
	void insertAtBegining(int info)   //this method will insert the element at the begining
	{
		
		Node newNode=new Node(info);    //creating an instance of newNode
		
		if(head==null)              //If the node is the first node means it is pointing to null
		{ 
			head=newNode;           // head will refer to the newNode means it is the first node
			return;
		}
		
		newNode.next=head;             //else newNode will become the firstNode so next refernce is 
		head.prev=newNode;            //updated for newNode and in the prev refernce of head will point 
		head=newNode;                 // to the newNode so next and prev reference are updated
	}
	
	
	//This method will insert the element in doubly Linked list at the end
	void insertAtEnd(int info)
	{
		Node newNode=new Node(info);  // Creating a new instance of Node class
		
		
		if(head==null)                // if head is null so we have invoked already created insertAtBegining method 
		{                             // and returned
			insertAtBegining(info);
			return;
		}
		Node t=head;                   //else we have the taken a t refernce and took the starting link which is
		                               // stored in head because head will always refer to the first node 
		while(t.next!=null)            // and we have iterated till we reach the end
		{
			t=t.next;
		}
		
 		t.next=newNode;                     //Now we have updated the refernces to form the new link 
		newNode.prev=t;
		
	}
	//This method will print the elements which are stored in the linked list
	void printELements()
	{
		Node n=head;           //we took the starting of the doubly linked list and iterate and traverse the list
		while(n!=null)          // unless and until we reach the end
		{
			System.out.println(n.info);
			n=n.next;
		}
	}
	
    // Method to rotate doubly linked list by N nodes.
    public void rotateListByN_Node(int nodepos)
    {
    	//If the position is 0 then we will return
        if (nodepos == 0) {
            return;
        }
        
        Node currNode = head;
        //Move to the current node at the specified position
        while (nodepos != 0) {
            currNode = currNode.next;
            nodepos--;
        }
        
        //save the address in the lastNode which current node is previously pointing so that
        // links cannot be broken
        
        Node last = currNode.prev;
        
        //head1 will point to the currentNode because currentNode is the node which will become the headNode
        // for the List rotation so currentNode will become the head node after rotation.
        
        Node head1 = currNode;
        
        last.next = null;
        currNode.prev = null;
        
        // Now we will iterate the doublyLinked list and update the references
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = head;
        head.prev = currNode;
        head = head1;
    }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("DoublyLinkedList elements");

			DoublyLinkedList d=new DoublyLinkedList(); //creating the instance of doublylinkedlist class
			d.insertAtBegining(1);                     // forming the link and adding the elements to the list
			d.insertAtEnd(2);                         // by invoking insertAtBegining and insertAtEnd method
			d.insertAtEnd(3);
			d.insertAtEnd(4);
			d.insertAtEnd(5);
			
			System.out.println("Original List:");
			d.printELements();                                  //Printing the original list before rotation
			
			d.rotateListByN_Node(3);                           // Calling rotateListByN_Node method to rotate the list
			
			System.out.println("Updated List:");
			d.printELements();                               // Printing Updated list.
			
			
	}

}
