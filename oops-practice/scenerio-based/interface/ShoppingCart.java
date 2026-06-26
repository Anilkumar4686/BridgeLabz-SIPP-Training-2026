interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        if (!CouponValidator.isLengthValid(code))
            return false;

        return code.startsWith("SAVE");
    }
}

public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "DISC20",
                "SAVE50",
                "AB",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon))
                System.out.println(coupon + " -> Valid");
            else
                System.out.println(coupon + " -> Invalid");
        }
    }
}