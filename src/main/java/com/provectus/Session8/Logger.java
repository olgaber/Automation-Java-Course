package com.provectus.Session8;


public class Logger{

    private enum LogLevel {

        OFF,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        TRACE;
    }

    public static void showInfo(){
        System.out.println(ConsoleColors.GREEN + LogLevel.INFO + ": INFO log level" + ConsoleColors.RESET);
    }

    public static void showFatal(){
        System.out.println(ConsoleColors.RED_BACKGROUND + LogLevel.FATAL + ": FATAL log level" +
                ConsoleColors.RESET);
    }

    public static void showError(){
        System.out.println(ConsoleColors.RED + LogLevel.ERROR + ": ERROR log level" +
                ConsoleColors.RESET);
    }

    public static void showWarn(){
        System.out.println(ConsoleColors.YELLOW + LogLevel.WARN + ": WARN log level" +
                ConsoleColors.RESET);
    }

    public static void showDebug(){
        System.out.println(ConsoleColors.BLUE + LogLevel.DEBUG + ": DEBUG log level" + ConsoleColors.RESET);
    }

    public static void showTrace(){
        System.out.println(ConsoleColors.PURPLE + LogLevel.TRACE + ": TRACE log level" + ConsoleColors.RESET);
    }

    public static void showOff(){
        System.out.println(ConsoleColors.CYAN + LogLevel.OFF + ": OFF log level" + ConsoleColors.RESET);
    }

}

