package gov.nasa.jpl.mbee.mdk.mms.endpoints;

import java.net.URISyntaxException;

public class MMSValidateJwtToken extends MMSEndpoint {
    public MMSValidateJwtToken(String baseUri) throws URISyntaxException {
        super(baseUri);
    }

    public static Builder builder() {
        return new ValidateJwtTokenBuilder();
    }

    public static class ValidateJwtTokenBuilder extends Builder {
        @Override
        public void prepareUriPath() {
            uriBuilder.setPath(uriBuilder.getPath() + MMSEndpointType.VALIDATETOKEN.getPath());
            uriBuilder.clearParameters();
        }
    }
}
