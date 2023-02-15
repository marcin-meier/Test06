package test01;

public class zad3 {
    public static void main(String[] args) {
//        Stwórz dwie tablice liczb calkowitych (ile elementów chcesz i jak chcesz)
//        a następnie wypisz wszystkie liczby, które występują w obu tablicach.
//        np: {1,2,3,4} , {1,4,5,6} powinno wypisać {1,4}
        int[] array1 = {1, 4, 5, 9, 19, 15, 10, 15};
        int[] array2 = {4, 6, 10, 92, 43, 5, 15, 85, 45};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    System.out.print(array1[i] + "\n");
            }
        }




    }
}
