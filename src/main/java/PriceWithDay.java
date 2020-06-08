public class PriceWithDay {
    public static void main(String[] args) {

    }

    public static int PriceAndDay(int Type, int Sellln, int TotalSelln) {
        int TotalQuality=50;
        int Quality = TotalQuality;
        if (Type == 1) {
            int maxSellln= (TotalQuality-1*TotalSelln)/2+TotalSelln;
            if (Sellln >= 0 && Sellln <= TotalSelln) {
                Quality = TotalQuality - 1 * Sellln;
            } else if (Sellln > TotalSelln && Sellln <= maxSellln) {
                Quality = TotalQuality - 1 * TotalSelln - 2 * (Sellln - TotalSelln);
            } else if (Sellln > maxSellln) {
                Quality = 0;
            } else if (Sellln < 0){
                Quality=TotalQuality;
            }
        }else if (Type==2){
            if (Sellln>0 && Sellln<=10) {
                Quality = TotalQuality + 2 * Sellln;
                System.out.println(Quality);
            }else if (Sellln>10 && Sellln<=15){
                Quality = TotalQuality + 2 * 10+(Sellln-10)*3;
            }
        }

        return Quality;

    }
}
