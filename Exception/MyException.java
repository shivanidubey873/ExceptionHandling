package com.tw.Exception;

public class MyException extends Exception{
    public MyException(int ans){
        super("MyException["+ans+"]");
    }
}