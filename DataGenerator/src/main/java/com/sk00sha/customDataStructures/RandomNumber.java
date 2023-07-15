package com.sk00sha.customDataStructures;
import java.util.Random;

public class RandomNumber {
    public static int getRandomIntNumber(int min,int max){
        Random randomNumber = new Random();
        return randomNumber.nextInt(max - min + 1) + min;
    }
    public static float getRandomFloatNumber(int min,int max){
        Random randomNumber = new Random();
        return randomNumber.nextFloat(max - min + 1) + min;
    }

}
