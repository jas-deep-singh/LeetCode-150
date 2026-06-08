class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length, sum = 0;
        int[] count = new int[n+1];
        for(int i=0;i<n;i++) {
            count[Math.min(citations[i], n)]+=1;
        }
        for(int h=n;h>=0;h--) {
            sum+=count[h];
            if(sum>=h) {
                return h;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        HIndex h = new HIndex();
        int[] citations = {3,0,6,1,5};
        System.out.println(h.hIndex(citations));
    }
}