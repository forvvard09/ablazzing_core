package homeworks.lesson04HW.test;

public class Account {

    private String userId;
    private String token;

    private Account() {
        // private constructor
    }

    public static Builder newBuilder() {
        return new Builder(new Account());
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public static class Builder {
        private final Account newAccount;


        private Builder(Account account) {
            newAccount = account;
        }

        public Builder setUserId(String userId) {
            newAccount.userId = userId;

            return this;
        }

        public Builder setToken(String token) {
            newAccount.token = token;

            return this;
        }

        public Account build() {
            return newAccount;
        }

    }

}
