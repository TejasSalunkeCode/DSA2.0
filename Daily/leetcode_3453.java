public class leetcode_3453 {

    public double separateSquare(int[][] squares) {
        double totalArea = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int[] square : squares) {
            double len = square[2];
            totalArea += len * len;
            min = Math.min(min, square[1]);
            max = Math.max(max, square[1] + len);
        }

        double target = totalArea / 2.0;
        double low = min, high = max;

        while (high - low > 1e-5) {
            double mid = (low + high) / 2.0;

            if (areaBelow(mid, squares) < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public double areaBelow(double mid, int[][] squares) {
        double area = 0;

        for (int[] square : squares) {
            double y = square[1];
            double len = square[2];

            if (mid >= y + len) {
                area += len * len;
            } else if (mid > y) {
                area += len * (mid - y);
            }
        }
        return area;
    }
}
