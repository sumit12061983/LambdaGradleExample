import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

public class AddNumbers implements RequestHandler<Request, Response>{

    private static final Logger log = Logger.getLogger(AddNumbers.class);
    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override public Response handleRequest(Request input, Context context) {
        log.info("Request received : " + input);
        String description = String.format("Numbers passed in num1 = %d, num2 = %d", input.getNum1(), input.getNum2());
        return new Response(input.getNum1() + input.getNum2(), description);
    }
}
