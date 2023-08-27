import java.util.ArrayList;
// import java.util.List;

public class YouTubeVideo {
    String title;
    String name;
    int views;
    int likes;
    String duration;
    ArrayList<String> comments;

    public YouTubeVideo(String title, String name, int views, int likes, String duration) {
        this.title = title;
        this.name = name;
        this.views = views;
        this.likes = likes;
        this.duration = duration;
        this.comments = new ArrayList<>();
    }

    public void play() {
        System.out.println("Playing: " + title);
        System.out.println("Uploader: " + name);
        System.out.println("Views: " + views);
        System.out.println("Likes: " + likes);
        System.out.println("Duration: " + duration);
        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println("- " + comment);
        }
        System.out.println("---------------------------------");
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void removeVideo() {
        System.out.println("Video \"" + title + "\" removed.");
    }

    public static void main(String[] args) {
        YouTubeVideo video1 = new YouTubeVideo("Introduction to Java Programming",
                "JavaMaster", 10000, 500, "15:30");
        video1.addComment("Great tutorial!");
        video1.addComment("Thanks for sharing!");

        YouTubeVideo video2 = new YouTubeVideo("Python Basics for Beginners",
                "PyCoder", 8000, 450, "12:45");
        video2.addComment("Python is awesome!");
        video2.addComment("I learned a lot from this.");

        video1.play();
        video2.play();

        video1.removeVideo();
    }
}
