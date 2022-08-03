public class merge{

    static class Solution {
        public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
            // Goal is to merge list1 and list2 as ONE Sorted List
            return list1;
        }
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            list.insert(i);
        }
        list.print();
        solution.mergeTwoLists(list, list);
    }
}
