public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (isNameTooShort()) return false;
        if (isNameTooLong()) return false;
        if (isNotExactOneSpaceInName()) return false;
        if (isNameStartsWithSpace()) return false;
        if (isNameEndsWithSpace()) return false;
        return true;
    }

    private boolean isNameTooShort() {
        return name.length() < 3;
    }

    private boolean isNameTooLong() {
        return name.length() > 19;
    }

    private boolean isNotExactOneSpaceInName() {
        int indexOfFirstSpace = name.indexOf(" ");
        if (indexOfFirstSpace == -1) return true;
        if (indexOfFirstSpace + 1 > name.length()) return false;
        return name.substring(indexOfFirstSpace + 1).contains(" ");
    }

    private boolean isNameStartsWithSpace() {
        return name.startsWith(" ");
    }

    private boolean isNameEndsWithSpace() {
        return name.endsWith(" ");
    }
}