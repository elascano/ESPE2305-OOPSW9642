
package espe.edu.ec.templateMethod.model;

/**
 *
 * @author USER
 */
    public abstract class CaffeineBeverage {
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

