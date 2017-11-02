
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import java.io.*;

public class ProcessCreate {

	public static void main(String args[]) throws Exception {

		int n, AT[], BurstTime[], WaitTime[], TAT[];
		float AWaitTime = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter no of process");
		n = Integer.parseInt(br.readLine());
		BurstTime = new int[n];
		WaitTime = new int[n];
		TAT = new int[n];
		AT = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter BusrtTime for process " + (i + 1));
			BurstTime[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Enter ArivalTime for process" + i);
			AT[i] = Integer.parseInt(br.readLine());
		}
		WaitTime[0] = 0;
		for (int i = 1; i < n; i++) {
			WaitTime[i] = WaitTime[i - 1] + BurstTime[i - 1];
			WaitTime[i] = WaitTime[i] - AT[i];
		}
		for (int i = 0; i < n; i++) {
			TAT[i] = WaitTime[i] + BurstTime[i];
			AWaitTime = AWaitTime + WaitTime[i];
}
		System.out.println("P BurstTime WaitTime TAT ");
		for (int i = 0; i < n; i++) {
			System.out.println(" " + i + "      " + BurstTime[i] + "      " + WaitTime[i] + "      " + TAT[i]);
}
		AWaitTime = AWaitTime / n;
	System.out.println("Avg waiting time=" + AWaitTime + "\n***********************************************");

}
}