public class FixedStack implements IntStack {
    private int stck[]; //оголошуємо масив для розміщення стеку
    private int tos; //оголошуємо вершину стеку

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //метод наповнення стеку
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заповнений");
        } else {
            stck[++tos] = item;
        }
    }

    //метод для вилучення елементів зі стеку
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пустий");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}