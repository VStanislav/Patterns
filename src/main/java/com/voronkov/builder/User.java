package com.voronkov.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Cloneable{

        private  String name;
        private  String surname;
        private  String email;
        private  String number;
        private  String adress;
        private  Integer age;
        private  Integer hight;
        private  Integer weigh;

        public User clone() throws CloneNotSupportedException {
                return (User) super.clone();
        }

}
