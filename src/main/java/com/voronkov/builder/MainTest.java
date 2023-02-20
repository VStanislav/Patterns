package com.voronkov.builder;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = User.builder()
                .age(18)
                .hight(190)
                .weigh(105)
                .name("Kris")
                .surname("Perskiy")
                .number("1234556767")
                .adress("MSC")
                .email("w@mail.com")
                .build();


        System.out.println(user);

        User userClone = user.clone();
        System.out.println(userClone);
        System.out.println(user.equals(userClone));
        userClone.setAge(73);
        userClone.setName("Andersen");
        System.out.println(userClone);
        System.out.println(user.equals(userClone));



        User1 newUser = User1.newBuilder()
                .withName("DSsd")
                .withSurname("sad")
                .withAge(23)
                .withHight(23)
                .withWeigh(23)
                .withAdress("asda")
                .withNumber("sdasd")
                .withEmail("23")
                .build();

        User1 newCopy = User1.newBuilder(newUser)
                .build();

        System.out.println(newUser);
        System.out.println(newCopy);
    }
}
