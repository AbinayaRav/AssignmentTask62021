import java.util.Scanner;

public class ARQuestion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first complex number's real and imaginary values :");
        Complex complexNo = new Complex(scan.nextInt(), scan.nextInt());
        System.out.println("Please enter the second complex number's real and imaginary values :");
        Complex complexNo1 = new Complex(scan.nextInt(), scan.nextInt());
        System.out.println("---------------------------------------------------RESULT--------------------------------------------------");
        Complex result = addTwoComplexNumbers(complexNo, complexNo1);
        System.out.format("The sum of two complex numbers is : %+d%+di\n", result.getRealNo(), result.getImaginaryNo());
        result = subtractTwoComplexNumbers(complexNo, complexNo1);
        System.out.format("The difference of two complex numbers is : %+d%+di\n", result.getRealNo(), result.getImaginaryNo());
        result = productOfTwoComplexNumbers(complexNo, complexNo1);
        System.out.format("The product of two complex numbers is : %+d%+di", result.getRealNo(), result.getImaginaryNo());
    }

    public static Complex addTwoComplexNumbers(Complex comp1, Complex comp2) {
        return new Complex((comp1.getRealNo() + comp2.getRealNo()), (comp1.getImaginaryNo() + comp2.getImaginaryNo()));
    }

    public static Complex subtractTwoComplexNumbers(Complex comp1, Complex comp2) {
        return new Complex((comp1.getRealNo() - comp2.getRealNo()), (comp1.getImaginaryNo() - comp2.getImaginaryNo()));
    }

    public static Complex productOfTwoComplexNumbers(Complex comp1, Complex comp2) {
        Complex result = new Complex();
        result.setRealNo((comp1.getRealNo() * comp2.getRealNo()) + ((comp1.getImaginaryNo() * comp2.getImaginaryNo()) * (-1)));
        result.setImaginaryNo((comp1.getRealNo() * comp2.getImaginaryNo()) + (comp1.getImaginaryNo() * comp2.getRealNo()));
        return result;
    }
}


class Complex {
    private int realNo;
    private int imaginaryNo;

    public Complex() {

    }

    public Complex(int realNo, int imaginaryNo) {
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    public int getRealNo() {
        return realNo;
    }

    public void setRealNo(int realNo) {
        this.realNo = realNo;
    }

    public int getImaginaryNo() {
        return imaginaryNo;
    }

    public void setImaginaryNo(int imaginaryNo) {
        this.imaginaryNo = imaginaryNo;
    }
}
