class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, start = 0, currentGas = 0;
        for(int i=0;i<gas.length;i++) {
            totalGas+=gas[i];
            totalCost+=cost[i];
            currentGas+=(gas[i]-cost[i]);
            if(currentGas<0) {
                start = i+1;
                currentGas = 0;
            }
        }
        return totalGas<totalCost ? -1 : start;
    }
    public static void main(String[] args) {
        GasStation g = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(g.canCompleteCircuit(gas,cost));
    }
}