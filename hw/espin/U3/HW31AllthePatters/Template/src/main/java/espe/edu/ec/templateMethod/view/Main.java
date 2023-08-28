package espe.edu.ec.templateMethod.view;

public class Main {
    
   public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee:");
        coffee.prepareRecipe();
    }
}

abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean wantsCondiments() {
        return true; // Default behavior, can be overridden by subclasses
    }
}

class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}

class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
