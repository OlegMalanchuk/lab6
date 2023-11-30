public class Main {
    public static void main(String[] args) {
        DynStack dynstack1 = new DynStack(2);
        DynStack dynstack2 = new DynStack(8);
        for (int i = 0; i < 5; i++) dynstack1.push(i);
        for (int i = 0; i < 12; i++) dynstack2.push(i);
        System.out.println("Стек в dynstack1: ");
        for (int i = 0; i <=dynstack1.getStck().length; i++)
            System.out.print(dynstack1.pop() + " ");
        System.out.println();
        System.out.println("Стек в dynstack2: ");
        for (int i = 0; i <=dynstack2.getStck().length; i++)
            System.out.print(dynstack2.pop() + " ");



    }
}