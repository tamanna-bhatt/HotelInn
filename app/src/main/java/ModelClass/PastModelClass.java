package ModelClass;

/**
 * Created by wolfsoft5 on 26/5/18.
 */

public class PastModelClass {

    String title,subtitle;

    public PastModelClass(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
