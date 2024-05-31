package designPattern.DesignPatternPractice;

public class DatabaseBuilder {
    private String hostname;
    private int port;
    private String username;
    private String password;

    public DatabaseBuilder() {
    }

    public static  class Builder  {
        private String hostname;
        private int port;
        private String username;
        private String password;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public DatabaseBuilder build() {
            DatabaseBuilder dbBuilder = new DatabaseBuilder();
            dbBuilder.hostname = this.hostname;
            dbBuilder.port = this.port;
            dbBuilder.password = this.password;
            dbBuilder.username = this.username;

            return dbBuilder;
        }
    }

    @Override
    public String toString() {
        return "Builder{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
