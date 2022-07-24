class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet();
        for(int num : nums1){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList();
        for(int num: nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}