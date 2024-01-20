package homeworks.homework_04.task_02;

public class Average {
    int int1;int int2;int int3;int int4;int int5;int int6;int int7;int int8;int int9;int int10;
    //Constructor:
    public Average (int int1,int int2,int int3,int int4,int int5,int int6,int int7,int int8,int int9,int int10){
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
        this.int4 = int4;
        this.int5 = int5;
        this.int6 = int6;
        this.int7 = int7;
        this.int8 = int8;
        this.int9 = int9;
        this.int10 = int10;
    }
    //Method:
    public void averageResult (){
        int average = (int1 + int2 + int3 + int4 + int5 + int6 + int7 + int8 + int9 + int10) /10;
        System.out.println("Average result: " +average);
    }
}
