import java.util.*;
public class LinkedListLab9Strings
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		LinkedList myList = new LinkedList();

		/* all of your insert,
		               remove,
		               display
		   commands in this section*/
		   int size = sc.nextInt();

		   for(int i=0;i<size+1;i++)
		   {
		   		String word=sc.nextLine();
		   		Link input = new Link(word);
		   		myList.insertHead(input);

		   }
		   /*
		   test case for loop not given by dr.maguire in code
		   myList.first.next.next.next = myList.first;
		     */
		    System.out.println(myList.findLoopLength());
	  }
 }
		     public static int findLoopLength(LinkedList mylist)
        {
        int count=0;
        Link slow = mylist.first, fast = mylist.first;
        while (slow!=null && fast.next != null)
         {

            slow = slow.next;
            fast = fast.next.next;
            if (slow.data == fast.data)
            {
                count=1;
                fast=fast.next;
                while(slow!=fast)
                {
                    count++;
                    fast=fast.next;
                }
                return count;

            }
        }
        return 0;
    }


 class Link{
        public String data;
        public Link next;
        public Link previous;

            public Link(String input){
                data=input;
                next=null;
                previous=null;
            }
        }

        class LinkedList {
        public Link first;
        public Link last;

        public LinkedList( )
        {
        first=null;
        last=null;
        }

        public boolean isEmpty( )
        {
        return (first==null);
        }

            public void insertHead(Link insert)
            {
                if(isEmpty())
                {
                    first=insert;
                    last=insert;
                }
                else
                {
                    first.previous=insert;
                    insert.next=first;
                    first=insert;
                }
            }
        }]





       