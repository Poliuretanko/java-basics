package com.curiositas.java.basics.session10.kronos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String nickname;
        private String breed;
        private Long age;

        @Override
        public String toString() {
            return String.format(
                    "Cat[id=%d, nickname='%s', breed='%s', age='%d' ]",
                    id, nickname, breed, age);
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setAge(Long age) {
            this.age=age;
        }

        public Long getId() {
            return id;
        }

        public String getNickname() {
            return nickname;
        }

        public String getBreed() {
            return breed;
        }

        public Long getAge(){
            return age;
        }
}

