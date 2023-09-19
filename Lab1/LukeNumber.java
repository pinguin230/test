public class LukeNumber {

    private long value;

    public LukeNumber(int position) {
      this.value = calculateLuke(position);
    }

    private long calculateLuke(int n) {
      if (n == 1) return 1;
      if (n == 2) return 3;
      return calculateLuke(n - 1) + calculateLuke(n - 2);
    }

		public long getValue() {
      return value;
    }

		public long getSquare() {
      return value * value;
    }
}
