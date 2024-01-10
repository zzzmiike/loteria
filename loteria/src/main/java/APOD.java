import com.fasterxml.jackson.annotation.JsonProperty;

public class APOD {
    public final String copyrigth;
    public final String date;
    public final String explanation;
    public final String hdUrl;
    public final String mediaType;
    public final String serviceVersion;
    public final String title;
    public final String url;

    public APOD(@JsonProperty("copyright") String copyright,
                @JsonProperty("date") String date,
                @JsonProperty("explanation") String explanation,
                @JsonProperty("hdUrl") String hdUrl,
                @JsonProperty("mediaType") String mediaType,
                @JsonProperty("serviceVersion") String serviceVersion,
                @JsonProperty("title") String title,
                @JsonProperty("url") String url) {
        this.copyrigth = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdUrl = hdUrl;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }
}
