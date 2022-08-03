public class merge{
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

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // We are given the head of two sorted Linked lists

            ListNode head = null;
            ListNode result = null;

            //If one list is null, return the other list
            if(list1 == null)
                return list2;
            if(list2 == null)
                return list1;

            //Now that we know that both lists have values, we want to iterate over the lists while they are not null
            while(list1 != null && list2 != null){
                // This works if one list is smaller than the other list,
                // We have two different headers for each list.
                if(list1.val <= list2.val){
                    if(head == null){
                        head = list1;
                        result = list1;
                    }
                    else{
                        //move on to the next node
                        head.next = list1;
                        head = head.next;
                    }
                    list1 = list1.next;
                }
                else if(list1.val > list2.val){
                    //Conduct similar steps to prev. condition
                    if(head == null){
                        head = list2;
                        result = list2;
                    }
                    else{
                        //move on to the next node
                        head.next = list2;
                        head = head.next;
                    }
                    list2 = list2.next;
                }

            }

            // What if one list ends sooner than the other list?
            // We assign the next pointer to the list of the other list to get the rest of the values
            if(list1 == null)
                head.next = list2;

            if(list2 == null)
                head.next = list1;
            return result;
        }
    }
}
