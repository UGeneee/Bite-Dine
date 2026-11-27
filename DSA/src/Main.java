
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());

        System.out.print("Enter number of task: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter desciption for Task 1: ");
            String desc = sc.nextLine();
            
            System.out.print("Enter priority (1-10) for Task 1: ");
            int prio = sc.nextInt();
            sc.nextLine();
            
        taskQueue.add(new Task(desc, prio));
        }
        System.out.println();
        if (!taskQueue.isEmpty()){
            System.out.println("Next task: " + taskQueue.peek());
        }
        
        System.out.println();
        System.out.println("Processing task in order of priority: ");
        while (!taskQueue.isEmpty()){
            System.out.println(taskQueue.poll());
        }
        
        System.out.println();
        System.out.println("All task have been processed");
    }

}
