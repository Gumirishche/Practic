package ru.ssau.tk.Gumirishche.Practic;

import java.lang.Math;

public class Massif {
    public int[] massifSize(int size) {
        int[] massif1 = new int[size];
        return massif1;
    }

    public int[] arithmeticMassif(int size, int first, int step) {
        int[] massif = new int[size];
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massif[i] = massif[i - 1] + step;
        }
        return massif;
    }

    public long[] geometricMassif(int size, int first, double division) {
        long[] massif = new long[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            long result = Math.round(massifInteger + massifRemains);
            massif[i] = result;
        }
        return massif;
    }

    public double[] geometricMassif(int size, double first, double division) {
        double[] massif = new double[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            double result = massifInteger + massifRemains;
            massif[i] = result;
        }
        return massif;
    }

    public int[] divisionMassif(int number) {
        int size = (int) ((number / (Math.sqrt(number))) - 1);
        int[] massif = new int[size];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                massif[j] = i;
                j++;
            }
        }
        return massif;
    }

    public int[] simpleMassif(int last) {
        if (last <= 1) {
            System.out.println("the number must be greater than 1.");
            return new int[]{};
        } else {
            boolean simple;
        /*int size = (int) Math.round(last / Math.log1p(last));
        int[] massif = new int[size + 1];*/
            int size = 0;
            for (int jSize = 3; jSize <= last; jSize++) {
                simple = true;
                for (int iSize = 2; iSize < jSize; iSize++) {
                    if (jSize % iSize == 0) {
                        simple = false;
                        break;
                    }
                }
                if (simple) {
                    size++;
                }
            }
            int[] massif = new int[size + 1];
            int term = 0;
            massif[0] = 2;
            for (int h = 1; h < size + 1; h++) {
                int secTerm = 0;
                for (int j = 3 + term; j <= last; j++) {
                    simple = true;
                    for (int i = 2; i < j; i++) {
                        if (j % i == 0) {
                            simple = false;
                            break;
                        }
                    }
                    if (simple) {
                        massif[h] = j;
                        break;
                    } else {
                        secTerm++;
                    }
                }
                term++;
                term = term + secTerm;
            }
            return massif;
        }
    }

    public int[] symmetricMassif(int size) {
        int[] massif = new int[size];
        int l = size / 2;
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                massif[i] = i + 1;
            }
            for (int j = size / 2; j < size; j++) {
                massif[j] = l;
                l--;
            }
        } else {
            for (int i = 0; i < size / 2 + 1; i++) {
                massif[i] = i + 1;
            }
            for (int j = size / 2 + 1; j < size; j++) {
                massif[j] = l;
                l--;
            }
        }
        return massif;
    }

    public boolean inTheMassif(int[] massif, int x) {
        boolean result = false;
        for (int i = 0; i < massif.length; i++) {
            if (x == massif[i]) {
                result = true;
            }
        }
        return result;
    }

    public boolean nullMassif(Integer[] integers) {
        boolean result = false;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int quantityEvenNumbersMassif(int[] massif) {
        int quantity = 0;
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] % 2 == 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public Object maxNumberMassif(int[] massif) {
        if (massif.length == 0) {
            return null;
        } else {
            int max = massif[0];
            for (int i = 1; i < massif.length; i++) {
                if (max < massif[i]) {
                    max = massif[i];
                }
            }
            return max;
        }
    }

    public boolean massifFirstOrLast(int[] massif) {
        int first = 0;
        int last = 0;
        int i;
        for (i = 0; i < massif.length; i++) {
            if (massif[i] % massif[0] == 0) {
                first++;
            }
            if (massif[i] % massif[massif.length - 1] == 0) {
                last++;
            }
        }
        if (first > last) {
            return true;
        } else {
            return false;
        }
    }

    public int massif21(int[] massif) {
        int y = 0;
        int value = 0;
        for (int i = 0; i < massif.length - 1; i++) {
            int x = 1;
            for (int j = i + 1; j < massif.length; j++) {
                if (massif[i] == massif[j]) {
                    x++;
                }
            }
            if (y < x) {
                y = x;
                value = massif[i];
            }
        }
        return value;
    }

    public int indexOfAnEqualArrayElement(int[] massif, int element) {
        int i;
        for (i = 0; i < massif.length; i++) {
            if (massif[i] == element) {
                break;
            }
        }
        return i;
    }

    public void changeMaxAndMin(int[] massif) {
        int max = massif[0], min = massif[0];
        int indexMax = 0, indexMin = 0;
        for (int i = 1; i < massif.length; i++) {
            if (max < massif[i]) {
                max = massif[i];
                indexMax = i;
            }
            if (min > massif[i]) {
                min = massif[i];
                indexMin = i;
            }
        }
        int x = massif[indexMax];
        massif[indexMax] = massif[indexMin];
        massif[indexMin] = x;
    }

    public int evenIndexSum(int[] massif) {
        int sum = 0;
        for (int i = 0; i < massif.length; i = i + 2) {
            sum = sum + massif[i];
        }
        return sum;
    }

    public void oppositeMassif(int[] massif) {
        for (int i = 0; i < massif.length; i++) {
            massif[i] = -massif[i];
        }
    }

    public int[] getMassif(int[] massif) {
        return massif;
    }

    public void paint(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void paint(int size, int first, double division) {
        long[] massif = new long[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            long result = Math.round(massifInteger + massifRemains);
            massif[i] = result;
            System.out.println(massif[i]);
        }
    }

    public static void main(String[] args) {
        Massif x = new Massif();
        /*x.paint(x.arithmeticMassif(5, 1, 6));
        x.paint(3,1,0.1);*/
        x.paint(x.simpleMassif(24));
    }
}
