package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp";
        String username = "vicky";
        String response = example.run(gradeAPISignUpURL,"username",username);
        System.out.println(response);
    }
}

//token=YoqA8e1JLBK0BJ4vs79FL8TX2uS50zZ8
