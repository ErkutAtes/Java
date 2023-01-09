import java.util.Arrays;
import java.util.Scanner;
public class GenericList<T> {

    private Integer capacity = 10;
    private T data;
    private T [] arr ;
    private T [] helperArr;

    public GenericList(){
        //No capacity argument defaut size 10
        this.arr = (T[]) new Object[capacity];
    }

    public GenericList(int capacity){
        //With capacity argument size capacity
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    //If there is not enough space double up array
    public void doubleUpArr() {
        int tempSize = this.arr.length;
        this.helperArr = (T[]) new Object[tempSize];

        //Assign old array value to the doubled up array.
        for (int i = 0; i < this.arr.length; i++) {
            helperArr[i] = this.arr[i];
        }

        //Doubled upsize
        this.arr = (T[]) new Object[tempSize * 2];

        //All elemets null
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = null;
        }

        //Old array restore
        for (int i = 0; i < this.helperArr.length; i++) {
            arr[i] = this.helperArr[i];

        }
    }

    //Returns the number of elements in the array.
    public int size(){
        int counter = 0;
        for (T i : this.arr){
            if (i != null){
                counter++;
            }
        }
        return counter;
    }

    //Null Counter
    public int nullCounter(){
        int counter = 0;
        for (T i : this.arr){
            if (i == null){
                counter++;
            }
        }
        return counter;
    }

    //Returns the capacity of the array.
    public int getCapacity(){
        return this.arr.length;
    }

    //It should be used to add an element to the array belonging to the class.
    public void add(T data){
        //Controlling space
        int freeSpace  = nullCounter();
        if (freeSpace < 3){
            doubleUpArr();
        }

        //using loop for the first null element
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == null) {
                this.arr[i]= data;
                break;
            }
        }
    }

    //Print Array
    public void printArr(){
        //delete later
        for (T i: this.arr){
            if (i != null){
                System.out.println(i);
            }
        }
    }

    public void controlArr(){
        int freeSpaceNumber = nullCounter();
        System.out.println(freeSpaceNumber);
    }

    public T get(int index){
        if (index < 0 || index >= this.arr.length){
            System.out.println("null");
            return null;
        }
        else if (this.arr[index] == null){
            System.out.println("Değer atanmamış: (null)");
            return this.arr[index];

        }else{
            System.out.println("Değeri :" +this.arr[index]);
            return this.arr[index];
        }
    }
    public T remove(int index){

        if (index < 0 || index >= this.arr.length){
            return null;
        }

        this.arr[index] = null;
        for (int i = index + 1; i < this.arr.length; i++){
            this.arr[i-1] = this.arr[i];
        }
        return this.arr[index];
    }

    public T set(T data ,int index){
        //index Control
        if (index < 0 || index >= this.arr.length){
            return null;
        }
        this.arr[index] = data;
        return this.arr[index] ;
    }

    public int indexOf(T data){
        for (int i = 0; i < this.arr.length; i++){
            if(this.arr[i] == data)
            {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        int index = 0;
        for(int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == data){
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty(){
        boolean isEmpty = true;
        if(nullCounter() == this.arr.length){
            isEmpty = true;
        }else{
            isEmpty = false;
        }
        return isEmpty;
    }

    @Override
    public String toString(){
        System.out.print("[");
        for (T i:this.arr){
            if (i!= null){
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public boolean contains(T data){
        for (int  i= 0; i < this.arr.length; i++){
            if (this.arr[i] == data){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for(int i = 0; i < this.arr.length; i++){
            this.arr[i] = null;
        }
    }

    public T[] toArray(){
        T [] temp= (T[]) new Object[size()];
        for (int i = 0; i < this.arr.length; i++){
            if(this.arr[i] != null){
                temp[i] = this.arr[i];
            }
        }
        return temp;
    }

    public GenericList<T> subList(int start,int finish){
        GenericList<T> temp = new GenericList<>(finish-start+1);
        for (int i = start; i <= finish; i++){
           temp.add(this.arr[i]);
        }
        return temp;
    }
}

