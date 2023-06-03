package edu.inflk.patterns.builder;

import edu.inflk.patterns.entity.Dog;

public class DogBuilder {
    private String nickname;

    public DogBuilder setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Dog createDog() {
        return new Dog(nickname);
    }
}