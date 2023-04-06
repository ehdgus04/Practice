//public class test3 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
//        Product p = new Computer();
//        b.buy(p);
//        b.summary();
//
//        System.out.println("현재 잔액 : "+b.money+ " 만원");
//        System.out.println("현재 보너스포인트 : "+b.bonusPoint+" 포인트");
//    }
//}
//class Product {
//    int price;
//    int bonusPoint;
//
//    Product(){}
//    Product(int price){
//        this.price = price;
//        bonusPoint = (int)(price/10.0);
//    }
//}
//class Tv extends Product {
//    Tv(){
//        super(100);
//    }
//
//    public String toString(){
//        return "Tv";
//    }
//}
//class Computer extends Product {
//    Computer(){
//        super(200);
//    }
//
//    public String toString(){
//        return "Computer";
//    }
//}
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//
//    Buyer(){}
//    Product[] cart = new Product[10];
//    int i = 0;
//
//    void buy(Product p){
//        if(money<p.price){
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//        cart[i++] = p;
//        System.out.println(p + " 을/를 구입했습니다.");
//    }
//
//    void summary(){
//        int sum = 0;
//        String itemList = "";
//
//        for(int i=0; i<cart.length;i++){
//            if(cart[i]==null){
//                break;
//            }
//            sum += cart[i].price;
//            itemList += "[ "+cart[i]+" ]";
//        }
//        System.out.println("구입한 제품의 총 금액: "+sum+" 만원");
//        System.out.println("구입한 제품 목록 : "+itemList);
//    }
//}