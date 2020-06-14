/********************
973. K Closest Points to Origin

We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
(Here, the distance between two points on a plane is the Euclidean distance.)
You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
********************/

class Solution {
    public int[][] kClosest(int[][] points, int K) {
     
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>(){
            @Override
            public int compare(int left[],int right[]){
                return getDistance(right) - getDistance(left);   
           } 
        });
        
        for(int[] point: points){
            heap.add(point);
            if(heap.size()>K){
                heap.poll();
            }
        }
        
        int[][] answer = new int[K][2];
        
        while(K>0){
            answer[--K] = heap.poll();
        }
        return answer;
    }
    
    
    public int getDistance(int arr[]){
        return (arr[0]*arr[0]) + (arr[1]*arr[1]);
    }
}