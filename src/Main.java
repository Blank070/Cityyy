import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Dealer dealer = new Dealer();
        Product product = new Product();
        Product2 product2 = new Product2();
        start(product2, dealer, product);
        list(product2);
        shop(product2, dealer, product);
        System.out.println("Earnings: " + dealer.getMoney());
    }
    static void start(Product2 product2, Dealer dealer, Product product) throws IOException {
        for (; ; ) {
            int pro = (int) (Math.random() * 6);
            if (pro == 0) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getFabrics()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getFabricsPrice()));
                product2.setFabrics2(product2.getFabrics2() + 1);
            } else if (pro == 2) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getMeat()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getMeatPrice()));
                product2.setMeat2(product2.getMeat2() + 1);
            } else if (pro == 1) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getDriedFruits()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getDriedFruitsPrice()));
                product2.setDriedFruits2(product2.getDriedFruits2() + 1);
            } else if (pro == 3) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getFlour()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getFlourPrice()));
                product2.setFlour2(product2.getFlour2() + 1);
            } else if (pro == 4) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getGrain()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getGrainPrice()));
                product2.setGrain2(product2.getGrain2() + 1);
            } else if (pro == 5) {
                System.out.println("грузоподъёмность " + dealer.setCart(dealer.getCart() - product.getPaint()));
                System.out.println("остаток денег " + dealer.setMoney(dealer.getMoney() - product.getPaintPrice()));
                product2.setPaint2(product2.getPaint2() + 1);
            }
            if (dealer.getCart() < 30) {
                break;
            } else if (dealer.getMoney() < 250) {
                break;
            }
        }
        list(product2);
        city(dealer, product2, product);
    }
    static void city(Dealer dealer, Product2 product2, Product product) throws IOException {
        int bishkek = (int) (50 + Math.random() * 50);
        City city = new City();
        city.setBishkek(city.getBishkek() + bishkek);
        int chui = (int) (50 + Math.random() * 50);
        city.setChui(city.getChui() + chui);
        int kant = (int) (50 + Math.random() * 50);
        city.setKant(city.getKant() + kant);
        int osh = (int) (50 + Math.random() * 50);
        city.setOsh(city.getOsh() + osh);
        int talas = (int) (50 + Math.random() * 50);
        city.setTalas(city.getTalas() + talas);
        int tokmok = (int) (50 + Math.random() * 50);
        city.setTokmok(city.getTokmok() + tokmok);
        int cityRandom = (int) (Math.random() * 6);
        if (cityRandom == 0) {
            System.out.println("Bishkek");
            System.out.println("Distance: " + city.getBishkek() + " lig");
        } else if (cityRandom == 1) {
            System.out.println("Chui");
            System.out.println("Distance: " + city.getChui() + " lig");
        } else if (cityRandom == 2) {
            System.out.println("Kant");
            System.out.println("Distance: " + city.getKant() + " lig");
        } else if (cityRandom == 3) {
            System.out.println("Osh");
            System.out.println("Distance: " + city.getOsh() + " lig");
        } else if (cityRandom == 4) {
            System.out.println("Talas");
            System.out.println("Distance: " + city.getTalas() + " lig");
        } else if (cityRandom == 5) {
            System.out.println("Tokmok");
            System.out.println("Distance: " + city.getTokmok() + " lig");
        }
        for (; ; ) {
            int speed = 3;
            if (cityRandom == 0) {
                day(dealer, product2, product);
                city.setBishkek(city.getBishkek() - speed);
                System.out.println("distance " + city.getBishkek());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            } else if (cityRandom == 1) {
                day(dealer, product2, product);
                city.setChui(city.getChui() - speed);
                System.out.println("distance " + city.getChui());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            } else if (cityRandom == 2) {
                day(dealer, product2, product);
                city.setKant(city.getKant() - speed);
                System.out.println("distance " + city.getKant());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            } else if (cityRandom == 3) {
                day(dealer, product2, product);
                city.setOsh(city.getOsh() - speed);
                System.out.println("distance " + city.getOsh());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            } else if (cityRandom == 4) {
                day(dealer, product2, product);
                city.setTalas(city.getTalas() - speed);
                System.out.println("distance " + city.getTalas());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            } else if (cityRandom == 5) {
                day(dealer, product2, product);
                city.setTokmok(city.getTokmok() - speed);
                System.out.println("distance " + city.getTokmok());
                city.setDay(city.getDay() + 1);
                System.out.println("Day: " + city.getDay());
            }
            if (city.getBishkek() < 1) {
                System.out.println("In city");
                break;
            } else if (city.getOsh() < 1) {
                System.out.println("In city");
                break;
            } else if (city.getKant() < 1) {
                System.out.println("In city");
                break;
            } else if (city.getTokmok() < 1) {
                System.out.println("In city");
                break;
            } else if (city.getChui() < 1) {
                System.out.println("In city");
                break;
            } else if (city.getTalas() < 1) {
                System.out.println("In city");
                break;
            }
        }
    }
    static void productMinus(Product2 product2) {

        int ran = (int) (Math.random() * 6);
        int qal = 1;
        if (ran == 0) {
            product2.setPaint2(product2.getPaint2() - qal);
        } else if (ran == 1) {
            product2.setGrain2(product2.getGrain2() - qal);
        } else if (ran == 2) {
            product2.setDriedFruits2(product2.getDriedFruits2() - qal);
        } else if (ran == 3) {
            product2.setMeat2(product2.getMeat2() - qal);
        } else if (ran == 4) {
            product2.setFlour2(product2.getFlour2() - qal);
        } else if (ran == 5) {
            product2.setFabrics2(product2.getFabrics2() - qal);
        }
    }
    static void list(Product2 product2) {
        System.out.println("Meat " + product2.getMeat2());
        System.out.println("Fruits " + product2.getDriedFruits2());
        System.out.println("Flour " + product2.getFlour2());
        System.out.println("Fabrics " + product2.getFabrics2());
        System.out.println("Grain " + product2.getGrain2());
        System.out.println("Paint " + product2.getPaint2());
    }
    static void day(Dealer dealer, Product2 product2, Product product) throws IOException {
        City city = new City();
        int events = (int) (Math.random() * 8);
        if (events == 0) {
            System.out.println("Обычный день");
        } else if (events == 1) {
            System.out.println("Дождь");
            city.setTalas(city.getTalas() + 2);
            city.setKant(city.getKant() + 2);
            city.setOsh(city.getOsh() + 2);
            city.setBishkek(city.getBishkek() + 2);
            city.setChui(city.getChui() + 2);
            city.setTokmok(city.getTokmok() + 2);
        } else if (events == 2) {
            System.out.println("Ровная дорога");
            city.setTalas(city.getTalas() - 2);
            city.setKant(city.getKant() - 2);
            city.setOsh(city.getOsh() - 2);
            city.setBishkek(city.getBishkek() - 2);
            city.setChui(city.getChui() - 2);
            city.setTokmok(city.getTokmok() - 2);
        } else if (events == 3) {
            System.out.println("Сломалось колесо");
            city.setTalas(city.getTalas() + 3);
            city.setKant(city.getKant() + 3);
            city.setOsh(city.getOsh() + 3);
            city.setBishkek(city.getBishkek() + 3);
            city.setChui(city.getChui() + 3);
            city.setTokmok(city.getTokmok() + 3);
        } else if (events == 4) {
            System.out.println("Река");
            city.setTalas(city.getTalas() + 3);
            city.setTalas(city.getTalas() + 3);
            city.setKant(city.getKant() + 3);
            city.setOsh(city.getOsh() + 3);
            city.setBishkek(city.getBishkek() + 3);
            city.setChui(city.getChui() + 3);
            city.setTokmok(city.getTokmok() + 3);
        } else if (events == 5) {
            System.out.println("Встретил местного");
            city.setTalas(city.getTalas() - 4);
            city.setKant(city.getKant() - 4);
            city.setOsh(city.getOsh() - 4);
            city.setBishkek(city.getBishkek() - 4);
            city.setChui(city.getChui() - 4);
            city.setTokmok(city.getTokmok() - 4);
        } else if (events == 6) {
            System.out.println("Разбойники большой дороги");
            if (dealer.getMoney() > 100) {
                System.out.println("money");
                dealer.setMoney(dealer.getMoney() - 100);
            } else if (dealer.getMoney() < 100) {
                productMinus(product2);
            }
        } else if (events == 7) {
            System.out.println("Придорожный трактир");
            if (dealer.getMoney() > 100) {
                System.out.println("Хотите остатся?");
                System.out.println("1- что б остатся");
                System.out.println("2- что б ехать дальше");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int s = Integer.parseInt(br.readLine());
                if (s == 1) {
                    city.setTalas(city.getTalas() + 3);
                    city.setTalas(city.getTalas() + 3);
                    city.setKant(city.getKant() + 3);
                    city.setOsh(city.getOsh() + 3);
                    city.setBishkek(city.getBishkek() + 3);
                    city.setChui(city.getChui() + 3);
                    city.setTokmok(city.getTokmok() + 3);
                    shop(product2, dealer, product);
                } else if (s == 2) {
                    System.out.println("не остановились");
                }
            } else {
                System.out.println("No money ");
            }
        } else if (events == 8) {
            System.out.println("Товар испортился");
        }
    }
    static void shop(Product2 product2, Dealer dealer, Product product) {
        if (product2.getMeat2() < 1) {
            dealer.setMoney(product.getMeatPrice() + 60);
            shop(product2, dealer, product);
        } else if (product2.getMeat2() == 0) {
            System.out.println("next");
        }
        if (product2.getPaint2() < 1) {
            dealer.setMoney(product.getPaintPrice() + 30);
            shop(product2, dealer, product);
        } else if (product2.getPaint2() == 0) {
            System.out.println("next");
        }
        if (product2.getFlour2() < 1) {
            dealer.setMoney(product.getFlour() + 34);
            shop(product2, dealer, product);
        } else if (product2.getFlour2() == 0) {
            System.out.println("next");
        }
        if (product2.getDriedFruits2() < 1) {
            dealer.setMoney(product.getDriedFruits() + 40);
            shop(product2, dealer, product);
        } else if (product2.getDriedFruits2() == 0) {
            System.out.println("next");
        }
        if (product2.getGrain2() < 1) {
            dealer.setMoney(product.getGrainPrice() + 20);
            shop(product2, dealer, product);
        } else if (product2.getGrain2() == 0) {
            System.out.println("next");
        }
        if (product2.getFabrics2() < 1) {
            dealer.setMoney(product.getFabrics() + 36);
            shop(product2, dealer, product);
        } else if (product2.getFabrics2() == 0) {
            System.out.println("next");
        }
    }
}