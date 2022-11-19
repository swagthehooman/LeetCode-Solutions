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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged=new ListNode(-101);
        ListNode p=list1, q=list2;
        ListNode temp=merged;
        if(list1==null && list2==null)
            return null;
        if(list1!=null && list2==null)
            return list1;
        if(list1==null && list2!=null)
            return list2;
        while(p!=null && q!=null){
            if(p.val<=q.val){
                ListNode var=new ListNode(p.val);
                temp.next=var;
                temp=var;
                p=p.next;
            }
            else{
                ListNode var=new ListNode(q.val);
                temp.next=var;
                temp=var;
                q=q.next;
            }
        }
        while(p!=null){
            ListNode var=new ListNode(p.val);
            temp.next=var;
            temp=var;
            p=p.next;
        }
        while(q!=null){
            ListNode var=new ListNode(q.val);
            temp.next=var;
            temp=var;
            q=q.next;
        }
        merged=merged.next;
        return merged;
    }
}