package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.List;
import java.util.Objects;

public class TokenRequestSpec {
    private List<String> audiences;
    private TokenRequestSpecBoundObjectRef boundObjectRef;
    private Integer expirationSeconds;

    public TokenRequestSpec() {
        // no-op
    }

    public TokenRequestSpec(final List<String> audiences,
                            final TokenRequestSpecBoundObjectRef boundObjectRef,
                            final Integer expirationSeconds) {
        // no-op
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public TokenRequestSpecBoundObjectRef getBoundObjectRef() {
        return boundObjectRef;
    }

    public void setBoundObjectRef(final TokenRequestSpecBoundObjectRef boundObjectRef) {
        this.boundObjectRef = boundObjectRef;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                boundObjectRef,
                expirationSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequestSpec)) {
            return false;
        }
        final TokenRequestSpec __otherCasted = (TokenRequestSpec) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(boundObjectRef, __otherCasted.boundObjectRef) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds);
    }
}
