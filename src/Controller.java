import java.util.*;

public class Controller extends Menu<String> {


    Scanner sc = new Scanner(System.in);

    //--------------------------------------------------------
    static String[] menu = {"Convert From Binary", "Convert From Decimal", "Convert From Hexa", "EXIT (0)"};

    public Controller() {
        super("\n----------!!Control System!!----------", menu);

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> binary();
            case 2 -> decimal();
            case 3 -> heximal();

        }
    }

    private void heximal() {
        String hexa = Validate.checkInputHexaDecimal();
        Manager.convertFromHexa(hexa);
    }

    private void decimal() {
        String decimal = Validate.checkInputDecimal();
        Manager.convertFromDecimal(decimal);
    }

    private void binary() {
        String binary = Validate.checkInputBinary();
        Manager.convertFromBinary(binary);
    }

}