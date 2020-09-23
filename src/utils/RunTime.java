package utils;

import java.util.Date;

public class RunTime implements Runnable {

    /* 运行的方法体 */
    private Runnable target;

    /* 持续时间 */
    private long lastTime;


    public RunTime(Runnable target) {
        this.target = target;
    }

    /**
     * create by: zyf
     * description: 开始执行
     * create time: 2020/9/23
     *
     * @param times 执行次数
     * @return utils.RunTime
     */
    public RunTime start(int times) {

        long totalLastTime = 0;
        for (int i = 0; i < times + 2; i++) {

            long sTime = System.nanoTime();
            target.run();

            if (i != 1 && i != times + 1) {
                totalLastTime += System.nanoTime() - sTime;
            }

        }

        this.lastTime = totalLastTime / times;
        return this;
    }

    @Override
    public void run() {
    }

    /**
     * create by: zyf
     * description: 打印执行时间（单位毫秒）
     * create time: 2020/9/23
     *
     * @param
     * @return void
     */
    public void printMs() {

        System.out.println("Running Time: " + lastTime / (1000000.0) + "ms");
    }

}
