package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Image {

    @SerializedName("height")
    private Integer height = null;

    @SerializedName("url")
    private String url = null;

    @SerializedName("width")
    private Integer width = null;


    /**
     * The image height in pixels. If unknown: null or not returned.
     **/
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    /**
     * The source URL of the image.
     **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * The image width in pixels. If unknown: null or not returned.
     **/
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(height, image.height) &&
                Objects.equals(url, image.url) &&
                Objects.equals(width, image.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, url, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");

        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
