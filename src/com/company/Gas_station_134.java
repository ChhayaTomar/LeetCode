package com.company;

public class Gas_station_134 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasAtI=0;
        int sum=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            gasAtI+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(gasAtI<0){
                start=i+1;
                gasAtI=0;
            }
        }
        if(sum<0) return -1;
        return start;
    }
}
