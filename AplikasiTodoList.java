public class AplikasiTodoList {

    public static String[] model = new String[10];
    public static void main(String[] args) {
        testShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;
            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Test menampilkan todo list
     */
    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todo List";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList() {

    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList() {

    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList() {

    }

    /**
     * menampilkan view menambah todo list
     */
    public static void viewAddShowTodoList() {

    }

    /**
     * menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {

    }
    
}