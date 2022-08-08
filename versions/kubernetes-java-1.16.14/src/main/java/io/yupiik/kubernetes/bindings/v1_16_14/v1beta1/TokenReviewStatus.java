package io.yupiik.kubernetes.bindings.v1_16_14.v1beta1;

import java.util.List;
import java.util.Objects;

public class TokenReviewStatus {
    private List<String> audiences;
    private Boolean authenticated;
    private String error;
    private TokenReviewStatusUser user;

    public TokenReviewStatus() {
        // no-op
    }

    public TokenReviewStatus(final List<String> audiences,
                             final Boolean authenticated,
                             final String error,
                             final TokenReviewStatusUser user) {
        // no-op
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(final Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public TokenReviewStatusUser getUser() {
        return user;
    }

    public void setUser(final TokenReviewStatusUser user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                authenticated,
                error,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewStatus)) {
            return false;
        }
        final TokenReviewStatus __otherCasted = (TokenReviewStatus) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(authenticated, __otherCasted.authenticated) &&
            Objects.equals(error, __otherCasted.error) &&
            Objects.equals(user, __otherCasted.user);
    }
}
