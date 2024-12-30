package com.concept.java;

public class MyString {
    private char[] chars;

    public MyString(String str) {
        this.chars = str.toCharArray();
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        if (index >= 0 && index < chars.length) {
            return chars[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public MyString substring(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > endIndex || endIndex > chars.length) {
            throw new IndexOutOfBoundsException();
        }
        char[] subChars = new char[endIndex - startIndex];
        System.arraycopy(chars, startIndex, subChars, 0, endIndex - startIndex);
        return new MyString(new String(subChars));
    }

    public MyString concat(MyString other) {
        char[] combinedChars = new char[chars.length + other.length()];
        System.arraycopy(chars, 0, combinedChars, 0, chars.length);
        System.arraycopy(other.chars, 0, combinedChars, chars.length, other.length());
        return new MyString(new String(combinedChars));
    }

    public boolean equals(MyString other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass() || chars.length != other.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != other.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return new String(chars);
    }
}
