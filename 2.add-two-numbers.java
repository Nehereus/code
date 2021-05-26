/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n= null;
        int counter = 0;
            if (calNode( l1, l2,counter) !=null){
               n= calNode(l1,l2,counter);
            }
            return n;
        }
        
    

    public ListNode calNode(ListNode l1, ListNode l2, int counter){
        int temp=l1.val+l2.val+counter;
        int counter1 =0;
        int result = (temp) % 10;
        if (temp>9){
         counter1 = 1;
    }
        if((l1.next!= null)&&(l2.next!= null)){
            return (new ListNode(result, calNode(l1.next,l2.next,counter1)));
    }else if((l1.next!= null)&&(l2.next == null)){
            return (new ListNode(result, calNode(l1.next,new ListNode(0),counter1)));
    }else if((l2.next!= null)&&(l1.next== null)){
        return (new ListNode(result, calNode(new ListNode(0),l2.next,counter1)));
}   
    if(temp<=9)
    return (new ListNode(temp, null));
    if(temp>9)
    return (new ListNode(result, new ListNode(1)));
    return null;
}
}
// @lc code=end

