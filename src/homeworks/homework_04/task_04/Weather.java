//Задача 4. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
// Вычислите среднюю температуру за неделю и выведете ее на печать.
package homeworks.homework_04.task_04;

public class Weather {
    int tMo;int tDi;int tMi;int tDo;int tFr;int tSa;int tSo;
    public Weather (int tMo,int tDi,int tMi,int tDo,int tFr,int tSa,int tSo){
        this.tMo=tMo;
        this.tDi=tDi;
        this.tMi=tMi;
        this.tDo=tDo;
        this.tFr=tFr;
        this.tSa=tSa;
        this.tSo=tSo;
    }
    public void averageT(){
        int avgTemp = (tMo+tDi+tMi+tDo+tFr+tSa+tSo) / 7;
        System.out.println("Average temperature in Hamburg last Week (08.01 - 14.01.2024): "+avgTemp+" °C");
    }
}
