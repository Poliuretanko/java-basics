import java.util.Random;
import java.util.Stack;

public class CrossTheStickPCPlayer extends CrossTheStickPlayer{
    @Override
    public boolean makeMove(Stack sticks) throws InterruptedException {
        var numberOfSticksToCrossOut = new Random().nextInt(1, 3);
        Thread.sleep(1000);
        System.out.println("Computer crosses out " + numberOfSticksToCrossOut + " sticks");
        return super.makeMove(sticks, numberOfSticksToCrossOut);
    }

    @Override
    public String name() {
        return "PC player";
    }
}
