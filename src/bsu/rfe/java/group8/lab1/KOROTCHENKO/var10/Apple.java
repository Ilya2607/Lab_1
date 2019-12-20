package bsu.rfe.java.group8.lab1.KOROTCHENKO.var10;

// Новое внутреннее поле данных РАЗМЕР
public class Apple extends Food {
    private String size;
    public Apple(String size) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Apple");
        // Инициализировать размер яблока
        this.size = size;
    }

    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " has eaten");
    }

    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }

    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }

    // Переопределѐнная версия метода equals(), которая при сравнении
    // учитывает не только поле name (Шаг 1), но и проверяет совместимость
    // типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }

    // Переопределѐнная версия метода toString(), возвращающая не только
    // название продукта, но и его размер
    public String toString() {
        return super.toString() + " size of '" + size.toUpperCase() + "'";
    }

    public int calculateCalories(){
        if (size.equals("big")){
            return 40;
        }
        else if(size.equals("medium")){
            return 30;
        }
        else if(size.equals("little")){
            return 20;
        }
        else{
            return 0;
        }
    }

}

