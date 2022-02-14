package com.company;

public class BatyaMaksim extends DedMazay {
    private String favoriteFood;
    private Adress adress;
    public BatyaMaksim(String name, String surname, String adress, String favoriteFood) {
        super(name, surname);
        this.adress = adress;
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    final public void Hobby() {
        System.out.println("Tennis");
    }

    public void Hobby(String are) {
    }

    public String getInfo() {
        return "Favorite: " + favoriteFood +
                 adress.getArea()+ adress.getHome();
    }
}

