package pl.degath.message.command;

import pl.degath.message.infrastructure.Command;
import pl.degath.message.infrastructure.Validator;

public class CreateMessage implements Command {

    private final String email;
    private final String title;
    private final String content;
    private final int magicNumber;

    public CreateMessage(String email, String title, String content, int magicNumber) {
        this.email = Validator.validEmail(email, "Message email is required. Has to be a valid email address.");
        this.title = Validator.notBlank(title, "Message title is required. Cannot be blank.");
        this.content = Validator.notBlank(content, "Message content is required. Cannot be blank.");
        this.magicNumber = magicNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getMagicNumber() {
        return magicNumber;
    }
}
