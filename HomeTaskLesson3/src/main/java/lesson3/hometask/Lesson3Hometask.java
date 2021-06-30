package lesson3.hometask;
//Написать игру в угадай слово:
//Создать массив из слов (из этих или других)
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
// "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
// правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson3Hometask {

public static void main (String [] args){

    String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    Random random = new Random();
    Scanner scanner = new Scanner (System.in);

    String wordAI = words[random.nextInt(words.length)];
    String wordUser;
    char[] guessedLetters = new char[15];
    Arrays.fill(guessedLetters, '#');
        System.out.println("AI wants you to guess a word from these:");
        System.out.print(Arrays.toString(words));
        while (true) {
          System.out.println("Enter your word >>> ");
          wordUser = scanner.next();
         if (wordUser.toLowerCase().equals(wordAI)) {
           System.out.println("You won!");
           break;
           }
         for (int i = 0; i < wordUser.length() && i <wordAI.length(); i++) {

             if (wordUser.charAt(i) == wordAI.charAt(i)) guessedLetters[i] = wordAI.charAt(i);
         }
            System.out.println("Try again:");
            System.out.println(new String(guessedLetters));
       }




}

}
