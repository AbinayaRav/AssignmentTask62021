public class ARQuestion6 {

    public static void main(String[] args) {
        Programming prog = new Programming();
        System.out.println("When no parameter is passed to the constructor, we get : ");
        System.out.println(prog.toString());
        Programming prog1 = new Programming("JAVA");
        System.out.println("When parameter (programming language) is passed to the constructor, we get : ");
        System.out.println(prog1.toString());
        Programming prog2 = new Programming(".NET");
        System.out.println(prog2.toString());
        Programming prog3 = new Programming();
        System.out.println("When no parameter is passed to the constructor, we get : ");
        System.out.println(prog3.toString());
    }
}

class Programming {
    private String languageName;

    public Programming() {
        this.languageName = "Programming Languages";
    }

    public Programming(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        return "I love " + this.languageName;
    }
}
