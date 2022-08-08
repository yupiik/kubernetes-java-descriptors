package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.Objects;

public class TokenReviewMetadataInitializersPending {
    private String name;

    public TokenReviewMetadataInitializersPending() {
        // no-op
    }

    public TokenReviewMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewMetadataInitializersPending)) {
            return false;
        }
        final TokenReviewMetadataInitializersPending __otherCasted = (TokenReviewMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
