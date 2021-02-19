import java.util.*;

public class KataPotter {
    public double calculPrix(ArrayList basket) {
       double price=0; ;
       double formule ;
        if (basket.size() == 0) {
            return 0;
        }
        else {
            while (basket.size()!=0){
                HashSet newbasket = new HashSet(basket);
                switch(newbasket.size()) {
                    case 2:
                        formule = 2*8 * 0.95;
                        price= price + formule;
                        basket = traitementBasket(newbasket,basket);
                        break;
                    case 3:
                        formule = 3* 8 * 0.9;
                        price= price + formule;
                        basket = traitementBasket(newbasket,basket);
                        break;
                    case 4:
                        formule = 4* 8 * 0.8;
                        price= price + formule;

                        basket = traitementBasket(newbasket,basket);
                        break;
                    case 5:
                        ArrayList basketTemp = new ArrayList(basket);
                        HashSet newbasketTemp = new HashSet(basketTemp);
                        String forDelete ="";
                        Map<Object, Integer> map = new HashMap<>();
                        for(  Object r  : basket) {
                            if (map.containsKey(r)== false) {
                                map.put(r, Collections.frequency(basket, r));
                            }
                        }
                        forDelete = (String) map.entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
                        newbasketTemp.remove(forDelete);
                        basketTemp = traitementBasket(newbasketTemp,basketTemp);
                        if (basket.size()%5==0){
                            formule = 5*8*0.75;
                            price= price + formule;
                            basket = traitementBasket(newbasket,basket);
                            break;
                        }else
                        if (newbasketTemp.size()>=4){
                            formule = 4* 8 * 0.8;
                            price= price + formule;
                            basket = traitementBasket(newbasketTemp,basket);
                            break;
                        }
                    default:
                        price = price +8;
                        basket = traitementBasket(newbasket,basket);
                }

            }
            return price;
        }
    }
    private ArrayList<String> traitementBasket(HashSet newbasket, ArrayList basket){
        for (Iterator<String> it = newbasket.iterator(); it.hasNext(); ) {
            String element = it.next();
            for (int j=0; j<basket.size();j++){
                if (basket.get(j)==element){
                    basket.remove(j);
                    j=basket.size();
                }
            }
        }
        return basket;
    }
}
