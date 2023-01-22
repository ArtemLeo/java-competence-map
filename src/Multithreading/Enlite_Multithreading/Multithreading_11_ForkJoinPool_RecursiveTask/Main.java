package Multithreading.Enlite_Multithreading.Multithreading_11_ForkJoinPool_RecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        // Quantity of processors on this computer;
        System.out.println("Quantity of processors = " + Runtime.getRuntime().availableProcessors());
        System.out.println("------------------------------");

        int[] list = new int[1000000];
        int max = 0;
        for (int i = 0; i < 1000000; i++) {
            list[i] = (int) (Math.random() * 1000000);
            max = Math.max(max, list[i]);
        }
        System.out.println("Max is " + max);
        System.out.println("Max is using ForkJoin is " + findMax(list));
    }

    private static int findMax(int[] list) {
        RecursiveTask<Integer> recursiveTask = new FindingMax(0, list.length, list);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        return forkJoinPool.invoke(recursiveTask);
    }
}

class FindingMax extends RecursiveTask<Integer> {
    int left;
    int right;
    int[] list;

    public FindingMax(int left, int right, int[] list) {
        this.left = left;
        this.right = right;
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (right - left < 1000) {
            int curr_max = 0;
            for (int i = left; i < right; i++)
                curr_max = Math.max(curr_max, list[i]);
            return curr_max;
        } else {
            int middle = (left + right) / 2;
            RecursiveTask<Integer> leftSide = new FindingMax(left, middle, list);
            RecursiveTask<Integer> rightSide = new FindingMax(middle, right, list);

            leftSide.fork();
            rightSide.fork();
            return Math.max(leftSide.join(), rightSide.join());
        }
    }
}

