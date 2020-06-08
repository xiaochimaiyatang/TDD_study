public class PriceWithDay {
    public static void main(String[] args) {

    }

    public static int PriceAndDay(int Type, int Sellln, int TotalSelln) {
        int TotalQuality=50;
        int Quality = TotalQuality;
        int maxSellln= (TotalQuality-1*TotalSelln)/2+TotalSelln;
        if (Type == 1) {
            if (Sellln >= 0 && Sellln <= TotalSelln) {
                Quality = TotalQuality - 1 * Sellln;
            } else if (Sellln > TotalSelln && Sellln <= maxSellln) {
                Quality = TotalQuality - 1 * TotalSelln - 2 * (Sellln - TotalSelln);
            } else if (Sellln > maxSellln) {
                Quality = 0;
            } else if (Sellln < 0){
                Quality=TotalQuality;
            }


        }
        return Quality;

    }
}
