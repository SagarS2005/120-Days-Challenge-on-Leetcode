class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0 , low = 0 ;
        for( int i : weights ) {
            high += i ;
            low = Math.max( low , i ) ;
        }
        return find( low , high , weights , days , 0 );
    }
    private int find(int start , int end , int  w[] , int  days , int res ) {
        int d = days;
        if( start > end )   return  res ;
        int mid = start + ( end - start ) / 2 , i = 0 ;
        while( i < w.length ) {
            int sum = 0 ;
            while( i < w.length && sum + w[i] <= mid ){
                sum += w [ i++ ];
            }
            d -- ;
            if( d < 0 )    return find( mid + 1 , end , w , days ,res ) ;
        }if( d >= 0 )    return find( start , mid - 1 , w , days ,mid ) ;
        else    return   find( mid + 1 , end , w , days , res ) ;
    }
}