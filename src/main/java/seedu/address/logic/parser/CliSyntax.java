package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_NRIC = new Prefix("ic/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_DEPARTMENT = new Prefix("d/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_MODE = new Prefix("m/");
    public static final Prefix PREFIX_DATE = new Prefix("date/");
    public static final Prefix PREFIX_APPROVAL = new Prefix("s/");
    public static final Prefix PREFIX_PASSWORD = new Prefix("pwd/");
    public static final Prefix PREFIX_TIME_START = new Prefix("ts/");
    public static final Prefix PREFIX_TIME_END = new Prefix("te/");
    public static final Prefix PREFIX_VENUE = new Prefix("v/");
    public static final Prefix PREFIX_PRIORITYLEVEL = new Prefix("plvl/");
    public static final Prefix PREFIX_WORKINGRATE = new Prefix("wr/");
}
