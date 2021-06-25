package com.company;

public class Building {
    private Storage storage;
    public Building() {
        storage = new Storage();
    }
    //Склад здания (магазина или завода)
    public Storage Storage() {
        return storage;
    }
    //Добавление товаров на склад
    public void AddProducts(int count) {
        storage.AddProducts(count);
    }

    /*
    //Можно сделать такой обобщённый класс
    public void MoveProducts(Building from, Building to, int count){
        //Взять товары
        //from.Take(count)

        //Добавить товары
        //to.AddProducts(count);
    }
     */
}
