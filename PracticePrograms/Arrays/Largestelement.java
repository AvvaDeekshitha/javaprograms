class LargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 30, 15};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}
