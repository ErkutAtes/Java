import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;

    //2 parametreli kurucu fonksiyon
    MineSweeper(int row,int column){
        this.row= row;
        this.column = column;
    }
    int [][] mineGeneretor(){

        //Generate random location in the empty area
        int mineQuantity,mineCounter = 0;
        mineQuantity = (this.row * this.column) / 4;

        //declared empty area
        int [][] mineArr = new int[this.row][this.column];

        //random obeject
        Random r = new Random();

        //locating the mine
            do {
                while (true) {
                    int mineRow = r.nextInt(this.row);
                    int mineColumn  =r.nextInt(this.column);
                    if (mineArr[mineRow][mineColumn] != 1) {
                        mineArr[mineRow][mineColumn] = 1;
                        break;
                    }
                  }
                mineCounter++;
                } while(mineCounter < mineQuantity);
            //return row * column size array 1's represent mines and 0's represent safety location
        return  mineArr;
    }

    //return row and column in an array
    int [] userCoordinates(String [][] arr){

        int rowCoordinate;
        int columnCoordinate;
        Boolean isValid;

        Scanner inp = new Scanner(System.in);

        int [] coordinatesArr = new int [2];

        do {
            System.out.print("Satır girin :");
             rowCoordinate = inp.nextInt();
            System.out.print("Sütun girin :");
             columnCoordinate = inp.nextInt();

            //checking coordinates
            //row control
            if(rowCoordinate < 0 || rowCoordinate >= this.row){
                System.out.println("Hatalı giriş yaptın");
                isValid = false;
            }else if(columnCoordinate < 0 || columnCoordinate >= this.column){
                System.out.println("Hatalı giriş yaptın");
                isValid = false;
            } else if(arr[rowCoordinate][columnCoordinate] != "_"){
                System.out.println("Bu kordinat bilgisi daha önce kullanıldı.Tekrar Dene!");
                isValid = false;
            } else {
                isValid = true;
            }
        }while(!isValid);

        //assign coordiantes to coordinates array
        coordinatesArr[0] = rowCoordinate;
        coordinatesArr[1] = columnCoordinate;
        return coordinatesArr;
    }

    void print2DStringArray(String [][] arr){
        for (String [] i : arr){
            for (String element : i){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    void print2DIntArray(int [][] arr){
        for (int [] i : arr){
            for (int element : i){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    String [][] userArrGenerator(){

        Scanner inp = new Scanner(System.in);
        String [][] arr = new String[this.row][this.column];
        for (int i = 0; i < this.row; i++){
            for(int j = 0; j < this.column; j++){
                arr[i][j] = "_";
            }
        }
        return arr;
    }
    int findMine(int [][] mineArr,int [] coordinates){
        //coordinates[0] = row
        //coordinates[1] = column
        System.out.println(coordinates[0]);
        System.out.println(coordinates[1]);
        int mineCounter = 0;
        for (int i = - 1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int realRow = i + coordinates[0];
                int realColumn = j + coordinates[1];
                if (realRow >= 0 && realRow < this.row && realColumn >= 0 && realColumn < this.column){
                    if (mineArr[realRow][realColumn] == 1) {
                        mineCounter++;
                    }
                }


            }
        }
        System.out.println("mayın sayısı "+ mineCounter);
        return mineCounter;
    }

    int calculateRemainMove(int [][] arr){
        int remainMove = 0;
        for(int [] i :arr){
            for(int ele : i){
                if (ele == 0){
                    remainMove++;
                }
            }
        }
        return remainMove;
    }
    void run(){
        Boolean isAlive = true;
        int [] coordiantes;

        //this array keeps the locations of the mines
        int [][] mineArr = mineGeneretor();
        System.out.println("Test için Mayınlı Dizi: ");
        print2DIntArray(mineArr);

        System.out.println("Kullanıcı dizesi : ");
        String [][] userArr = userArrGenerator();
        print2DStringArray(userArr);

        while(isAlive && calculateRemainMove(mineArr) != 0){
            //coordiantes[0] = row
            //coordiantes[1] = column
            coordiantes = userCoordinates(userArr);

            if (mineArr[coordiantes[0]][coordiantes[1]] != 1){
                isAlive  = true;
                int mineNumber;
                mineNumber = findMine(mineArr,coordiantes);
                userArr[coordiantes[0]][coordiantes[1]] = String.valueOf(mineNumber);
                mineArr[coordiantes[0]][coordiantes[1]] = 2;
                print2DStringArray(userArr);
                /*print2DIntArray(mineArr);*/
            } else if (mineArr[coordiantes[0]][coordiantes[1]] == 1){
                isAlive  = false;
                userArr[coordiantes[0]][coordiantes[1]] = "X";
                System.out.println("***************Game Over***************");
                System.out.println("************Mayınların Yeri************");
                System.out.println("1'ler Mayınların Yerini Gösteriyor.");
                print2DIntArray(mineArr);

                System.out.println("************Senin Oyun Tahtan************");
                print2DStringArray(userArr);
              }
        }
        if (calculateRemainMove(mineArr) == 0){
            isAlive  = false;
            System.out.println("***********Tebrikler Mayına Basmadın************");
            System.out.println("************Mayınların Yeri************");
            System.out.println("1'ler Mayınların Yerini Gösteriyor.");
            System.out.println("2 ise senin bastığım yerler");
            print2DIntArray(mineArr);

            System.out.println("************Senin Oyun Tahtan************");
            print2DStringArray(userArr);
        }
    }
}




