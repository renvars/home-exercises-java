package io.codelex.enums.practice.scissorpaperstone;

public enum GameNames {
    ROCK("r"),
    PAPER("p"),
    SCISSOR("s");
    private final String shortName;

    GameNames(String shortName) {
        this.shortName = shortName;
    }

    public static GameNames getName(String s) {
        for (GameNames name : GameNames.values()) {
            if (s.equals(name.shortName)) {
                return name;
            }

        }
        return null;
    }
}
