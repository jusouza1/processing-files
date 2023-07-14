import exceptions.FooRuntimeException;

public class MyFIleUtils {

    public  int subtract10fromLargerNumber(int number) throws Exception{
        if (number < 10) {
            throw new FooRuntimeException("Number is smaller than 10");
        }
        return number - 10;
    }


}
