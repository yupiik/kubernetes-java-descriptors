package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import io.yupiik.kubernetes.bindings.v1_22_6.Validable;
import io.yupiik.kubernetes.bindings.v1_22_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TokenRequestSpec implements Validable<TokenRequestSpec> {
    private List<String> audiences;
    private BoundObjectReference boundObjectRef;
    private Integer expirationSeconds;

    public TokenRequestSpec() {
        // no-op
    }

    public TokenRequestSpec(final List<String> audiences,
                            final BoundObjectReference boundObjectRef,
                            final Integer expirationSeconds) {
        // no-op
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public BoundObjectReference getBoundObjectRef() {
        return boundObjectRef;
    }

    public void setBoundObjectRef(final BoundObjectReference boundObjectRef) {
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

    public TokenRequestSpec audiences(final List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenRequestSpec boundObjectRef(final BoundObjectReference boundObjectRef) {
        this.boundObjectRef = boundObjectRef;
        return this;
    }

    public TokenRequestSpec expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    @Override
    public TokenRequestSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (audiences == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "audiences", "audiences",
                "Missing 'audiences' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
