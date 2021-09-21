package sptv20game;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Sptv20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int max = 5 ,min = 0,attempt=1;
        Random random = new Random();
        int gameNum = random.nextInt(max - min + 1)+min;
        System.out.println("Программа загадала число от 0 до 10:");
        for(int i=0;i<3;i++){ 
            Scanner scanner = new Scanner(System.in);
            int userNum = scanner.nextInt();
            if(gameNum==userNum){
              System.out.println("ты выйграл");
              break;

            }else{
                if(attempt < 3){
                    System.out.println("попробуй еще разок");
                }else{
                   System.out.println("ты проиграл ,Я загадал:"+gameNum);
                }
            }
            attempt++;// TODO code application logic here
        }
    }
}   
    
