import java.util.EnumSet;

public class BookEnumTest {
    public static void main(String[] args) {
        for(BookEnum book : BookEnum.values()){
            System.out.printf("%-10s%-45s%s%n",
             book, book.getTitle(), book.getCopyrightYear());
        }
        System.out.println();
        for(BookEnum book : EnumSet.range(BookEnum.JHTP, BookEnum.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n",
             book, book.getTitle(), book.getCopyrightYear());
        }
    }
}
