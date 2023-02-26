package org.example;

public class JaggedArray {

    public int[][] fillArray(int inputArray[][]){

        inputArray[0] = new int[(int)(Math.random()*10)];
        inputArray[1] = new int[5];
        inputArray[2] = new int[8];
        inputArray[3] = new int[2];

        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray[i].length; j++){
                inputArray[i][j] = (int)(Math.random() * 10);
            }
        }
        return inputArray;
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
