package homeworks.homework_29.task_03_HashMap;
import java.util.HashMap;
import java.util.Map;
/*
### Задания с использованием HashMap
3. **Словарь перевода слов:**
    - Создайте `HashMap`, где ключом является слово на английском языке, а значением - его перевод на другой язык.
    - Добавьте в словарь пять пар слов.
    - Выведите перевод слова, введенного пользователем.
    - Удалите слово из словаря и выведите обновленный список слов.
 */
public class VocabularyApp {
    public static void main(String[] args) {
        Methods demo = new Methods();
        Map<String,String> vocabularyEngDe = new HashMap<>();
        vocabularyEngDe.put("cat","Katze");
        vocabularyEngDe.put("dog","Hund");
        vocabularyEngDe.put("day","Tag");
        vocabularyEngDe.put("happiness","Glück");
        vocabularyEngDe.put("rain","Regen");

        demo.print(vocabularyEngDe);
        String wordInput = demo.inputWord();
        demo.findWord(vocabularyEngDe,wordInput);
        demo.removeWordFromVocabulary(vocabularyEngDe,wordInput);
        demo.print(vocabularyEngDe);
    }

}
