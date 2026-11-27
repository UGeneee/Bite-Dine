import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
public class HeapLab {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of incedents: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        int[] ids = new int[n];
        String[] location = new String[n];
        int[] severities = new int[n];
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            ids[i] = 101 + i;
            
            System.out.print("Enter location: ");
            location[i] = sc.nextLine();
            
            System.out.print("Enter severity (1-10): ");
            severities[i] = sc.nextInt();
            sc.nextLine();
            
            maxHeap.add(severities[i]);
            minHeap.add(severities[i]);
        }
        System.out.println("Dispatch Order (Max-Heap))");
        while (!maxHeap.isEmpty()){
            int sev = maxHeap.poll();
        for (int i = 0; i < n; i++){
            if (severities[i] == sev){
                System.out.println(ids[i] + "-" + location[i] + " (Severity: " + sev + ")");
                break;    
            }
        }
    }
        System.out.println("Backlog Monitoring (Min-Heap))");
        while (!minHeap.isEmpty()){
            int sev = minHeap.poll();
        for (int i = 0; i < n; i++){
            if (severities[i] == sev){
                System.out.println(ids[i] + "-" + location[i] + " (Severity: " + sev + ")");
                break;    
            }
        }
    }
    
}
}