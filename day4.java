/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode create(int num)
    {
        ListNode temp=new ListNode(num,null);
        return temp;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        // Checking the base cases 
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode ans=new ListNode(0,null);
        ListNode currentNode=ans;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                currentNode.next=create(l1.val);
                currentNode=currentNode.next;
                l1=l1.next;
            }
            else
            {
                currentNode.next=create(l2.val);
                currentNode=currentNode.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
                currentNode.next=create(l1.val);
                currentNode=currentNode.next;
                l1=l1.next;
        }
        while(l2!=null)
        {
                currentNode.next=create(l2.val);
                currentNode=currentNode.next;
                l2=l2.next;   
        }
        return ans.next;
        
    }
}