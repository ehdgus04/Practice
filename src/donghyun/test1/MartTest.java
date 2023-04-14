package donghyun.test1;

import java.util.Scanner;

public class MartTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buyer b = new Buyer();
        System.out.print("구입할 물건 입력 (1개만 입력가능): ");
        String customer = scanner.nextLine();
        if(customer.equals("Tv")){
            b.buy(new Tv());
            b.summary();
        }
    }
}
class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product {
    Tv(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product {
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio extends Product {
    Audio(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Product[] cart = new Product[10];

    int i = 0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+" 을/를 구입했습니다.");
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i=0; i<cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += "[ "+cart[i]+" ]";
        }
        System.out.println("구입한 물건의 총 가격 : "+sum);
        System.out.println("구입한 물건 목록 : "+itemList);
    }
}