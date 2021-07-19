import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int lantai= lantaiHotel(48);
        System.out.println(lantai);
    }


    static int lantaiHotel(int value){
        int lantai = 0;

        ArrayList lima = new ArrayList(5);
        ArrayList enam = new ArrayList(6);
        ArrayList tujuh = new ArrayList(7);
        for (int i = 1; i <= value; i++) {
       if (lima.size() <5){
           lima.add(i);
           if (lima.size()==1){
               lantai ++;
           }
       } else if(enam.size() < 6){
           enam.add(i);
           if (enam.size()==1){
               lantai++;
           }
       } else if(tujuh.size() < 7){
           tujuh.add(i);
           if (tujuh.size()==1){
               lantai++;
           }
           if (tujuh.size()==7){
               lima.clear();
               enam.clear();
               tujuh.clear();
           }
       }

        }

        return lantai;
    }

}
