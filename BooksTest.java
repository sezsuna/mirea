package lab_1_books;

public class BooksTest {
    public static void main(String[] args){
        Books first_book = new Books("Поющие в терновнике", "Колин Маккалоу", "Роман", 1977);
        Books second_book = new Books("Орудия смерти", "Кассандра Клэр", "Young Adult", 2007);
        Books third_book = new Books("Зелёная миля", "Стивен Кинг", "Триллер", 1996);

        first_book.outputString();
        second_book.outputString();
        third_book.outputString();
    }

}
