/*
 *  UCF COP3330 Fall 2021 Exercise 3
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //print prompt for quote
        System.out.print("What is the quote? ");
        //input quote
        String quote = in.nextLine();
        //print prompt for author
        System.out.print("Who said it? ");
        //input author
        String author = in.nextLine();
        //print concatenated output
        System.out.println(author+" says, \""+quote+"\"");
    }
}
