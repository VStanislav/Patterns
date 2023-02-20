package com.voronkov.builder;

public class User1 {

    private  String name;
    private  String surname;
    private  String email;
    private  String number;
    private  String adress;
    private  Integer age;
    private  Integer hight;
    private  Integer weigh;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHight() {
        return hight;
    }

    public Integer getWeigh() {
        return weigh;
    }

    private User1(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        email = builder.email;
        number = builder.number;
        adress = builder.adress;
        age = builder.age;
        hight = builder.hight;
        weigh = builder.weigh;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(User1 copy) {
        Builder builder = new Builder();
        builder.name = copy.getName();
        builder.surname = copy.getSurname();
        builder.email = copy.getEmail();
        builder.number = copy.getNumber();
        builder.adress = copy.getAdress();
        builder.age = copy.getAge();
        builder.hight = copy.getHight();
        builder.weigh = copy.getWeigh();
        return builder;
    }


    public static final class Builder {
        private String name;
        private String surname;
        private String email;
        private String number;
        private String adress;
        private Integer age;
        private Integer hight;
        private Integer weigh;

        private Builder() {
        }


        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withSurname(String val) {
            surname = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withNumber(String val) {
            number = val;
            return this;
        }

        public Builder withAdress(String val) {
            adress = val;
            return this;
        }

        public Builder withAge(Integer val) {
            age = val;
            return this;
        }

        public Builder withHight(Integer val) {
            hight = val;
            return this;
        }

        public Builder withWeigh(Integer val) {
            weigh = val;
            return this;
        }

        public User1 build() {
            return new User1(this);
        }
    }
}
