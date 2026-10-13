package Chapter8;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/13
 * Thrown when a {@code Product} has a low quantity in stock
 **/
public class LowStockException extends Exception {
    public LowStockException(String message){
        super(message);
    }
}
