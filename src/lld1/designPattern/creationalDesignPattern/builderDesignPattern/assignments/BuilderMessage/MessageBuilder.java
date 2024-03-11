package designPattern.creationalDesignPattern.builderDesignPattern.assignments.BuilderMessage;


public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder messageType (MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder content (String content) {
            this.content = content;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder recipient (String recipient) {
            this.recipient =recipient;
            return this;
        }

        public Builder isDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }
        private Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this.messageType, this.content, this.sender, this.recipient, this.isDelivered,this.timestamp);
        }
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
