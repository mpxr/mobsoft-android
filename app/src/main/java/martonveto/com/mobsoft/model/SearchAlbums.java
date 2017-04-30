package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Present if the type of search includes &#39;album&#39;.
 **/
public class SearchAlbums {

    @SerializedName("next")
    private String next = null;

    @SerializedName("total")
    private Integer total = null;

    @SerializedName("offset")
    private Integer offset = null;

    @SerializedName("previous")
    private String previous = null;

    @SerializedName("limit")
    private Integer limit = null;

    @SerializedName("href")
    private String href = null;

    @SerializedName("items")
    private List<AlbumSimple> items = new ArrayList<AlbumSimple>();


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
     * The total number of items available to return.
     **/
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
     * The maximum number of items in the response (as set in the query or by default).
     **/
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchAlbums searchAlbums = (SearchAlbums) o;
        return Objects.equals(next, searchAlbums.next) &&
                Objects.equals(total, searchAlbums.total) &&
                Objects.equals(offset, searchAlbums.offset) &&
                Objects.equals(previous, searchAlbums.previous) &&
                Objects.equals(limit, searchAlbums.limit) &&
                Objects.equals(href, searchAlbums.href) &&
                Objects.equals(items, searchAlbums.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, total, offset, previous, limit, href, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAlbums {\n");

        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
