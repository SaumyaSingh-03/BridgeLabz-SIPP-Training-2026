package Interfaces;

public class CouponValidatorMain
{
    public static void main(String[] args)
    {
        String[] coupons =
                {
                        "SAVE10",
                        "OFF50",
                        "SAVE100",
                        "AB",
                        "SAVE5",
                        "DISCOUNT20"
                };

        ShoppingCart cart = new ShoppingCart();

        cart.checkCoupons(coupons);
    }
}