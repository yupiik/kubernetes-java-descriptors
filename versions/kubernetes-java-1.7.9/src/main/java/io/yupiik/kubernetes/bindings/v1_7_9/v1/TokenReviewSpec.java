package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import io.yupiik.kubernetes.bindings.v1_7_9.Validable;
import io.yupiik.kubernetes.bindings.v1_7_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TokenReviewSpec implements Validable<TokenReviewSpec> {
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

    public TokenReviewSpec token(final String token) {
        this.token = token;
        return this;
    }

    @Override
    public TokenReviewSpec validate() {
        return this;
    }
}
