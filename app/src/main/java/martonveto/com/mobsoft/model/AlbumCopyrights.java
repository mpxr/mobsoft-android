package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class AlbumCopyrights {

    @SerializedName("text")
    private String text = null;

    @SerializedName("type")
    private String type = null;


    /**
     * The copyright text for this album.
     **/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    /**
     * The type of copyright: C = the copyright, P = the sound recording (performance) copyright.
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlbumCopyrights albumCopyrights = (AlbumCopyrights) o;
        return Objects.equals(text, albumCopyrights.text) &&
                Objects.equals(type, albumCopyrights.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlbumCopyrights {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
