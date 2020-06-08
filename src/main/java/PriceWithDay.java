public class PriceWithDay {
    public static void main(String[] args) {

    }

    public static int PriceAndDay(int Type, int Sellln, int Quality){
        if (Type==1){
            int TotalQuality=50;
            if (Sellln>=0 &&Sellln<=50){
                Quality=50-1*Sellln;
            }else if(Sellln>50){
                Quality=0;
            }

        }
        return Quality;
    }
}
