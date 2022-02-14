package com.company;

final public class SonTaras extends BatyaMaksim{
private String favoriteGame;
private Adress adress;
public SonTaras(String name, String surname, String adress, String favoriteFood, String favoriteGame, HOOFG igraet, Adress ass) {
        super(name, surname, adress,favoriteFood);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nFavoriteGame: " + favoriteGame;
    }
}
