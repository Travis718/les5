package ru.gb.les5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Worker[] worker = new Worker[5];
        worker[0] =
                new Worker(
                        "Иванов Иван Иваныч",
                        "Директор",
                        "Ivanjv@mail.ru",
                        "+7-910-123-28-45",
                        100000,
                        28);

        worker[1] =
                new Worker(
                        "Зюзельман Пафнутий Васгенович",
                        "Юрисконсульт",
                        "Monster@bk.ru",
                        "+7-910-128-22-37",
                        50000,
                        35);

        worker[2] =
                new Worker(
                        "Утыркина Прасковья Феофановна",
                        "Главный бухгалтер",
                        "Boginya69@yandex.ru",
                        "+7-919-177-71-77",
                        35000,
                        51);
        worker[3] =
                new Worker(
                        "Гатыло Остап Богданович",
                        "Учредитель",
                        "123456789@mail.ru",
                        "+7-917-777-77-77",
                        1000000000,
                        47);
        worker[4] =
                new Worker(
                        "Сидоров Сидор Сидорович",
                        "Человек-оркестр",
                        "CosaSidorova@gmail.com",
                        "+7-905-862-14-36",
                        15000,
                        35);


    }

}
