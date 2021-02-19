import java.util.*;

public class KataPotter {
    public double calculPrix(ArrayList panier) {
       double price=0; ;
       double formule ;
        if (panier.size() == 0) {
            return 0;
        }
        else {
            while (panier.size()!=0){
                HashSet newPanier = new HashSet(panier);
                switch(newPanier.size()) {
                    case 2:
                        formule = 2*8 * 0.95;
                        price= price + formule;
                        panier = traitementPanier(newPanier,panier);
                        break;
                    case 3:
                        formule = 3* 8 * 0.9;
                        price= price + formule;
                        panier = traitementPanier(newPanier,panier);
                        break;
                    case 4:
                        formule = 4* 8 * 0.8;
                        price= price + formule;

                        panier = traitementPanier(newPanier,panier);
                        break;
                    case 5:
                        ArrayList panierTemp = new ArrayList(panier);
                        HashSet newPanierTemp = new HashSet(panierTemp);
                        String forDelete ="";
                        Map<Object, Integer> map = new HashMap<>();
                        for(  Object r  : panier) {
                            if (map.containsKey(r)== false) {
                                map.put(r, Collections.frequency(panier, r));
                            }
                        }
                        forDelete = (String) map.entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
                        newPanierTemp.remove(forDelete);
                        panierTemp = traitementPanier(newPanierTemp,panierTemp);
                        if (panier.size()%5==0){
                            formule = 5*8*0.75;
                            price= price + formule;
                            panier = traitementPanier(newPanier,panier);
                            break;
                        }else
                        if (newPanierTemp.size()>=4){
                            formule = 4* 8 * 0.8;
                            price= price + formule;
                            panier = traitementPanier(newPanierTemp,panier);
                            break;
                        }
                    default:
                        price = price +8;
                        panier = traitementPanier(newPanier,panier);
                }

            }
            return price;
        }
    }
    private ArrayList<String> traitementPanier(HashSet newPanier, ArrayList panier){
        for (Iterator<String> it = newPanier.iterator(); it.hasNext(); ) {
            String element = it.next();
            for (int j=0; j<panier.size();j++){
                if (panier.get(j)==element){
                    panier.remove(j);
                    j=panier.size();
                }
            }
        }
        return panier;
    }
}
