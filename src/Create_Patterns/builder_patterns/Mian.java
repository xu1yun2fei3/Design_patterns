package Create_Patterns.builder_patterns;

public class Mian {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜套餐");
        vegMeal.showItems();
        System.out.println("总计: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n鸡肉套餐");
        nonVegMeal.showItems();
        System.out.println("总计: " +nonVegMeal.getCost());
    }
}