package io.yupiik.kubernetes.bindings.v1_11_6.v1;

import java.util.Objects;

public class TokenReviewSpec {
    private String token;

    public TokenReviewSpec() {
        // no-op
    }

    public TokenReviewSpec(final String token) {
        // no-op
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
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewSpec)) {
            return false;
        }
        final TokenReviewSpec __otherCasted = (TokenReviewSpec) __other;
        return Objects.equals(token, __otherCasted.token);
    }
}
