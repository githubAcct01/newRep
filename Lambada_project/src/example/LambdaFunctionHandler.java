package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// roleName : myLambdaRole
//s3 bucket name : lambda-buckets3 
//region oregon
//function myfunction
public class LambdaFunctionHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        String output = "hellooo :" + input ;         
        return output;
    }

}
