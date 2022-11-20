package io.codelex.generics.practice.exercise4;

class Zoo {
    void feedAnimal(Cage cage) {

    }

    <F extends Food> void feed(F food, Animal<F> animal) {
        animal.eat(food);
    }

    void manage() {
        Cage cage = new Cage(new Wolf());
        
    }
}
