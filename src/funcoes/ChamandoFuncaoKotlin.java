package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.Collection;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }

}
