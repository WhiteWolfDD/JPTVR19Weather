/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19weather;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTVR19Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Создайте зубчатый массив, в котором хранится температура воздуха в нашем городена весь год. ");
        System.out.println("Массив должен содержать 12 строк, количество столбцов -количество дней в месяце. ");
        System.out.println("Программа должна вывести на экран ");
        System.out.println("погоду на указанную дату (месяц, день –пользователь вводит данные с помощью клавиатуры) ");
        System.out.println("в какие дни была самая теплая и самая холодная погода ");
        System.out.println("среднюю температуру по каждому месяцу");
            int min = -30;
            int max = 30;
            int n = 0;
            Random random = new Random();
        
            int [][] tempInYear= new int [12][];
            for (int i = 0; i < 12; i++) {
                switch (i) {
                    case 0: min =-30;max = 0;n = 31; break;
                    case 1: min =-30;max = -5;n =28; break;
                    case 2: min =-20;max = 5;n = 31; break;
                        
                    case 3: min =-15;max = 10;n = 30; break;
                    case 4: min =-5;max = 15;n =31; break;
                    case 5: min =5;max = 25;n = 30; break;
                    case 6: min =10;max = 30;n = 31; break;
                    case 7: min =10;max = 25;n = 31; break;
                    case 8: min =5;max = 20;n = 30; break;
                    case 9: min =-5;max = 10;n = 31; break;
                    case 10: min =-10;max = 0;n = 30; break;
                    case 11: min =-15;max = -5;n = 31; break;
                    
                    
                    
                    
                       
                    
                }
                tempInYear[i] = new int[n];
                for (int j = 0; j < tempInYear[i].length; j++) {
                    tempInYear [i][j]= random.nextInt(max - min + 1 )+ min;
                    System.out.printf("%4d", tempInYear [i][j]);
                }
                System.out.println();
        }
            tempInYear [0] = new int [31];
            tempInYear [1] = new int [28];
            tempInYear [2] = new int [31];
            tempInYear [3] = new int [30];
            tempInYear [4] = new int [31];
            tempInYear [5] = new int [30];
            tempInYear [6] = new int [31];
            tempInYear [7] = new int [31];
            tempInYear [8] = new int [30];
            tempInYear [9] = new int [31];
            tempInYear [10] = new int [30];
            tempInYear [11] = new int [31];
            tempInYear [0][0] = random.nextInt (max - min +1) + min;
            
        // TODO code application logic here
    }
    
}

