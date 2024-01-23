package lessons.lesson_06.publicAndPrivate.car.entity;

public class Car {
public String colour;
public String model;
private String producer;
    public String getProducer(){return producer;}

    public Car(String producer) {
        this.producer = producer;
    }

    /*
    модификаторы доступа к переменным (полям класса)
    1) default - или по умолчанию - предоставляет доступ к полю для класса который находится В ТОМ ЖЕ package
    2) public - предоставляет доступ к полю для класса который находится В ЛЮБОМ package
    3) private - предоставляет доступ к полю класса только для методов этого класса (внутренний доступ)
    4) protected (изучим позже)

    modifiers of access to variables (class fields)
    1) default - or by default - provides access to the field for the class which is located IN THE SAME package
    2) public - provides access to the field for the class which is in ANY package
    3) private - provides access to a class field only for methods of this class (internal access)
    4) protected (we will study it later)

    Modifikatoren des Zugriffs auf Variablen (Klassenfelder)
    1) default - oder standardmäßig - ermöglicht den Zugriff auf das Feld für die Klasse, die sich IM SELBEN Paket befindet
    2) public - ermöglicht den Zugriff auf das Feld für die Klasse, die sich in JEDEM Paket befindet
    3) private - ermöglicht den Zugriff auf ein Klassenfeld nur für Methoden dieser Klasse (interner Zugriff)
    4) protected (wir werden uns später damit befassen)

    In Java, modifiers are keywords that are used to change the properties of a class, method, or variable. There are two types of modifiers: access modifiers and non-access modifiers
    Java bietet verschiedene Modifikatoren, mit denen Klassen, Attribute und Methoden gekennzeichnet werden können. Die bekanntesten Modifikatoren sind die Zugriffsmodifikatoren public, private und protected, die die Sichtbarkeit der Klasse, des Attributs oder der Methode steuern.
     */
}
