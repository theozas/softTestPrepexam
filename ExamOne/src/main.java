import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main (String []args){
        ArrayList <Product> pList = new ArrayList<>();

        Book b1 = new Book();
        Toys t1 = new Toys();


        System.out.println(b1.toString());
        System.out.println(t1.toString());

        b1.setAuthorName("Paulius Miliunas");
        b1.setBookName("How to");
        b1.setISBN("ds124");
        b1.setType("Book");
        b1.setDescription("Book about how to");
        b1.setPrice(12.25);
        b1.setProductNo(12345);
        b1.setStock(5);

        t1.setAgeSet(5);
        t1.setBrand("ToyToy");
        t1.setMaterial("PLA");
        t1.setModel("A05");
        t1.setType("Plastic Toy");
        t1.setDescription("Plastic toy for 5 year old kids");
        t1.setPrice(12.35);
        t1.setProductNo(12548);
        t1.setStock(10);

        //System.out.println(b1.toString());
        //System.out.println(t1.toString());
        //System.out.println(b1);
        pList.add(b1);
        pList.add(t1);

        Iterator pli = pList.iterator();
        while (pli.hasNext()){
            System.out.println(pli.next());
        }
    }
}
