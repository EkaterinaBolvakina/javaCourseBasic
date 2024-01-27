//**Task 4** Реализовать с использованием **switch**
//Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
//Запишите в переменную случайное число от 0 до 12.
//Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.  (Оставшееся время не может быть больше 1 часа)
//На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
//от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
//от 4 до 6 -> Нейтральные слова + ко времени 15 минут
//3 -> Огорчитесь. Минус 30 минут ко времени
//оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
//
//Выведите на экран оставшееся на сегодня время для просмотра ТВ
package homeworks.homework_09.task_04;

public class GradeMathChildSwitch {
    public static void main(String[] args) {

        int minGrade = 0;
        int maxGrade = 12;
        double grade = Math.random() * (maxGrade - minGrade ) + minGrade;
        long gradeMath = Math.round(grade);
        System.out.println("'Hi Mum, I've got a "+gradeMath+" on my maths test paper today.'");

        int tvTimeFreeTodayInMinutes = 45;
        switch ((int)gradeMath){
            case 12:
            case 11:
            case 10:
                System.out.println("'My child! I'm so happy for you! " +
                        "So you can watch an extra hour of television today, " +
                        "so in total you can watch "+(tvTimeFreeTodayInMinutes+60)+" minutes today.'");
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("'My child! Very good! " +
                        "So you can watch an extra 45 minutes of television today, " +
                        "so in total you can watch "+(tvTimeFreeTodayInMinutes+45)+" minutes today.'");
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("'It's good! " +
                        "So you can watch an extra 15 minutes of television today, " +
                        "so in total you can watch "+(tvTimeFreeTodayInMinutes+15)+" minutes today.'");
                break;
            case 3:
                System.out.println("'I'm ver sad, my child... " +
                        "So your tv time will be cut by 30 minutes today, " +
                        "so in total you can watch "+(tvTimeFreeTodayInMinutes-30)+" minutes today.'");
                break;
            default:
                System.out.println("'That is very bad!" +
                        "You're not allowed to watch TV today!'");


        }

    }
}
