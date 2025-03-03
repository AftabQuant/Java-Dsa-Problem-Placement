package ArraysAndHashing;

import java.util.*;

public class _22PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray1(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int ele: nums){
            if(ele<pivot) smaller.add(ele);
            else if(ele==pivot) equal.add(ele);
            else greater.add(ele);
        }
        for(int i=0; i<smaller.size(); i++) nums[i] = smaller.get(i);
        for(int i=0; i<equal.size(); i++) nums[i+smaller.size()] = equal.get(i);
        for(int i=0; i<greater.size(); i++) nums[i+smaller.size()+equal.size()] = greater.get(i);
        return nums;
    }
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0;
        for (int num : nums) {
            if (num < pivot) result[left++] = num;
        }
        for (int num : nums) {
            if (num == pivot) result[left++] = num;
        }
        for (int num : nums) {
            if (num > pivot) result[left++] = num;
        }
        return result;
    }
}

