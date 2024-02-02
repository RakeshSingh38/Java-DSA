//public class bs {
//    Hey Everybody, I have tried solving Find position of an element in An Infinite array.
//and my approach is simple. 
//
//if(arr[0]==target) then return 0;
//and if not 
//then initialize start=0;
//end=1;
//
//since it is an infinite array, so we can find the actual length using .length property
//so, we can use while in a manner to find the range where our target element can be found.
//
//int start = 0;
//int end = 1;
//
//		while (arr[end] < target) {//if our target is right to the arr[end] then we enter inside loop
//			start = end;      //assign the end value to start so that our range will be smaller
//			if (arr[end] == target) {
//				return end;  //if we find the targe at end index then we simply return the end
//			} else if (arr[end] < target) {
//				end = end * 2; //and increase end by 2 times 
//			}
//		}
//
//		return  binarySearch(arr, start, end, target); // we will create a binary search function where we have start and end two pointers 
//
//Hope you liked my approach . 
//And now I will kunal's approach towards this problem.
//}
