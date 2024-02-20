package lol.etil2jz.puissance4;

public class Couleur {

    public static final String palette(String color) {
        switch (color) {
            case "black":
                return "\u001B[30m";
            case "red":
                return "\u001B[31m";
            case "green":
                return "\u001B[32m";
            case "yellow":
                return "\u001B[33m";
            case "blue":
                return "\u001B[34m";
            case "magenta":
                return "\u001B[35m";
            case "cyan":
                return "\u001B[36m";
            case "white":
                return "\u001B[37m";
            case "bright_red":
                return "\u001B[91m";
            case "bright_green":
                return "\u001B[92m";
            case "bright_yellow":
                return "\u001B[93m";
            case "bright_blue":
                return "\u001B[94m";
            case "bright_magenta":
                return "\u001B[95m";
            case "bright_cyan":
                return "\u001B[96m";
            case "bright_white":
                return "\u001B[97m";
            default:
                return "\u001B[0m";
        }
    }

}
