class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 30, 15};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}
