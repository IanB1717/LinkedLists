import java.util.*;
public class LinkedListLab9
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		List myList = new List();
		/* all of your insert,
		               remove,
		               display
		   commands in this section*/
		   int size = sc.nextInt();

		   for(int i=0;i<size+1;i++)
		   {
		   		String input=sc.nextLine();
		   		myList.insert(input);

		   }

		   myList.displayList();

		   myList.first.next.next.next = myList.first;

		   
           int amount=myList.detectLoop();
		   if(amount>0)
		   {
		   	System.out.println(amount);
		   }            
		   else
		   {
		   	System.out.println("The List has no loops in it."+
		   		               " The amount of loops found was "+0);
		   }
	}
}
class Link
{
	public String dData;
	public Link next;

	public Link(String dd)
	{
		dData=dd;
	}
	public void displayLink()
	{
		System.out.println(dData+" ");
	}
}
class List
{
	public Link first;
	
	public void sortedList()
	{
		first=null;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public void insert(String key)
	{
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;

		while(current!= null && key.length()>=current.dData.length())
		{
			previous=current;
			current=current.next;
		}
		if(previous==null)
		{
			first=newLink;
		}
		else
		{
			previous.next=newLink;
			newLink.next=current;
		}
	}
	public Link remove()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	public void displayList()
	{
		System.out.println("List(first-->last): ");
		Link current = first;
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
	 int detectLoop() 
    { 
        Link slow = first, fast = first;
        while (slow!=null && fast.next != null)
         { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) 
            { 
                return 1;
            } 
        } 
        return 0;
    } 
}