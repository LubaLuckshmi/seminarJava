package lesson6;
/*
. Продумайте структуру класса Кот. Какие поля и методы будут
актуальны для приложения, которое является
        а) информационной системой ветеринарной клиники
        б) архивом выставки котов
        в) информационной системой Театра кошек Ю. Д. Куклачёва
        Можно записать в текстовом виде, необязательно
        реализовывать в java.

 */

import java.util.Objects;

public class Cat {
        String name;
        String breed;
        int age;
        boolean isMale;

        public Cat(int age, String name, String breed, boolean isMale) {
                this.age = age;
                this.name = name;
                this.isMale = isMale;
                this.breed = breed;
        }


        @Override
        public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append(name).append(" ").append(age);
                return builder.toString();
        }

        @Override
        public int hashCode() {
                return Objects.hash(age, name, breed, isMale);
        }

        @Override
        public boolean equals(Object obj) {
                if (obj == null) {
                        return false;
                }
                if (!(obj instanceof Cat)) {
                        return false;
                }

                Cat temp = (Cat) obj;
                return (temp.age == this.age && temp.isMale == temp.isMale && temp.breed.equals(this.breed) && temp.name.equals(this.name));


        }


}

