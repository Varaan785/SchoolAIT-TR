package de.ait.homework13be;
/**
 * @task Предлагаю создать новый проект. Давайте напишем систему для повторения слов иностранного языка.
 * 		Давайте напишем сущность “Карточка слова”: В ней должны быть следующие поля:
 * 		ID,
 * 		String  language (язык оригинала),
 * 		String  word (слово),
 * 		String example (пример использования/фраза),
 * 		String translateLanguage (язык перевода),
 * 		String translation (перевод),
 * 		String group (группа карточек)
 * 		Вам необходимо написать API (по примеру того, как сделано на занятие),
 * 		которая позволяет  отобразить все карточки и добавить новую карточка,
 * @author Valerian
 * @version


*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Homework13beApplication {

	public static void main(String[] args) {
		SpringApplication.run(Homework13beApplication.class, args);
	}

}
