void main() {
    int value = 100;
    int steps = 0;
    while (value != 0) {
        if (value % 2 == 0) {
            value = value / 2;
        }
        else {
            value = value - 1;
        }
        steps++;
    }
    System.out.println(steps);
}