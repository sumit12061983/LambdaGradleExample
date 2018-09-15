import org.apache.log4j.Logger;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    static final Logger log = Logger.getLogger(Response.class);

    //@JsonProperty("result")
    public long result;

    //@JsonProperty("description")
    public String description;

    public Response(long result, String description) {
        log.info(" Response found => " + result);
        this.result = result;
        this.description = description;
    }

    public Response(String description) {
        this.description = description;
    }

    public Response(long result) {
        this.result = result;
        this.description = "Nothing to show";
    }

    @Override public String toString() {
        return "Response{" + "result=" + result + ", description='" + description + '\'' + '}';
    }
}
