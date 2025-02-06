package numeros_random;

public class RandomNumber {

    public void random_number() {
        int gene = 0;
        int[] nums = new int[10];
        int n;
        do {
            // genera numero aleatorio de 1 - 49
            n = (int) (Math.random() * 49 + 1);
            // si no esta lo guarda en el array
            if (!repetido(n, nums, gene)) {
                nums[gene] = n;
                gene++;
            }
        } while (gene < nums.length);
        ordenar(nums);
        mostrar(nums);
    }

    private static boolean repetido(int n, int[] nums, int gene) {
        boolean res = false;
        for (int i = 0; i < gene; i++) {
            if (n == nums[i]) {
                res = true;
                break;
            }
        }
        return res;
    }

    private static void ordenar(int[] nums) {
        int aux;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] < nums[i]) {
                    aux = nums[i];
                    nums[i] = nums[k];
                    nums[k] = aux;
                }
            }
        }
    }

    private static void mostrar(int[] nums) {
        for (int num : nums) {
            System.out.println(num + ", ");
        }
    }

}
