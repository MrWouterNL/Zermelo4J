package nl.mrwouter.zermelo4j;

import nl.mrwouter.zermelo4j.factories.ApiFactory;
import nl.mrwouter.zermelo4j.factories.OAuthTokenFactory;

public enum ApiEndpoint {
    OAUTH_TOKEN("/oauth/token", new OAuthTokenFactory()),
    APPOINTMENT_PARTICIPATIONS("/appointmentparticipations", null),
    APPOINTMENTS("/appointments", null),
    ANNOUNCEMENTS("/announcements", null),
    USER("/users/", null);

    private final String endpoint;
    private final ApiFactory apiFactory;
    ApiEndpoint(String endpoint, ApiFactory apiFactory) {
        this.endpoint = endpoint;
        this.apiFactory = apiFactory;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public ApiFactory getFactory() {
        return this.apiFactory;
    }
}
