package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.List;
import java.util.Objects;

public class TokenReviewSpec {
    private List<String> audiences;
    private String token;

    public TokenReviewSpec() {
        // no-op
    }

    public TokenReviewSpec(final List<String> audiences,
                           final String token) {
        // no-op
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewSpec)) {
            return false;
        }
        final TokenReviewSpec __otherCasted = (TokenReviewSpec) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(token, __otherCasted.token);
    }
}
