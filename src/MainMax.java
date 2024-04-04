public class MainMax{
        public static void main(String[] args) {
            int[] array = {5, 4, 5, 2, 1};
            int max = array[0]; // Assume the first element as the maximum

            // Loop through the array to find the maximum element
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            // Print the maximum value
            System.out.println("The maximum value in the array is: " + max);
        }
    }


