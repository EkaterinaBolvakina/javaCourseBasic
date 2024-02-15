/*
### Задача 2: Музыкальные инструменты
Определите абстрактный класс MusicalInstrument с абстрактным методом playNote,
который должен имитировать звучание ноты.
От этого класса создайте производные классы Guitar, Piano, и Violin,
реализующие метод playNote для имитации звука соответствующего инструмента.
 */
package homeworks.homework_21.abstraction.task_02;

abstract class MusicalInstrument {
    abstract void playNote();
}
