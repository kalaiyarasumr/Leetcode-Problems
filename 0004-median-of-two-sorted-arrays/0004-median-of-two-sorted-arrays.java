class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;

        int merged[]= new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                merged[k++]=nums1[i++];
                
            }else{
                merged[k++]=nums2[j++];
            
            }
        }

        while(i<n){   
            merged[k++]=nums1[i++];
          
        }
        while(j<m){   
            merged[k++]=nums2[j++];
           
        }

        int p=merged.length;
       int start=0;
       int end=p-1;
       double ans=0.0;
        if(p%2!=0){ 

       int mid=start+(end-start)/2;

       ans=(double) merged[mid];
        }
        else{  
            int mid=start+(end-start)/2;
            ans=(merged[mid]+merged[mid+1])/2.0;
            
        }
        return ans;   
    }
 
}  

