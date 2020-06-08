import org.junit.Test;

public class PriceWithDayTest {
    PriceWithDay priceWithDay=new PriceWithDay();

    @Test
    public void NormalPriceTest() {
        int value=priceWithDay.PriceAndDay(1,10,50);
        assert value==40;
    }

    @Test
    public void SelllnMoreThan50Test(){
        int value=priceWithDay.PriceAndDay(1,51,50);
        assert value==0;
    }
}
