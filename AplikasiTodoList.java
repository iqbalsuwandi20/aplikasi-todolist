public class AplikasiTodoList {

    public static String[] model = new String[10];
    public static void main(String[] args) {
        testAddTodoList();
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
    public static void addTodoList(String todo) {
        // Cek apakah model penuh?
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // Model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        // Jika penuh, kita resize ukuran array 2x lipat
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }
        // Tambahkan ke posisi yang data array nya penuh
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }
    /**
     * Test menambah todo ke list
     */
    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo Ke." + i);
        }
        showTodoList();
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