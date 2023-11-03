public class SortedOrNotsortedInArray {
    public static void main(String[] args) {
        int [] nu = {1,3,234452,32,434323,24434,233};
        //int [] nu = { 1 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        int n = nu.length;
        boolean sorted = true;
        for (int i =0 ; i < n-1 ; i++) {
            if (nu[i] > nu[i+1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("it is sorted ");            
        }
        else{
            System.out.println("it is not sorted ");
        }
            
        
    }
}
