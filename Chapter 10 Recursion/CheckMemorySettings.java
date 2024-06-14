public class CheckMemorySettings {
    public static void main(String[] args) {
        // Print the maximum heap size
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Max Heap Size (Xmx): " + (maxMemory / (1024 * 1024)) + " MB");

        // Print the initial heap size (Xms)
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Initial Heap Size (Xms): " + (totalMemory / (1024 * 1024)) + " MB");
    }
}
