package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class AlbumSimplePage {

    @SerializedName("href")
    private String href = null;

    @SerializedName("items")
    private List<AlbumSimple> items = new ArrayList<AlbumSimple>();

    @SerializedName("limit")
    private Integer limit = null;

    @SerializedName("next")
    private String next = null;

    @SerializedName("offset")
    private Integer offset = null;

    @SerializedName("previous")
    private String previous = null;

    @SerializedName("total")
    private Integer total = null;


    /**
     * A link to the Web API endpoint returning the full result of the request.
     **/
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    /**
     * The requested data.
     **/
    public List<AlbumSimple> getItems() {
        return items;
    }

    public void setItems(List<AlbumSimple> items) {
        this.items = items;
    }


    /**
     * The maximum number of items in the response (as set in the query or by default).
     **/
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    /**
     * URL to the next page of items. (null if none)
     **/
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }


    /**
     * The offset of the items returned (as set in the query or by default).
     **/
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    /**
     * URL to the previous page of items. (null if none)
     **/
    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }


    /**
     * The total number of items available to return.
     **/
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlbumSimplePage albumSimplePage = (AlbumSimplePage) o;
        return Objects.equals(href, albumSimplePage.href) &&
                Objects.equals(items, albumSimplePage.items) &&
                Objects.equals(limit, albumSimplePage.limit) &&
                Objects.equals(next, albumSimplePage.next) &&
                Objects.equals(offset, albumSimplePage.offset) &&
                Objects.equals(previous, albumSimplePage.previous) &&
                Objects.equals(total, albumSimplePage.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, items, limit, next, offset, previous, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlbumSimplePage {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
