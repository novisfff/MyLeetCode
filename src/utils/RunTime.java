package utils;

import java.util.Date;

public abstract class RunTime {
    public abstract void codeBlocks();

    public void print() {
        long lastTime = new Date().getTime();
        codeBlocks();
        long currentTime = new Date().getTime();
        System.out.println("Running Time: " + (currentTime - lastTime) + "ms");
    }
}
