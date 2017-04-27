/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author katie
 */
public class Kmp {

    private char[] pattern;
    private char[] string;

    private int[] prefixTable;
    private int subStringLength;

    private List<Integer> resultPositions;

    public Kmp(char[] pattern, char[] string) {
        this.pattern = pattern;
        this.string = string;
        searchSubString(this.string, this.pattern);

    }

    public Kmp() {
    }

    public int[] initPrefix(char[] pattern) {
        int i = 0, j = -1;
        int patternLength = pattern.length;
        int[] prefixTableTmp = new int[patternLength + 1];

        prefixTableTmp[i] = j;
        while (i < patternLength) {
            while (j >= 0 && pattern[i] != pattern[j]) {
                j = prefixTableTmp[j];
            }
            i++;
            j++;
            prefixTableTmp[i] = j;
        }

        return prefixTableTmp;
    }

    public void searchSubString(char[] string, char[] pattern) {
        int i = 0, j = 0;
        int patternLength = pattern.length;
        this.subStringLength = patternLength;
        int stringLength = string.length;
        this.resultPositions = new ArrayList<>();
        this.prefixTable = initPrefix(pattern);


        while (i < stringLength) {
            while (j >= 0 && !(string[i]+"").equalsIgnoreCase(pattern[j]+"")) {
                j = prefixTable[j];
            }
            i++;
            j++;

            if (j == patternLength) {

                int position = i - patternLength;
                resultPositions.add(position);
                j = prefixTable[j];
            }
        }

    }

    public void searchSubString(String string, String pattern) {
        char[] stringInChar = string.toCharArray();
        char[] patternInChar = pattern.toCharArray();
        searchSubString(stringInChar, patternInChar);
    }

    public List<Integer> getResultPositions() {
        return resultPositions;
    }

    public int getSubStringLength() {
        return subStringLength;
    }

    public int getNumberOfMatchesFound() {
        return resultPositions.size();
    }

}
