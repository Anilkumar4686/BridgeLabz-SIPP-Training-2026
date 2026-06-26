interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No abusive language is allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String lower = post.toLowerCase();

        return lower.contains("bad") ||
                lower.contains("hate") ||
                lower.contains("abuse");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam posts are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {

        if (TextModeration.containsRestrictedWords(post))
            System.out.println("Offensive Post");
    }

    @Override
    public void checkSpam(String post) {

        String lower = post.toLowerCase();

        if (lower.contains("buy now") ||
                lower.contains("click here") ||
                lower.contains("free"))
            System.out.println("Spam Post");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class Main {

    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get free gifts!",
                "I hate everyone.",
                "Java interfaces are powerful.",
                "Click here to win free money.",
                "Have a wonderful day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post: " + post);

            boolean offensive =
                    TextModeration.containsRestrictedWords(post);

            boolean spam =
                    post.toLowerCase().contains("buy now") ||
                    post.toLowerCase().contains("click here") ||
                    post.toLowerCase().contains("free");

            if (spam)
                System.out.println("Result: Spam Post");
            else if (offensive)
                System.out.println("Result: Offensive Post");
            else
                System.out.println("Result: Valid Post");

            System.out.println();
        }
    }
}