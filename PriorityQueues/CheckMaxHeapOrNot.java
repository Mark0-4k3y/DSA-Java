package PriorityQueues;

public class CheckMaxHeapOrNot
{
    //Using Leaf Non Leaf nodes method.
    public static boolean checkMaxHeap(int arr[])
    {
        int nonLeafNodeIndex = (arr.length/2) - 1;

        for(int parentIndex = nonLeafNodeIndex; parentIndex>=0; parentIndex--){

            int leftChildIndex = (parentIndex*2) + 1;
            int rightChildIndex = leftChildIndex + 1;

            if(arr[leftChildIndex] > arr[parentIndex]) return false;
            if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[parentIndex]) return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[] arr={42, 20, 18, 6, 14, 11, 9, 4};
        System.out.println("Is this is max heap priority queue?! "+checkMaxHeap(arr));
    }
}


// public class Solution {
// public static boolean maxHeapProperty = true;
// 	public static boolean checkMaxHeap(int arr[]) {
// 		/* Your class should be named Solution
// 		 * Don't write main().
// 		 * Don't read input, it is passed as function argument.
// 		 * Return output and don't print it.
// 	 	 * Taking input and printing output is handled automatically.
// 		 */
//         int parentIndex, leftChildIndex, rightChildIndex;
// 		for (int i = 0; i < arr.length; i++) {
// 			parentIndex = i;
// 			leftChildIndex = 2 * parentIndex + 1;
// 			rightChildIndex = 2 * parentIndex + 2;
// 			if (leftChildIndex < arr.length) {
// 				if (arr[parentIndex] < arr[leftChildIndex]) {
// 					maxHeapProperty = false;
// 					break;
// 				}
// 				if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]) {
// 					maxHeapProperty = false;
// 				}
// 			}
// 		}
// 		return maxHeapProperty;
// 	}
// }
