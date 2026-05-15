class Solution {
    public int trap(int[] a) {
        int leftboundary[]=new int[a.length];
        int rightboundary[]=new int[a.length];

        int leftmaxBoundary=0;
        int rightMaxBoundary= 0;
        int j=a.length;
        for(int i=0; i<a.length; i++){
            leftmaxBoundary=Math.max(leftmaxBoundary, a[i]);
            leftboundary[i]=leftmaxBoundary;
            System.out.print(leftboundary[i] + " ");
        }
        System.out.println();
        for(int i=a.length-1; i>=0; i--){
            rightMaxBoundary=Math.max(rightMaxBoundary, a[i]);
            rightboundary[i]=rightMaxBoundary;
            // System.out.println(i);
            System.out.print(rightboundary[i] +" ");
        }
        System.out.println();
        int i=0;
        int Total_Area=0;
        while (i<a.length) {
            int waterLevel=Math.min(leftboundary[i],rightboundary[i]);
            int  area=waterLevel-a[i];
            Total_Area += area;
            
            i++;
        }
        return Total_Area;
    }
}