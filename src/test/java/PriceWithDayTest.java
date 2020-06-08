import org.junit.Test;

public class PriceWithDayTest {
    PriceWithDay priceWithDay=new PriceWithDay();

    @Test
    public void NormalPriceTest() {
        int value=priceWithDay.PriceAndDay(1,10,20);
        assert value==40;
    }

    @Test
    public void NormalMoreThanSelllnTest() {
        int value=priceWithDay.PriceAndDay(1,22,20);
        System.out.println(value);
        assert value==26;
    }

    @Test
    public void SelllnMoreThan50Test(){
        int value=priceWithDay.PriceAndDay(1,36,20);
        assert value==0;
    }

    @Test
    public void SelllnLessThan0Test(){
        int value=priceWithDay.PriceAndDay(1,-1,50);
        assert value==50;
    }

    @Test
    public void BackStageSellln10Test(){
        int value=priceWithDay.PriceAndDay(2,6,15);
        assert value==62;
    }

    @Test
    public void BackStageSellln5Test(){
        int value=priceWithDay.PriceAndDay(2,15,15);
        assert value==85;
    }

    @Test
    public void BackStageSellOverDueTest(){
        int value=priceWithDay.PriceAndDay(2,16,15);
        assert value==0;
    }

}
