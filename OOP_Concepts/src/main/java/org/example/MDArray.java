package org.example;

public class MDArray {
    public int[][] fillArray(int inputArray[][]){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                inputArray[i][j] = (int)(Math.random() * 10);
            }
        }
        return inputArray;
    }

    public void printArray(int inputArray[][]){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printUsingForEach(int inputArray[][]){
        for(int n[] : inputArray){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
