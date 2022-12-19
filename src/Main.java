import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cart = 200;
        int money = 5000;
        product(cart, money);

    }
    static void city(){

        int n = (int)(Math.random()*1+5);
        int Distance = (int)(Math.random()*50+50);
        if (n==1){
            System.out.println("City:Bishkek");
            System.out.println("Distance:" +Distance + " lig");
        }else if (n==2){
            System.out.println("City:Kant");
            System.out.println("Distance:" +Distance + " lig");
        }else if(n==3){
            System.out.println("City:Kara-Kol");
            System.out.println("Distance:" +Distance+ " lig");
        }else if(n==4){
            System.out.println("City:Bishkek");
            System.out.println("Distance:" +Distance + " lig");
        }else if (n==5){
            System.out.println("City:Almaty");
            System.out.println("Distance:" +Distance + " lig");
        }else {
            System.out.println("try again");
        }
        System.out.println(Distance/3 +" дня идти");


    }
    static void product(int cart, int money) {
        String[] Product = {"1-мясо 20kg 3000som, 2-сухофрукты +10kg 500som, 3-зерно " +
                "+5kg 100som, 4-мука +50kg 1000, 5-ткани +15kg 800som, 6-краска +20kg 900som"};
        for (int i = 0; i <= Product.length - 1; i++) {
            System.out.println(Product[i]);
        }
        int prod = (int) (Math.random() * 3 + 3);
        if (prod == 1) {
            System.out.println("мясо 20kg 3000som");
            cart -= 20;
            money -= 3000;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else if (prod == 2) {
            System.out.println("сухофрукты +10kg 500som");
            cart -= 10;
            money -= 500;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else if (prod == 3) {
            System.out.println("зерно +5kg 100som");
            cart -= 5;
            money -= 100;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else if (prod == 4) {
            System.out.println("мука +50kg 1000som");
            cart -= 50;
            money -= 1000;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else if (prod == 5) {
            System.out.println("ткани +15kg 800som");
            cart -= 15;
            money -= 800;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else if (prod == 6) {
            System.out.println("краска +20kg 900som");
            cart -= 20;
            money -= 900;
            System.out.println("ещё столько места в телеге " + cart);
            System.out.println("остаток " + money + "денег");
        } else {
            System.out.println("try again");
        }
        if (money > 300 && cart > 30) {
            product(cart, money);
        } else if (money > 300 && cart < 29) {
            System.out.println("Телега переполнен");
        } else if (money < 299 && cart > 30) {
            System.out.println("Недостаточно средств");
        }else if (money<299 && cart <29){
            System.out.println("Покупка завершена");
        }else{
            System.out.println("trey again");
        }
        city();
        if (prod == 1) {
            System.out.println("мясо 20kg 3000som");
        } else if (prod == 2) {
            System.out.println("сухофрукты +10kg 500som");
        } else if (prod == 3) {
            System.out.println("зерно +5kg 100som");
        } else if (prod == 4) {
            System.out.println("мука +50kg 1000som");
        } else if (prod == 5) {
            System.out.println("ткани +15kg 800som");
        } else if (prod == 6) {
            System.out.println("краска +20kg 900som");
        } else {
            System.out.println("try again");
        }
        int mso =3000;
        int sux = 500;
        int zer = 100;
        int muka = 1000;
        int tka =800;
        int kra =900;
        list();
        int sale= (int)(Math.random()*3+2);
        if (sale ==1) {
            System.out.println("Состояние: нормальное");
            System.out.println("Мясо "+mso*1.2);
            System.out.println("Сухарики "+sux*1.2);
            System.out.println("Зерно "+zer*1.2);
            System.out.println("Мука "+muka*1.2);
            System.out.println("Ткань "+tka*1.2);
            System.out.println("Краска "+kra*1.2);
        }else if (sale ==2){
            System.out.println("Состояние: слегка испорчен");
            System.out.println("Мясо "+mso*0.95);
            System.out.println("Сухарики "+sux*0.95);
            System.out.println("Зерно "+zer*0.95);
            System.out.println("Мука "+muka*0.95);
            System.out.println("Ткань "+tka*0.95);
            System.out.println("Краска "+kra*0.95);
        }else if (sale ==3){
            System.out.println("Состояние: половина испортилась");
            System.out.println("Мясо "+mso*0.55);
            System.out.println("Сухарики "+sux*0.55);
            System.out.println("Зерно "+zer*0.55);
            System.out.println("Мука "+muka*0.55);
            System.out.println("Ткань "+tka*0.55);
            System.out.println("Краска "+kra*0.55);
        }else if (sale ==4){
            System.out.println("Состояние: почти весь пропал");
            System.out.println("Мясо "+mso*0.25);
            System.out.println("Сухарики "+sux*0.25);
            System.out.println("Зерно "+zer*0.25);
            System.out.println("Мука "+muka*0.25);
            System.out.println("Ткань "+tka*0.25);
            System.out.println("Краска "+kra*0.25);
        }else if (sale==5){
            System.out.println("Состояние: испорчен в хлам");
            System.out.println("Мясо "+mso*0.1);
            System.out.println("Сухарики "+sux*0.1);
            System.out.println("Зерно "+zer*0.1);
            System.out.println("Мука "+muka*0.1);
            System.out.println("Ткань "+tka*0.1);
            System.out.println("Краска "+kra*0.1);
        }else{
            System.out.println("try again");
        }

    }
    static void list(){
        int day = (int)(Math.random()*4+4);
        if(day==1){
            System.out.println("Обычный день");
        }else if (day==2){
            System.out.println("Дождь");
            System.out.println("Скорость понижена на 2 лиги");
        }else if(day==3){
            System.out.println("Ровная дорога");
            System.out.println("Скорость повышена на 2 лиги");
        }else if(day==4){
            System.out.println("Сломалось колесо");
            System.out.println("день в пустую, стоим на месте");
        }else if(day==5){
            System.out.println("Река");
            System.out.println("потратил целый день, пока искал брод.");
        } else if (day==6) {
            System.out.println("Встретил местного");
            System.out.println("удалось срезать часть пути");
        }else if(day==7){
            System.out.println("Придорожный трактир");
            System.out.println("есть вероятность продать/купить товар.");
        }else if(day==8){
            System.out.println("Товар испортился");
            System.out.println("Случайно испортился один из товаров.");
        }else{
            System.out.println("try again");
        }
    }

}
