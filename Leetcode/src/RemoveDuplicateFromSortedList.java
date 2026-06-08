 class ListNode
{
    ListNode next;
    int val;
    ListNode(int val,ListNode next)
    {
        this.next=next;
        this.val=val;
    }
    ListNode(int val)
    {
        this.val=val;
    }

}
 class RemoveDuplicateFromSortedList {

    public static void deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node.next!=null)
        {
            int val=node.val;
            int nextval=node.next.val;
            if(val== nextval)
            {
                node.next=node.next.next;
            }
            else
            {
                node=node.next;
            }
        }
    }

     public static void main(String[] args) {
         ListNode head=new ListNode(1);
         head.next=new ListNode(1);
         head.next.next=new ListNode(2);
         head.next.next.next=new ListNode(2);
         printNode(head);
         deleteDuplicates(head);
         printNode(head);
     }

     public static void printNode(ListNode head)
     {
         ListNode n=head;
         while(n!=null)
         {
             System.out.print(n.val+"->");
             n=n.next;
         }
         System.out.println();
     }
}
