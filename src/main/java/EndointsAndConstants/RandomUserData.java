package EndointsAndConstants;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUserData {
    public static final String USER_EMAIL = RandomStringUtils.randomAlphanumeric(5) + "@ya.ru";
    public static final String USER_PASSWORD = RandomStringUtils.randomAlphanumeric(7);
    public static final String USER_NAME = RandomStringUtils.randomAlphanumeric(6);
}
