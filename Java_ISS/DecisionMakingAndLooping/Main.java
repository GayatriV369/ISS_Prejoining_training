package DecisionMakingAndLooping;

/**
 * Main class to demonstrate decision making and loop control
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA CONTROL STRUCTURES DEMONSTRATION");
        System.out.println("=====================================");

        // Decision Making Demo
        DecisionMakingDemo decisionDemo = new DecisionMakingDemo();
        decisionDemo.demonstrateIfStatement();
        decisionDemo.demonstrateIfElseStatement();
        decisionDemo.demonstrateIfElseIfLadder();
        decisionDemo.demonstrateSwitchStatement();
        decisionDemo.demonstrateTernaryOperator();

      
        // Loop Control Demo
        LoopControlDemo loopDemo = new LoopControlDemo();
        loopDemo.demonstrateForLoop();
        loopDemo.demonstrateWhileLoop();
        loopDemo.demonstrateDoWhileLoop();
        loopDemo.demonstrateEnhancedForLoop();
        loopDemo.demonstrateNestedLoops();
        loopDemo.demonstrateBreakContinue();
    }
}
