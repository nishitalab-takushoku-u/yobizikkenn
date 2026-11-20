/*
 * [問題]
 *  3つの整数を小さい順に並べ替えて表示するプログラム
 *  Narabekae3.java を作成しなさい。
 * 
 *  【実行例 1】（ 2/1/3 はユーザによる入力）
 *      % java Narabekae3
 *      3つの整数を入力してください。
 *      2
 *      1
 *      3
 *      小さい順に並べ替えると 1, 2, 3 になります。
 * 
 *  【実行例 2】（ 4/-2/-2 はユーザによる入力）
 *      % java Narabekae3
 *      3つの整数を入力してください。
 *      4
 *      -2
 *      -2
 *      小さい順に並べ替えると -2, -2, 4 になります。
 * 
 */

import java.util.Scanner;
public class Narabekae3 {
    public static void main(String[] args) {
        System.out.println("3つの整数を入力してください。");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // ↑上記はSystem.console().readLine() と Integer.parseInt() ３つ分の代わりの命令
        
        // ↓ここから下にプログラムを記述（ヒント：if文を利用）

    }
}